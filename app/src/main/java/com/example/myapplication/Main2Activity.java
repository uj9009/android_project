package com.example.myapplication;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;


public class Main2Activity extends AppCompatActivity
        implements OnMapReadyCallback, GoogleMap.OnMapClickListener {
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


        // 4번째
        LatLng cafe4_4 = new LatLng(37.562376, 126.982463);

        MarkerOptions markerOptions4_4 = new MarkerOptions();
        markerOptions4_4.position(cafe4_4);
        markerOptions4_4.title("더 스팟 패뷸러스");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_4);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_4));

        // 5번째
        LatLng cafe4_5 = new LatLng(37.563195, 126.983741);

        MarkerOptions markerOptions4_5 = new MarkerOptions();
        markerOptions4_5.position(cafe4_5);
        markerOptions4_5.title("포엠");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_5);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_5));

        // 6번째
        LatLng cafe4_6 = new LatLng(37.564653, 126.989968);

        MarkerOptions markerOptions4_6 = new MarkerOptions();
        markerOptions4_6.position(cafe4_6);
        markerOptions4_6.title("MWM");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_6);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_6));

        // 7번째
        LatLng cafe4_7 = new LatLng(37.548935, 126.977531);

        MarkerOptions markerOptions4_7 = new MarkerOptions();
        markerOptions4_7.position(cafe4_7);
        markerOptions4_7.title("카페 후암동");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_7);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_7));

        // 8번째
        LatLng cafe4_8 = new LatLng(37.547809, 126.975636);

        MarkerOptions markerOptions4_8 = new MarkerOptions();
        markerOptions4_8.position(cafe4_8);
        markerOptions4_8.title("MND coffee");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_8);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_8));

        // 9번째
        LatLng cafe4_9 = new LatLng(37.544676, 126.973164);

        MarkerOptions markerOptions4_9 = new MarkerOptions();
        markerOptions4_9.position(cafe4_9);
        markerOptions4_9.title("MUJABEE");
        //  markerOptions1.snippet("한국의 수도");
        map.addMarker(markerOptions4_9);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_9));



        map.animateCamera(CameraUpdateFactory.zoomTo(11));
    }

   // public Marker addMarker(MarkerModel markerModel, boolean )

    @Override
    public void onMapClick(LatLng latLng) {


    }
}
