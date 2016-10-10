package com.huabeina.pll.huiyu.bean;

/**
 * Created by pll on 2016/8/22.
 */
public class MaterialsBean {
    private String comName;
    private String shopName;
    private String area;
    private String note;
    private String linkman;
    private String phoneNum;
    private String date;
    private boolean isPass;

    public MaterialsBean() {
    }

    public MaterialsBean(String comName, String shopName, String area, String note,
                         String linkman, String phoneNum, String date, boolean isPass) {
        this.comName = comName;
        this.shopName = shopName;
        this.area = area;
        this.note = note;
        this.linkman = linkman;
        this.phoneNum = phoneNum;
        this.date = date;
        this.isPass = isPass;
    }

    public String getComName() {
        return comName;
    }

    public void setComName(String comName) {
        this.comName = comName;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPass() {
        return isPass;
    }

    public void setIsPass(boolean isPass) {
        this.isPass = isPass;
    }

    @Override
    public String toString() {
        return "Materials{" +
                "comName='" + comName + '\'' +
                ", shopName='" + shopName + '\'' +
                ", area='" + area + '\'' +
                ", note='" + note + '\'' +
                ", linkman='" + linkman + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", date='" + date + '\'' +
                ", isPass=" + isPass +
                '}';
    }
}
