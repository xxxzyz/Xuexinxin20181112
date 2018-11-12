package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:
 */
public class HttpUtil {
     public static String getHttpUrl(String string){
             String textString=null;
             try {
                 URL url=new URL(string);
                 try {
                     HttpURLConnection urlConnection= (HttpURLConnection) url.openConnection();
                     urlConnection.setRequestMethod("GET");
                     urlConnection.setReadTimeout(5000);
                     urlConnection.setConnectTimeout(5000);
                     int responseCode=urlConnection.getResponseCode();
                     if(responseCode==200){
                         textString=streamToString(urlConnection.getInputStream());
                         urlConnection.disconnect();
                     }
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             } catch (MalformedURLException e) {
                 e.printStackTrace();
             }
             return textString;

         }

         private static String streamToString(InputStream inputStream) throws IOException {
             BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));
             StringBuilder stringBuilder=new StringBuilder();
             String str;
             while ((str=bufferedReader.readLine())!=null){
                 stringBuilder.append(str);

             }
             bufferedReader.close();
             return stringBuilder.toString();
         }
}
