package com.qiyc.la;

import org.jetbrains.annotations.Nullable;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okio.BufferedSink;

public class TestActivity {
    OkHttpClient client = new OkHttpClient().newBuilder().build();
    RequestBody body = new RequestBody() {
        @Nullable
        @Override
        public MediaType contentType() {
            return null;
        }

        @Override
        public void writeTo(BufferedSink sink) throws IOException {

        }
    };
    Request request = new Request.Builder().url("https://www.baidu.com").post(body).build();
//    client.newc

//    {
//        try {
//            response = client.newCall(request).execute();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
