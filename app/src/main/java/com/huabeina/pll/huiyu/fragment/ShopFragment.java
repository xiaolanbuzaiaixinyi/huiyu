package com.huabeina.pll.huiyu.fragment;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.adapter.ShopAdapter;
import com.huabeina.pll.huiyu.databinding.FragShopBinding;
import com.huabeina.pll.huiyu.provider.DataProvider;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;
import com.jude.easyrecyclerview.decoration.DividerDecoration;

/**
 * Created by pll on 2016/10/7.
 */
public class ShopFragment extends Fragment implements
        RecyclerArrayAdapter.OnLoadMoreListener,SwipeRefreshLayout.OnRefreshListener{

    private FragShopBinding binding;
    private ShopAdapter adapter;
    private Handler handler = new Handler();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        super.onCreateView(inflater, container, savedInstanceState);
//        View view = inflater.inflate(R.layout.frag_shop, container,false);
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_shop, container, false);

        initData();

        return binding.getRoot();
    }

    private void initData() {
        binding.shopErv.setLayoutManager(new LinearLayoutManager(getActivity()));
        adapter = new ShopAdapter(getActivity());
        binding.shopErv.setAdapterWithProgress(adapter);
        //加载更多
        adapter.setMore(R.layout.view_more,this);
        //设置没有更多的视图
        adapter.setNoMore(R.layout.view_nomore);
        //加载错误
        adapter.setError(R.layout.view_error).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                adapter.resumeMore();
            }
        });
        /**
         * 设置分割线
         */
        DividerDecoration itemDecoration = new DividerDecoration(Color.parseColor("#eeeeee"),30,0,0);
        itemDecoration.setDrawLastItem(false);
        //有时候你不想让最后一个item有分割线,默认true.
        binding.shopErv.addItemDecoration(itemDecoration);
        binding.shopErv.setRefreshListener(this);
        onRefresh();

    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onLoadMore() {
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                adapter.addAll(DataProvider.getShopList());
            }
        }, 1000);
    }

    @Override
    public void onRefresh() {
        adapter.clear();
        adapter.addAll(DataProvider.getShopList());
    }
}
