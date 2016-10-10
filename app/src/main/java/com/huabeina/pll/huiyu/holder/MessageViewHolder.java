package com.huabeina.pll.huiyu.holder;

import android.view.ViewGroup;
import android.widget.TextView;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.bean.MessageBean;
import com.huabeina.pll.huiyu.view.CircleImageView;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by pll on 2016/10/6.
 */
public class MessageViewHolder extends BaseViewHolder<MessageBean>{

    private CircleImageView iv_item_message_icon;
    private TextView tv_item_message_title;
    private TextView tv_item_message_msg;
    private TextView tv_item_message_time;


    public MessageViewHolder(ViewGroup parent){
        super(parent,R.layout.item_message);
        iv_item_message_icon = $(R.id.iv_item_message_icon);
        tv_item_message_title = $(R.id.tv_item_message_title);
        tv_item_message_msg = $(R.id.tv_item_message_msg);
        tv_item_message_time = $(R.id.tv_item_message_time);
    }

    @Override
    public void setData(MessageBean data){
        iv_item_message_icon.setImageResource(data.getImage());
        tv_item_message_title.setText(data.getTitle());
        tv_item_message_msg.setText(data.getContent());
        tv_item_message_time.setText(data.getTime());
    }
}
