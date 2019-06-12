package com.example.myapplication;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;

public class CafeInfo implements ClusterItem {
    private final LatLng mPosition;
    String title;

    public CafeInfo(double lat, double lng, String title){
        mPosition = new LatLng(lat, lng);
        this.title = title;
    }

    @Override
    public LatLng getPosition() {
        return mPosition;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getSnippet() {
        return null;
    }
}
