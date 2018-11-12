package presenter;

import android.content.SharedPreferences;

import java.util.ArrayList;

import model.LoginModel;
import module.Login;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:
 */
public class LoginPresenter {
  /*
  判断账号密码是否正确
   */
    public void checkLogin(Login login) {
        //正确
        if(login.getUsername().equals("Baway")&&login.getPassword().equals("123")){
            //接口回调(登录成功)
            mMyLoginListener.success();
        } else {
            //登录失败
            mMyLoginListener.failed();
        }
    }
  /*
  判断是否记住密码
   */
    public void isJz(SharedPreferences sharedPreferences) {
        LoginModel loginModel=new LoginModel();
        //获得modeld的数据
        ArrayList<Object> list=loginModel.getSp(sharedPreferences);
      //判断是否记住密码
        if (list.get(2).toString().equals("true")){

            mMyLoginListener.setText(list.get(0).toString(),list.get(1).toString());
        } else {
            mMyLoginListener.cancelText(list.get(0).toString(),list.get(1).toString());
        }
    }

    //定义一个接口
    public interface MyLoginListener{
        void success();
        void failed();
        void setText(String user,String pass);
        void cancelText(String user,String pass);
    }
    private MyLoginListener mMyLoginListener;

    public LoginPresenter(MyLoginListener myLoginListener) {
        mMyLoginListener = myLoginListener;
    }
}
