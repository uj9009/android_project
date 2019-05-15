package com.example.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


public class Main2Activity extends AppCompatActivity
        implements OnMapReadyCallback {
    // 구글맵
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment) fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(final GoogleMap map) {


      // 4호선 cafe 뒤에 숫자는 호선, _몇 번째 카페인지 나타내는 숫자
        // 1번째
        LatLng cafe4_1 = new LatLng(37.581906, 127.001669);

        MarkerOptions markerOptions4_1 = new MarkerOptions();
        markerOptions4_1.position(cafe4_1);
        markerOptions4_1.title("학림다방");
     //   markerOptions2.snippet("한국의 수도");
        map.addMarker(markerOptions4_1);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_1));


     // 2번째
        LatLng cafe4_2 = new LatLng(37.582042, 126.999882);

        MarkerOptions markerOptions4_2 = new MarkerOptions();
        markerOptions4_2.position(cafe4_2);
        markerOptions4_2.title("카페 혜화동");
      //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_2);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_2));

        // 3번째
        LatLng cafe4_3 = new LatLng(37.584500, 126.999203);

        MarkerOptions markerOptions4_3 = new MarkerOptions();
        markerOptions4_3.position(cafe4_3);
        markerOptions4_3.title("공공거실");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_3);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_3));


        map.animateCamera(CameraUpdateFactory.zoomTo(10));
    }
}
