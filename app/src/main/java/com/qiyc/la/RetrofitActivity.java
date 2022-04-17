package com.qiyc.la;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;
import com.qiyc.la.network.RetrofitApi;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okhttp_activity);
        TextView tv = findViewById(R.id.tv);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.toutiao.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        RetrofitApi retrofitApi = retrofit.create(RetrofitApi.class);
        Call<ResponseBody> call = retrofitApi.getData2("toutiao_pc","_02B4Z6wo00f01akEGZAAAIDAyg7Z-7mabkGpMB0AAAgZ4d");
//        Call<ResponseBody> call = retrofitApi.getData();
//        try {
//            call.execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Gson gson = new Gson();
                    tv.setText(response.body().string());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
