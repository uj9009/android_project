package com.example.myapplication;

public class CoffeeItem {

    private int profile, profile2;  //커피이미지
    private String name; //커피이름
    private  String info; //커피정보

    public int getProfile() {
        return profile;
    }

   /* public void setProfile(int profile){
        this.profile = profile;
    } */

   public  int getProfile2() { return profile2;}

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

   public CoffeeItem(int profile, int profile2, String name, String info) {
        this.profile = profile;
        this.profile2 = profile2;
        this.name = name;
        this.info = info;
    }


}
