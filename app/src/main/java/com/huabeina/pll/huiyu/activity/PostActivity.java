package com.huabeina.pll.huiyu.activity;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.adapter.FragmentAdapter;
import com.huabeina.pll.huiyu.databinding.ActivityPostBinding;
import com.huabeina.pll.huiyu.fragment.PostBuyFragment;
import com.huabeina.pll.huiyu.fragment.PostResourceFragment;
import com.huabeina.pll.huiyu.fragment.PostShopFragment;
import com.huabeina.pll.huiyu.utils.CUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PostActivity extends FragmentActivity {

    private ActivityPostBinding binding;
    /**
     * 三个fragment集合
     */
    private List<Fragment> mFragmentList;
    /**
     * 通用适配器
     */
    private FragmentAdapter mFragmentAdapter;
    /**
     * ViewPager的当前选中页
     */
    private int currentIndex;
    /**
     * 屏幕的宽度
     */
    private int screenWidth;
    /**
     *  发布现货，上传资源单，发布求购
     */
    private PostResourceFragment mPostResourceFragment;
    private PostBuyFragment mPostBuyFragment;
    private PostShopFragment mPostShopFragment;

    /**
     * radiobutton对应的集合
     */
    private ArrayList<RadioButton> rbList;

    /**
     * 每个radiobutton对应的position
     */
    private HashMap<Integer,Integer> rbIdList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);//无标题
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_post);
        binding = DataBindingUtil.setContentView(PostActivity.this,R.layout.activity_post);
        //设置状态栏颜色
        CUtils.setBarColor(this,"#41CAC2");
        initData();
        initTabLineWidth(3);
    }

    private void initTabLineWidth(int number) {
        DisplayMetrics dpMetrics = new DisplayMetrics();
        getWindow().getWindowManager().getDefaultDisplay()
                .getMetrics(dpMetrics);
        screenWidth = dpMetrics.widthPixels;
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) binding.mTabLineIv
                .getLayoutParams();
        lp.width = screenWidth / number;
        binding.mTabLineIv.setLayoutParams(lp);
    }

    private void initData() {
        //返回
        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        //加载数据
        initDataForFragment();
        mFragmentAdapter = new FragmentAdapter(this.getSupportFragmentManager(), mFragmentList);
        binding.vpPost.setAdapter(mFragmentAdapter);
        binding.vpPost.setOnPageChangeListener(new ViewPager.OnPageChangeListener(){
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                tabImgSlideDistance(positionOffset, position, 3);
            }

            @Override
            public void onPageSelected(int position) {
                resetTextView();
                resetTextColorChecked(position);
                currentIndex = position;
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        /**
         * radiogroup切换状态的监听
         */
        binding.rgPost.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId){
                vpCheckById(checkedId);
            }
        });
    }

    private void vpCheckById(int number){
        binding.vpPost.setCurrentItem(rbIdList.get(number));
    }

    private void resetTextColorChecked(int position){
        rbList.get(position).setTextColor(Color.parseColor("#ff0000"));
    }

    /**
     * 重置颜色
     */
    private void resetTextView(){
        binding.rbPostBuy.setTextColor(Color.parseColor("#777777"));
        binding.rbPostResource.setTextColor(Color.parseColor("#777777"));
        binding.rbPostShop.setTextColor(Color.parseColor("#777777"));
    }

    private void tabImgSlideDistance(float positionOffset, int position, int number){
        LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) binding.mTabLineIv
                .getLayoutParams();
        if(position == currentIndex){
            lp.leftMargin = (int) (positionOffset * (screenWidth * 1.0 / number) + currentIndex
                    * (screenWidth / number));
        }else if(currentIndex>position){
            lp.leftMargin = (int) (-(1 - positionOffset)
                    * (screenWidth * 1.0 / number) + currentIndex
                    * (screenWidth / number));
        }
        binding.mTabLineIv.setLayoutParams(lp);
    }

    private void initDataForFragment() {
        mFragmentList = new ArrayList<>();
        mPostBuyFragment = new PostBuyFragment();
        mPostResourceFragment = new PostResourceFragment();
        mPostShopFragment = new PostShopFragment();
        mFragmentList.add(mPostResourceFragment);
        mFragmentList.add(mPostBuyFragment);
        mFragmentList.add(mPostShopFragment);
        rbList = new ArrayList<>();
        rbList.add(binding.rbPostResource);
        rbList.add(binding.rbPostBuy);
        rbList.add(binding.rbPostShop);
        rbIdList = new HashMap<>();
        rbIdList.put(R.id.rb_post_resource,0);
        rbIdList.put(R.id.rb_post_buy,1);
        rbIdList.put(R.id.rb_post_shop,2);
    }
}
