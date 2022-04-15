package com.qiyc.la

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class OkhttpActivity: AppCompatActivity() {
    var url = "https://www.toutiao.com/hot-event/hot-board/?origin=toutiao_pc&_signature=_02B4Z6wo00f01akEGZAAAIDAyg7Z-7mabkGpMB0AAAgZ4d"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.okhttp_activity);
    }
}