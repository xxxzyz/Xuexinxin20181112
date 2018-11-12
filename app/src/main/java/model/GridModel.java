package model;

import java.net.HttpURLConnection;

import util.HttpUtil;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:
 */
public class GridModel {
    //获得九宫格
    public String getHttpGrid(String textString){
        return HttpUtil.getHttpUrl(textString);
    }
//获得列表
    public String getHttpGoods(String string) {
        return HttpUtil.getHttpUrl(string);
    }
}
