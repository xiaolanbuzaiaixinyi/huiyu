package com.huabeina.pll.huiyu.bean;

/**
 * Created by pll on 2016/9/26.
 */
public class MenuListBean {
    private Integer imageView;
    private String menuName;

    public MenuListBean() {
    }

    public MenuListBean(Integer imageView, String menuName) {
        this.imageView = imageView;
        this.menuName = menuName;
    }

    public Integer getImageView() {
        return imageView;
    }

    public void setImageView(Integer imageView) {
        this.imageView = imageView;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public String toString() {
        return "MenuListBean{" +
                "imageView=" + imageView +
                ", menuName='" + menuName + '\'' +
                '}';
    }
}
