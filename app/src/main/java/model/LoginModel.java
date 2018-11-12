package model;

import android.content.SharedPreferences;

import java.util.ArrayList;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:
 */
public class LoginModel {

    public void setJzSp(SharedPreferences.Editor editor, String user, String pass) {
        editor.putString("user",user);
       editor.putString("pass",pass);
        editor.putBoolean("jz",true);
        editor.commit();
    }

    public void cancelJzSp(SharedPreferences.Editor editor, String user, String pass) {
        editor.putString("user","");
        editor.putString("pass","");
        editor.putBoolean("jz",false);
        editor.commit();
    }
}
