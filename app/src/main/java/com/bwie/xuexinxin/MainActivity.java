package com.bwie.xuexinxin;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

import model.LoginModel;
import module.Login;
import presenter.LoginPresenter;

/*
实现登录
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener, LoginPresenter.MyLoginListener {

    private EditText ed_username;
    private EditText ed_password;
    private CheckBox ck_jz;
    private Button but_login;
    private LoginPresenter mLoginPresenter;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private LoginModel mLoginModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        initView();
        mLoginPresenter=new LoginPresenter(this);

        mSharedPreferences=getSharedPreferences("xxx",MODE_PRIVATE);


        //判断是否记住密码
        mLoginPresenter.isJz(mSharedPreferences);


    }
/*
初始化控件
 */
    private void initView() {
        ed_username = (EditText) findViewById(R.id.ed_username);
        ed_password = (EditText) findViewById(R.id.ed_password);
        ck_jz = (CheckBox) findViewById(R.id.ck_jz);
        but_login = (Button) findViewById(R.id.but_login);

        but_login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_login:
               String user=ed_username.getText().toString().trim();
               String pass=ed_password.getText().toString().trim();
                Login login=new Login(user,pass);
                login.setUsername(user);
                login.setPassword(pass);
              //判断账号密码是否正确
               mLoginPresenter.checkLogin(login);
                break;
        }
    }
 /*
 登录成功
  */
    @Override
    public void success() {
        //登录成功跳转
        startActivity(new Intent(MainActivity.this,SuccessActivity.class));
        finish();
         Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_SHORT).show();
         mEditor=mSharedPreferences.edit();
         if(ck_jz.isChecked()){
             mLoginModel = new LoginModel();
             mLoginModel.setJzSp(mEditor,ed_username.getText().toString(),ed_password.getText().toString());

         } else {
             mLoginModel.cancelJzSp(mEditor,ed_username.getText().toString(),ed_password.getText().toString());

         }


    }
/*
登录失败
 */
    @Override
    public void failed() {
      Toast.makeText(MainActivity.this,"用户名或密码错误",Toast.LENGTH_SHORT).show();
    }
/*
记住密码设置文本
 */
    @Override
    public void setText(String user,String pass) {
        ed_username.setText(user);
        ed_password.setText(pass);
        ck_jz.setChecked(true);
    }
/*
取消记住密码设置文本
 */
    @Override
    public void cancelText(String user,String pass) {
        ed_username.setText("");
        ed_password.setText("");
        ck_jz.setChecked(false);
    }


}
