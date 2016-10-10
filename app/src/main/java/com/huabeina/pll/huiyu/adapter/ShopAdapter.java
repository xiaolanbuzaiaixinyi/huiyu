package com.huabeina.pll.huiyu.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.bean.MaterialsBean;
import com.huabeina.pll.huiyu.holder.ShopHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by pll on 2016/10/7.
 */
public class ShopAdapter extends RecyclerArrayAdapter<MaterialsBean> {
    public ShopAdapter(Context context) {
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ShopHolder(parent);
    }
}
