package com.huabeina.pll.huiyu.adapter;

import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.huabeina.pll.huiyu.MainActivity;
import com.huabeina.pll.huiyu.R;
import com.huabeina.pll.huiyu.bean.MenuListBean;
import com.huabeina.pll.huiyu.fragment.CargoFragment;
import com.huabeina.pll.huiyu.fragment.MessageFragment;
import com.huabeina.pll.huiyu.fragment.PersonCenterFragment;
import com.huabeina.pll.huiyu.fragment.ShopFragment;
import com.huabeina.pll.huiyu.fragment.SpinFragment;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;

/**
 * Created by pll on 2016/9/26.
 */
public class LeftListAdapter extends BaseAdapter {

    private ArrayList<MenuListBean> left_list;
    private MainActivity context;
    private DrawerLayout drawerLayout;
    private TextView textView;

    public LeftListAdapter(ArrayList<MenuListBean> left_list,MainActivity context,DrawerLayout drawerLayout,TextView textView){
        this.context = context;
        this.left_list = left_list;
        this.drawerLayout = drawerLayout;
        this.textView = textView;
    }

    @Override
    public int getCount() {
        return left_list.size();
    }

    @Override
    public Object getItem(int position){
        return left_list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent){
        ViewHolder viewHolder;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = View.inflate(context,R.layout.left_list_item,null);
            viewHolder.iv_home = (ImageView) convertView.findViewById(R.id.iv_home);//图标
            viewHolder.tvToday = (TextView) convertView.findViewById(R.id.tvToday);//文字
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        //设置数据
        viewHolder.iv_home.setImageResource(left_list.get(position).getImageView());
        viewHolder.tvToday.setText(left_list.get(position).getMenuName());
        viewHolder.tvToday.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //根据position判断选择
                switch (position){
                    case 0:
                        //首页
                        textView.setText("首页");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame,new SpinFragment()).commit();
                        break;
                    case 1:
                        //现货列表
                        textView.setText("现货列表");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame, new CargoFragment()).commit();
                        break;
                    case 2:
                        //求购信息
                        textView.setText("求购信息");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame, new ShopFragment()).commit();
                        break;
                    case 3:
                        //资源单
                        textView.setText("资源单");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame, new SpinFragment()).commit();
                        break;
                    case 4:
                        //个人中心
                        textView.setText("个人中心");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame, new PersonCenterFragment()).commit();
                        break;
                    case 5:
                        //我的消息
                        textView.setText("我的消息");
                        context.getSupportFragmentManager().beginTransaction().
                                replace(R.id.content_frame, new MessageFragment()).commit();
                        break;
                }
                drawerLayout.closeDrawers();
            }
        });
        //对于listView，注意添加这一行，即可在item上使用高度
        AutoUtils.autoSize(convertView);
        return convertView;
    }

    class ViewHolder{
        ImageView iv_home;
        TextView tvToday;
    }
}
