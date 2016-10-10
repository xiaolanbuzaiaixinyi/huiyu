package com.huabeina.pll.huiyu.activity;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.ActivityRegisterBinding;
import com.huabeina.pll.huiyu.simplecache.ACache;
import com.huabeina.pll.huiyu.utils.CUtils;
import com.huabeina.pll.huiyu.utils.CheckIsPhoneNumber;

public class RegisterActivity extends Activity {

    private ActivityRegisterBinding binding;
    private ACache aCache;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_register);
        binding = DataBindingUtil.setContentView(RegisterActivity.this, R.layout.activity_register);
        aCache = ACache.get(getApplicationContext());
        //设置状态栏颜色
        CUtils.setBarColor(this, "#41CAC2");
        initData();
    }

    private void initData() {
        //返回
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //回鱼平台协议
        binding.protocol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //注册
        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //获取验证码
        binding.btnRegisterCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                String phone = binding.etRegisterPhone.getText().toString();
                if (phone.equals("") != true && CheckIsPhoneNumber.isMobileNum(phone) == true) {
                    binding.btnRegisterCode.setTextAfter("秒后重新获取").setTextBefore("点击获取验证码").setLenght(60 * 1000);
                    aCache.put("phone",true);
                } else {
                    aCache.put("phone",false);
                    Toast.makeText(getApplicationContext(), "电话号码输入有误", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
