package com.huabeina.pll.huiyu.bean;

/**
 * Created by pll on 2016/10/6.
 */
public class MessageBean {
    private int image;
    private String title;
    private String content;
    private String time;

    public MessageBean() {
    }

    public MessageBean(int image, String title, String content, String time) {
        this.image = image;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "MessageBean{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
