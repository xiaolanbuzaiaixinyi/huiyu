package com.huabeina.pll.huiyu.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.databinding.FragHomeBinding;

/**
 * Created by pll on 2016/9/27.
 */
public class HomeFragment extends Fragment {

    private FragHomeBinding binding;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
//        View view = inflater.inflate(R.layout.frag_home, null);
        binding = DataBindingUtil.inflate(inflater, R.layout.frag_home, container, false);
        initData();

        return binding.getRoot();
    }

    private void initData() {

    }
}
