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
import com.google.maps.android.clustering.ClusterManager;

import java.util.ArrayList;
import java.util.List;


public class Main2Activity extends AppCompatActivity
        implements OnMapReadyCallback {

    private ClusterManager<MyItem> mClusterManager;
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
     /*   LatLng cafe4_1 = new LatLng(37.581906, 127.001669);
        MarkerOptions markerOptions4_1 = new MarkerOptions();
        markerOptions4_1.position(new LatLng(37.581906, 127.001669));
        markerOptions4_1.title("학림다방");
     //   markerOptions2.snippet("한국의 수도");
        map.addMarker(markerOptions4_1);
        map.moveCamera(CameraUpdateFactory.newLatLng(cafe4_1)); */

        List<MarkerOptions> list = new ArrayList<>();
        //4호선
        list.add(new MarkerOptions().title("학림다방").position(new LatLng(37.581906, 127.001669)));
        list.add(new MarkerOptions().title("카페 혜화동").position(new LatLng(37.582042, 126.999203)));
        list.add(new MarkerOptions().title("공공거실").position(new LatLng(37.584500, 127.001669)));
        list.add(new MarkerOptions().title("더 스팟 패뷸러스").position(new LatLng(37.562376, 126.982463)));
        list.add(new MarkerOptions().title("포엠").position(new LatLng(37.563195, 126.983741)));
        list.add(new MarkerOptions().title("MWM").position(new LatLng(37.564653, 126.989968)));
        list.add(new MarkerOptions().title("카페 후암동").position(new LatLng(37.548935, 126.977531)));
        list.add(new MarkerOptions().title("MND coffee").position(new LatLng(37.547809, 126.975636)));
        list.add(new MarkerOptions().title("MUJABEE").position(new LatLng(37.544676, 126.973164)));
        //5호선

        mClusterManager = new ClusterManager<>(this, map);
        map.setOnCameraIdleListener(mClusterManager);
        map.setOnMarkerClickListener(mClusterManager);



        for (int i = 0; i < list.size(); i++) {
            map.addMarker(list.get(i));
        }
       map.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(37.552961, 126.988153)));
        map.animateCamera(CameraUpdateFactory.zoomTo(11));





        // public Marker addMarker(MarkerModel markerModel, boolean )

 /*   @Override
    public void onMapClick(LatLng latLng) {


    } */
    }
}
