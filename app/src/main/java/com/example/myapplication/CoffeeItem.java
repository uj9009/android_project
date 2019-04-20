package com.example.myapplication;

public class CoffeeItem {

    private int profile;  //커피이미지
    private String name; //커피이름
    private  String info; //커피정보

    public int getProfile() {
        return profile;
    }

   /* public void setProfile(int profile){
        this.profile = profile;
    } */

    public String getName() {
        return name;
    }

  /* public void setName(String name){
        this.name = name;
    } */

    public String getInfo() {
        return info;
    }

   /* public  void setInfo(String info){
        this.info = info;
    } */

   public CoffeeItem(int profile, String name, String info) {
        this.profile = profile;
        this.name = name;
        this.info = info;
    }


}
