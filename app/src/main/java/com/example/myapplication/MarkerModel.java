package com.example.myapplication;

public class MarkerModel {
    double lat;
    double lng;
    String title;

    public MarkerModel(double lat, double lng, String title){
        this.lat = lat;
        this.lng = lng;
        this.title = title;
    }

    public  double getLat() {
        return lat;
    }

    public void setLat(double lat){
        this.lat = lat;
    }

    public  double getLng() {
        return lng;
    }

    public void setLng(double lng){
        this.lng = lng;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
