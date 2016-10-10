package com.huabeina.pll.huiyu.activity;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.ActivityForgetBinding;
import com.huabeina.pll.huiyu.simplecache.ACache;
import com.huabeina.pll.huiyu.utils.CUtils;
import com.huabeina.pll.huiyu.utils.CheckIsPhoneNumber;

public class ForgetActivity extends Activity {

    private ActivityForgetBinding binding;
    private ACache aCache;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_forget);
        binding = DataBindingUtil.setContentView(ForgetActivity.this, R.layout.activity_forget);
        aCache = ACache.get(getApplication());
        //设置状态栏颜色
        CUtils.setBarColor(this, "#41CAC2");
        binding.btnForgetGetCode.onCreate(savedInstanceState);
        initListener();
    }

    private void initListener(){
        //返回
        binding.back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

        //获取验证码
        binding.btnForgetGetCode.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //账号
                final String phone = binding.etForgetPhone.getText().toString();
                //验证码
                final String code = binding.etForgetCode.toString();
                //验证码输入正确
                if (phone.equals("") != true && CheckIsPhoneNumber.isMobileNum(phone) == true){
                    //联网发送验证码
                    binding.btnForgetGetCode.setTextAfter("秒后重新获取").setTextBefore("点击获取验证码").setLenght(60 * 1000);
                    aCache.put("phone",true);
                } else{
                    aCache.put("phone",false);
                    Toast.makeText(getApplicationContext(), "电话号码输入有误", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //下一步
        binding.btnForgetCommit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
                startActivity(new Intent(getApplicationContext(),ForgetNextActivity.class));
            }
        });
    }

    @Override
    protected void onDestroy() {
        // TODO Auto-generated method stub
        binding.btnForgetGetCode.onDestroy();
        super.onDestroy();
    }
}
