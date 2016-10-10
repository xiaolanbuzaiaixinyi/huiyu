package com.huabeina.pll.huiyu.provider;

import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.bean.MaterialsBean;
import com.huabeina.pll.huiyu.bean.MessageBean;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pll on 2016/10/6.
 */
public class DataProvider {
    public static List<MessageBean> getMessageList(){
        ArrayList<MessageBean> arr = new ArrayList<>();
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","10.56"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","10.57"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","10.58"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","10.59"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.00"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","09.00"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.50"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.10"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.02"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.01"));
        arr.add(new MessageBean(R.drawable.kenan,"物流信息","订单已发货，请注意查收","11.11"));
        return arr;
    }

    public static List<MaterialsBean> getShopList(){
        ArrayList<MaterialsBean> arr = new ArrayList<>();
        arr.add(new MaterialsBean("杭州华贝纳毛纺染整有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华鼎有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华贝纳毛纺染整有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华鼎有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华贝纳毛纺染整有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华鼎有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华贝纳毛纺染整有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华鼎有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        arr.add(new MaterialsBean("杭州华贝纳毛纺染整有限公司","啥啥啥布","杭州","无","彭龙龙","18367800776","2016-11-11",true));
        return arr;
    }
}
