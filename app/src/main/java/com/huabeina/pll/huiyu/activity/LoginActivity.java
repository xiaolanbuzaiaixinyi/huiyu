package com.huabeina.pll.huiyu.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.ActivityLoginBinding;
import com.huabeina.pll.huiyu.utils.CUtils;

public class LoginActivity extends Activity {

    private ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
        binding = DataBindingUtil.setContentView(LoginActivity.this, R.layout.activity_login);
        //设置状态栏颜色
        CUtils.setBarColor(this, "#41CAC2");
        initListener();
    }

    private void initListener() {
        //返回
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //登录
        binding.btnLoginCommit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //账号密码
                String account = binding.etLoginId.getText().toString();
                String password = binding.etLoginPassword.getText().toString();
                if(account.equals("")){
                    Toast.makeText(getApplicationContext(),"账号不能为空",Toast.LENGTH_SHORT).show();
                }else{
                    if(password.equals("")){
                        Toast.makeText(getApplicationContext(),"密码不能为空",Toast.LENGTH_SHORT).show();
                    }else{
                        //联网判断账号密码
                    }
                }
            }
        });

        //忘记密码
        binding.tvLoginForget.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),ForgetActivity.class));
            }
        });

        //快速注册
        binding.tvLoginRegister.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(getApplicationContext(),RegisterActivity.class));
            }
        });
    }
}
