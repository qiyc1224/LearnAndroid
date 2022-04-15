package com.qiyc.la;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.bumptech.glide.Glide;
import com.qiyc.la.R;
import com.qiyc.la.databinding.ActivityDatabindingBinding;
import com.qiyc.la.databinding.ActivityMainBinding;
import com.qiyc.la.model.DataBindingModel;

public class BindingActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_databinding);
        ActivityDatabindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
        DataBindingModel model = new DataBindingModel();
        model.setName("深田永美");
        model.setAge("25");
        model.setImg("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201808%2F25%2F20180825133506_eedrr.jpg&refer=http%3A%2F%2Fb-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652627527&t=251ac9ea0c718b3988cab6429b2a4e53");

        binding.setStart(model);
        Glide.with(this).load(model.img).into(binding.ivImg);
    }
}
