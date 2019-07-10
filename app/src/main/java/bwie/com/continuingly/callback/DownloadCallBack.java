package bwie.com.continuingly.callback;

/**
 * date:2019/7/10
 * name:windy
 * function:
 */
public interface DownloadCallBack {
    void onProgress(int progress);
    void onCompleted();
    void onError(String msg);
}
