package bwie.com.continuingly.utils;

import android.os.Environment;

import bwie.com.continuingly.MainApplication;

/**
 * date:2019/7/10
 * name:windy
 * function:
 */
public class Constant {
    public final static String APP_ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + MainApplication.getInstance().getPackageName();
    public final static String DOWNLOAD_DIR = "/downlaod/";
}
