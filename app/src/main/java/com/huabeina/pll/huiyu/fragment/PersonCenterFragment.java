package com.huabeina.pll.huiyu.fragment;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.activity.PostActivity;
import com.huabeina.pll.huiyu.databinding.FragPersonCenterBinding;

/**
 * Created by pll on 2016/10/8.
 */
public class PersonCenterFragment extends Fragment {

    private FragPersonCenterBinding binding;
    private Intent intent;//需要启动的界面

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
//        View view = inflater.inflate(R.layout.frag_person_center, container,false);
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_person_center, container, false);

        initData();

        return binding.getRoot();
    }

    private void initData(){
        //我要发布
        binding.pcRelease.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                intent = new Intent(getActivity(),PostActivity.class);
                startActivity(intent);
            }
        });

        //现货记录
        binding.pcNowList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //资源单管理
        binding.pcResource.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //求购记录
        binding.pcShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //客户采购订单
        binding.pcRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //现货采购订单
        binding.pcSelect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //我的报价
        binding.pcManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //信息补充
        binding.pcSettingManage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //修改密码
        binding.pcPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //消息
        binding.pcMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
    }
}
