package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class RefillItem {
    private  String title, tv_sang, tv_jo, tv_ga;
    private int img_title;


    public int getImg_title(){
        return img_title;
    }
    public void setImg_title(int img_title){
        this.img_title = img_title;
    }

    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTv_sang(){
        return tv_sang;
    }
    public void setTv_sang(String tv_sang){
        this.tv_sang = tv_sang;
    }
    public String getTv_jo(){
        return tv_jo;
    }
    public void setTv_jo(String tv_jo){
        this.tv_jo = tv_jo;
    }
    public String getTv_ga(){
        return tv_ga;
    }
    public void setTv_ga(String tv_ga){
        this.tv_ga = tv_ga;
    }

}
