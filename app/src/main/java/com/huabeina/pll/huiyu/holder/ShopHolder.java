package com.huabeina.pll.huiyu.holder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.bean.MaterialsBean;
import com.jude.easyrecyclerview.adapter.BaseViewHolder;

/**
 * Created by pll on 2016/10/7.
 */
public class ShopHolder extends BaseViewHolder<MaterialsBean> {

    private TextView tv_item_com_name;
    private TextView tv_item_commodity;
    private TextView tv_item_area;
    private TextView tv_item_note;
    private TextView tv_item_phone_num;
    private TextView tv_item_time;
    private Button btn_item_offer;

    public ShopHolder(ViewGroup parent) {
        super(parent,R.layout.item_shop);
        tv_item_com_name = $(R.id.tv_item_com_name);
        tv_item_commodity = $(R.id.tv_item_commodity);
        tv_item_area = $(R.id.tv_item_area);
        tv_item_note = $(R.id.tv_item_note);
        tv_item_phone_num = $(R.id.tv_item_phone_num);
        tv_item_time = $(R.id.tv_item_time);
        btn_item_offer = $(R.id.btn_item_offer);
    }

    @Override
    public void setData(MaterialsBean data) {
        tv_item_com_name.setText(data.getComName());
        tv_item_commodity.setText(data.getShopName());
        tv_item_area.setText(data.getArea());
        tv_item_note.setText(data.getNote());
        tv_item_phone_num.setText(data.getPhoneNum());
        tv_item_time.setText(data.getDate());

        btn_item_offer.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //求购详情
                Toast.makeText(getContext(),"hhh",Toast.LENGTH_SHORT).show();
//                getContext().startActivity(new Intent(getContext(), ShopDetailsActivity.class));
            }
        });
    }
}
