package bwie.com.continuingly;

import android.app.Application;
import android.content.Context;

/**
 * date:2019/7/10
 * name:windy
 * function:
 */
public class MainApplication extends Application {
    private static MainApplication sInstance;
    @Override
    public void onCreate() {
        super.onCreate();
        sInstance=this;
    }
public static Context getInstance(){
return sInstance;
}
}
