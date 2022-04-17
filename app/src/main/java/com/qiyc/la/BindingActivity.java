package com.qiyc.la;

import android.app.Activity;
import android.app.ActivityManager;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.bumptech.glide.Glide;
import com.qiyc.la.R;
import com.qiyc.la.databinding.ActivityDatabindingBinding;
import com.qiyc.la.databinding.ActivityMainBinding;
import com.qiyc.la.model.DataBindingModel;

import java.util.Random;

public class BindingActivity extends AppCompatActivity {
    String url0 = "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201808%2F25%2F20180825133506_eedrr.jpg&refer=http%3A%2F%2Fb-ssl.duitang.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1652627527&t=251ac9ea0c718b3988cab6429b2a4e53";
    String url = "https://ss0.baidu.com/94o3dSag_xI4khGko9WTAnF6hhy/baike/w%3D268/sign=c247bc28738b4710ce2ffacafbcfc3b2/0e2442a7d933c895a9a5dc72d01373f0830200db.jpg";
    String url1 ="https://img1.baidu.com/it/u=61605716,2668248754&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=625";
    ActivityDatabindingBinding binding;
    DataBindingModel model = new DataBindingModel();

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_databinding);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_databinding);
        model.setName("深田永美");
        model.setAge("25");
        model.setImg(url0);
        binding.setStart(model);
        binding.setPresent(new Presenter());
        Glide.with(this).load(url).into(binding.ivImg);
        Glide.with(this).load(model.img).into(binding.includeIc.ivImg);
//        binding.btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.e("======", "onClick: ");
//                model.setName("杏树纱奈");
//            }
//        });


    }
    @BindingAdapter({"name"})
    public static void reloadImg(TextView iv, String name){
        Log.e("=========", "reloadImg: "+ name);
    }
    @BindingAdapter({"android:text"})
    public static void setText(TextView tv,String text){
        tv.setText(text+" come from TokoyoHot");
    }

    public class Presenter{
        public Presenter() {
        }

        public void agchanged(Editable editable){
            if(editable.toString().equals("23333333")){
                Toast.makeText(BindingActivity.this,"深田永美小妹妹",Toast.LENGTH_LONG).show();
            }
        }
        public void onClick(DataBindingModel start) {
            model.setName("橘梨纱");

        }
    }
}
