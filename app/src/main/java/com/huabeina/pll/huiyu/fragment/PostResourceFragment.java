package com.huabeina.pll.huiyu.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.FragPostResourceBinding;

/**
 * Created by pll on 2016/10/8.
 */
public class PostResourceFragment extends Fragment{

    private FragPostResourceBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
//        View view = inflater.inflate(R.layout.frag_post_resource, container,false);
        binding = DataBindingUtil.inflate(inflater,R.layout.frag_post_resource,container,false);

        initData();

        return binding.getRoot();
    }

    private void initData(){
        binding.btnPostBuyCommit.setOnClickListener(new View.OnClickListener(){
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
