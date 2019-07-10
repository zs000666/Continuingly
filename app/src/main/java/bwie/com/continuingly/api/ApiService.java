package bwie.com.continuingly.api;

import io.reactivex.Observable;
import io.reactivex.Observer;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/**
 * date:2019/7/10
 * name:windy
 * function:
 */
public interface ApiService {
    @Streaming
    @GET
    Observable<ResponseBody>executeDownload(@Header("Range")String range, @Url()String url);
}
