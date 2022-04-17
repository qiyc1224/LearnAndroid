package com.qiyc.la;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import okhttp3.*;

import java.io.IOException;

public class OkhttpActivity extends AppCompatActivity {
    String url = "https://www.toutiao.com/hot-event/hot-board/?origin=toutiao_pc&_signature=_02B4Z6wo00f01akEGZAAAIDAyg7Z-7mabkGpMB0AAAgZ4d";
    String url2 = "https://www.toutiao.com/api/pc/list/feed?channel_id=3189398996&min_behot_time=0&refresh_count=1&category=pc_profile_channel&aid=24&app_name=toutiao_web&_signature=_02B4Z6wo02901905JggAAIDCvjPmYNSiKUfdDSKAAJUboufVOkKFSYt9pDkwENOgW6HfEu.kUv3dbobfy0FQIz2WwQYTusqp7XVpLg0C-wr3IpJctt7CINCipuY8u970gEpg4bkhmZrsa0oq45";

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.okhttp_activity);
        TextView tv = findViewById(R.id.tv);
        OkHttpClient client = new OkHttpClient.Builder().build();
        Request request = new Request.Builder().url(url2).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            tv.setText(response.body().string());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
        tv.setText("====================加载中====================");
//                try {
//                    new Thread(new Runnable() {
//                        @Override
//                        public void run() {
//                            try {
//                                Response result = client.newCall(request).execute();
//                                runOnUiThread(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        try {
//                                            tv.setText(result.body().string());
//                                        } catch (IOException e) {
//                                            e.printStackTrace();
//                                        }
//                                    }
//                                });
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//
//                        }
//                    }).start();
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }

    }
}
//class OkhttpActivity: AppCompatActivity() {
//    var url = "https://www.toutiao.com/hot-event/hot-board/?origin=toutiao_pc&_signature=_02B4Z6wo00f01akEGZAAAIDAyg7Z-7mabkGpMB0AAAgZ4d"
//    var url2 ="https://www.toutiao.com/api/pc/list/feed?channel_id=3189398996&min_behot_time=0&refresh_count=1&category=pc_profile_channel&aid=24&app_name=toutiao_web&_signature=_02B4Z6wo02901905JggAAIDCvjPmYNSiKUfdDSKAAJUboufVOkKFSYt9pDkwENOgW6HfEu.kUv3dbobfy0FQIz2WwQYTusqp7XVpLg0C-wr3IpJctt7CINCipuY8u970gEpg4bkhmZrsa0oq45"
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.okhttp_activity);
//        var tv = findViewById<TextView>(R.id.tv)
//        var okHttpClient = OkHttpClient()
//        var request = Request.Builder().url(url2).build()
////        Thread(Runnable {
////            var result = okHttpClient.newCall(request).execute();
////            runOnUiThread {
////                tv.text = result.toString()
////            }
////        }).run()
//        okHttpClient.newCall(request).enqueue(object : Callback {
//            override fun onFailure(call: Call, e: IOException) {
//            }
//
//            override fun onResponse(call: Call, response: Response) {
//                runOnUiThread {
//                    tv.text = response.toString()
//                }
//            }
//        })
//
//    }
//}