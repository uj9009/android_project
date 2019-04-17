package com.example.myapplication;

public class WorldItem {

    private int worldpro;  //나라이미지
    private String worldname; //나라이름
    private  String worldinfo; //나라별커피정보

    public int getWorldpro() {
        return worldpro;
    }

    public String getWorldname() {
        return worldname;
    }

    public String getWorldinfo() {
        return worldinfo;
    }

    public WorldItem(int worldpro, String worldname, String worldinfo) {
        this.worldpro = worldpro;
        this.worldname = worldname;
        this.worldinfo = worldinfo;

    }


}