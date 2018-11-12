package app;

import android.app.Application;
import android.graphics.Bitmap;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.uuzuche.lib_zxing.activity.ZXingLibrary;

/**
 * date:2018/11/12
 * author:薛鑫欣(吧啦吧啦)
 * function:ImageLoader配置
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ZXingLibrary.initDisplayOpinion(this);
        ImageLoader.getInstance().init(
                new ImageLoaderConfiguration.Builder(this)
                        .memoryCacheSizePercentage(10)
                        .diskCacheSize(50*1024*1024)
                        .defaultDisplayImageOptions(new DisplayImageOptions.Builder()
                                .cacheOnDisk(true)
                                .cacheInMemory(true)
                                .bitmapConfig(Bitmap.Config.RGB_565)
                                .imageScaleType(ImageScaleType.EXACTLY_STRETCHED)
                                .build()


                        )
                        .build()

        );
    }
}
