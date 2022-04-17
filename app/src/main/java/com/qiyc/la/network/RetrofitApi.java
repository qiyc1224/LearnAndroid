package com.qiyc.la.network;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetrofitApi {
    @GET("/hot-event/hot-board/?origin=toutiao_pc&_signature=_02B4Z6wo00f01akEGZAAAIDAyg7Z-7mabkGpMB0AAAgZ4d")
    Call<ResponseBody> getData();

//    @FormUrlEncoded
    @GET("/hot-event/hot-board/")
    Call<ResponseBody> getData2(@Query("origin") String path, @Query("_signature") String key);
}
