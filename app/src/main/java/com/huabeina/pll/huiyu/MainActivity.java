package com.huabeina.pll.huiyu;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.View;
import android.view.Window;

import com.huabeina.pll.huiyu.activity.LoginActivity;
import com.huabeina.pll.huiyu.adapter.LeftListAdapter;
import com.huabeina.pll.huiyu.bean.MenuListBean;
import com.huabeina.pll.huiyu.databinding.ActivityMainBinding;
import com.huabeina.pll.huiyu.fragment.AboutFragment;
import com.huabeina.pll.huiyu.utils.CUtils;

import java.util.ArrayList;


public class MainActivity extends FragmentActivity {

    private ActivityMainBinding binding;
    private LeftListAdapter leftListAdapter;
    private ArrayList<MenuListBean> left_list;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        requestWindowFeature(Window.FEATURE_NO_TITLE);//无标题
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(MainActivity.this, R.layout.activity_main);
        //设置状态栏颜色
        CUtils.setBarColor(this, "#41CAC2");
        // 初始化菜单列表
        dataForLeftMenu();
        data();
    }

    private void data() {

    }


    /**
     * 设置左侧菜单栏数据
     */
    private void dataForLeftMenu(){
        left_list = new ArrayList<>();
        left_list.add(new MenuListBean(R.drawable.home, "首页"));//首页
        left_list.add(new MenuListBean(R.drawable.car, "现货列表"));//现货列表
        left_list.add(new MenuListBean(R.drawable.buy_info, "求购信息"));//求购信息
        left_list.add(new MenuListBean(R.drawable.list, "资源单"));//资源单
        left_list.add(new MenuListBean(R.drawable.user_center, "个人中心"));//个人中心
        left_list.add(new MenuListBean(R.drawable.my_message, "我的消息"));//我的消息
        leftListAdapter = new LeftListAdapter(left_list,MainActivity.this,binding.drawerLayout,binding.topTv);
        binding.leftDrawer.setAdapter(leftListAdapter);

        //导航栏打开侧滑
        binding.topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.drawerLayout.openDrawer(Gravity.LEFT);
            }
        });

        //关于
        binding.tvSetting.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                binding.topTv.setText("关于");
                getSupportFragmentManager().beginTransaction().
                        replace(R.id.content_frame, new AboutFragment()).commit();
                binding.drawerLayout.closeDrawers();
            }
        });

        //登录
        binding.tvLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //启动登录页面
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });
    }
}
