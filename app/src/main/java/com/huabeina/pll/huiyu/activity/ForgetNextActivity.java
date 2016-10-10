package com.huabeina.pll.huiyu.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.ActivityForgetNextBinding;
import com.huabeina.pll.huiyu.utils.CUtils;

public class ForgetNextActivity extends Activity{

    private ActivityForgetNextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_forget_next);
        binding = DataBindingUtil.setContentView(ForgetNextActivity.this, R.layout.activity_forget_next);
        //设置状态栏颜色
        CUtils.setBarColor(this, "#41CAC2");

        initListener();
    }

    private void initListener(){
        //返回
        binding.back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                startActivity(new Intent(getApplicationContext(), ForgetActivity.class));
            }
        });

        //上一步
        binding.btnForgetBack.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                startActivity(new Intent(getApplicationContext(), ForgetActivity.class));
            }
        });

        //提交
        binding.btnForgetCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
