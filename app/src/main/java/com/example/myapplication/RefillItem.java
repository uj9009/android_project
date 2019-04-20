package com.example.myapplication;

import android.graphics.drawable.Drawable;

public class RefillItem {
    String titile, tv_sang, tv_jo, tv_ga;
    Drawable img_title;

    public RefillItem(Drawable i, String t, String s, String j, String g){

        img_title = i;
        titile = t;
        tv_ga = g;
        tv_jo = j;
        tv_sang = s;


    }
    public Drawable getImg_title(){
        return img_title;
    }
    public void setImg_title(Drawable i){
        this.img_title = i;
    }

    public String getTitile(){
        return titile;
    }
    public void setTitile(String t){
        this.titile = t;
    }
    public String getTv_sang(){
        return tv_sang;
    }
    public void setTv_sang(String s){
        this.tv_sang = s;
    }
    public String getTv_jo(){
        return tv_jo;
    }
    public void setTv_jo(String j){
        this.tv_jo = j;
    }
    public String getTv_ga(){
        return tv_ga;
    }
    public void setTv_ga(String g){
        this.tv_ga = g;
    }

}
