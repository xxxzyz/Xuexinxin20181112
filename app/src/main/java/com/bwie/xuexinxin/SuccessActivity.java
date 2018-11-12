package com.bwie.xuexinxin;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;

import com.google.gson.Gson;
import com.uuzuche.lib_zxing.activity.CaptureActivity;
import com.uuzuche.lib_zxing.activity.CodeUtils;

import java.util.ArrayList;

import adapter.GoodsAdapter;
import adapter.GridAdapter;
import model.GridModel;
import module.Goods;
import module.Grid;

public class SuccessActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView qrcode;
    private GridView grid, grid2;

    private GridAdapter mGridAdapter;
    private GoodsAdapter mGoodsAdapter;

   // private TextView tv;
    ArrayList<String> list;
    int index=-1;

    private ViewFlipper vf;
    //走马灯Handler
   /* Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                //走马灯
                case 0:
                    if(index<=0){
                        index++;
                        tv.setText(list.get(index));
                        if(index==1){
                            index=-1;
                        }
                    }

                    TranslateAnimation translateAnimation=new TranslateAnimation(0.0f,
                            0.0f,0.0f,80f);
                    translateAnimation.setDuration(1000);
                    tv.startAnimation(translateAnimation);
                    handler.sendEmptyMessageDelayed(0,1000);


                    break;
            }
        }
    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);

        //初始化控件
        initView();
        //设置适配器
        mGridAdapter = new GridAdapter(SuccessActivity.this);
        grid.setAdapter(mGridAdapter);
        mGoodsAdapter = new GoodsAdapter(SuccessActivity.this);
        grid2.setAdapter(mGoodsAdapter);
        //获得九宫格数据
        loadGrid();
        //获得列表数据
        loadGoods();
        //添加走马灯视图
        vf.addView(View.inflate(this,R.layout.pmd,null));
        list=new ArrayList<>();
        list.add("薛鑫欣");
        list.add("张渊卓");
        //发送handler
      // handler.sendEmptyMessageDelayed(0,1000);

    }

    /*
        //获得列表数据
         */
    private void loadGoods() {
        new AsyncTask<String, Void, ArrayList<Goods.DataBean>>() {

            @Override
            protected ArrayList<Goods.DataBean> doInBackground(String... strings) {
                //获得网络请求的数据
                GridModel gridModel = new GridModel();
                String textString = gridModel.getHttpGoods(strings[0]);
                Goods goods = new Gson().fromJson(textString, Goods.class);
                return (ArrayList<Goods.DataBean>) goods.getData();
            }

            @Override
            protected void onPostExecute(ArrayList<Goods.DataBean> dataBeans) {
                super.onPostExecute(dataBeans);

                //展示数据，更新适配器
                mGoodsAdapter.setData(dataBeans);


            }
        }.execute(
                "http://www.wanandroid.com/tools/mockapi/6523/restaurants_offset_0_limit_4"
        );
    }

    /*
    //获得九宫格数据
     */
    private void loadGrid() {
        new AsyncTask<String, Void, Grid>() {

            @Override
            protected Grid doInBackground(String... strings) {
                //获得网络请求的数据
                GridModel gridModel = new GridModel();
                String textString = gridModel.getHttpGrid(strings[0]);
                Grid grid = new Gson().fromJson(textString, Grid.class);

                return grid;
            }

            @Override
            protected void onPostExecute(Grid dataBeans) {
                super.onPostExecute(dataBeans);
                if (dataBeans == null) {
                    return;
                }
                //展示数据，更新适配器
                mGridAdapter.setData((ArrayList<Grid.DataBean>) dataBeans.getData());

            }
        }.execute(
                "http://www.zhaoapi.cn/product/getCatagory"
        );
    }

    /*
    初始化控件
     */
    private void initView() {
        qrcode = (ImageView) findViewById(R.id.qrcode);
        grid = findViewById(R.id.grid);
        grid2 = findViewById(R.id.grid2);
       //tv=findViewById(R.id.tv);
        //设置点击
        qrcode.setOnClickListener(this);
        vf = (ViewFlipper) findViewById(R.id.vf);
        vf.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            //开启二维码扫描
            case R.id.qrcode:
                Intent intent = new Intent(SuccessActivity.this, CaptureActivity.class);
                startActivityForResult(intent, 100);
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //的打开二维码扫描页面
        if (requestCode == 100) {
            if (data != null) {
                Bundle bundle = data.getExtras();//获得数据
                if (bundle == null) {
                    return;
                }
                //有传过来的数据则解析
                //判断是否解析成功
                if (bundle.getInt(CodeUtils.RESULT_TYPE) == CodeUtils.RESULT_SUCCESS) {
                    String result = bundle.getString(CodeUtils.RESULT_STRING);
                    Toast.makeText(SuccessActivity.this, "解析成功" + result, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(SuccessActivity.this, "解析失败", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }
}
