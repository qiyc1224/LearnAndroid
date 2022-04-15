package com.qiyc.la

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Switch
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun gotoNext(view:View){
        when(view.id){
            R.id.okhttp -> {
                var intent =  Intent()
                intent.setClass(this,OkhttpActivity().javaClass)
                startActivity(intent)
            }
            R.id.dataBinding -> {
                var intent =  Intent()
                intent.setClass(this,BindingActivity()::class.java)
                startActivity(intent)
            }
        }
    }
}