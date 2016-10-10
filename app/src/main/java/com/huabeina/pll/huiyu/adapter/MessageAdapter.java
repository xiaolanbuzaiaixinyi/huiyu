package com.huabeina.pll.huiyu.adapter;

import android.content.Context;
import android.view.ViewGroup;

import com.huabeina.pll.huiyu.bean.MessageBean;
import com.huabeina.pll.huiyu.holder.MessageViewHolder;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;
import com.jude.easyrecyclerview.adapter.RecyclerArrayAdapter;

/**
 * Created by pll on 2016/10/6.
 */
public class MessageAdapter extends RecyclerArrayAdapter<MessageBean>{
    public MessageAdapter(Context context){
        super(context);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType){
        return new MessageViewHolder(parent);
    }
}
