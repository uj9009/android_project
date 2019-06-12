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

    private ClusterManager<CafeInfo> mClusterManager;
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


        mClusterManager = new ClusterManager<>(this, map);
        map.setOnCameraIdleListener(mClusterManager);
        map.setOnMarkerClickListener(mClusterManager);

        //4호선
        mClusterManager.addItem(new CafeInfo(37.581906, 127.001669, "학림다방"));
        mClusterManager.addItem(new CafeInfo(37.582042, 126.999203, "카페 혜화동"));
        mClusterManager.addItem(new CafeInfo( 37.584330, 126.999220, "공공거실"));
        mClusterManager.addItem(new CafeInfo(37.562425, 126.982537, "더 스팟 패뷸러스"));
        mClusterManager.addItem(new CafeInfo(37.563195, 126.983741, "포엠"));
        mClusterManager.addItem(new CafeInfo(37.564653, 126.989968, "MWM"));
        mClusterManager.addItem(new CafeInfo(37.548935, 126.977531, "카페 후암동"));
        mClusterManager.addItem(new CafeInfo(37.547809, 126.975636, "MWM"));
        mClusterManager.addItem(new CafeInfo(37.544676, 126.973164, "MUJABEE"));

        //3호선
        mClusterManager.addItem(new CafeInfo(37.521934, 127.026125, "랑꼬뉴"));
        mClusterManager.addItem(new CafeInfo(37.528500, 127.040080, "플리퍼스"));
        mClusterManager.addItem(new CafeInfo(37.526966, 127.038643, "버터풀앤크리머러스"));
        mClusterManager.addItem(new CafeInfo(37.488546, 127.012744, "카페로비"));
        mClusterManager.addItem(new CafeInfo(37.491534, 127.015576, "몬틸나잇"));
        mClusterManager.addItem(new CafeInfo(37.495082, 127.014445, "커피소"));
        mClusterManager.addItem(new CafeInfo(37.573456, 126.990526, "낯익다"));
        mClusterManager.addItem(new CafeInfo(37.573201, 126.989850, "엘리"));
        mClusterManager.addItem(new CafeInfo(37.573399, 126.989583, "동백양과점"));


//7호선
        mClusterManager.addItem(new CafeInfo(37.507731, 126.727774, "심코히"));
        mClusterManager.addItem(new CafeInfo(37.508184, 126.726536, "디어린"));
        mClusterManager.addItem(new CafeInfo(37.507959, 126.726164, "카페5월19일"));
        mClusterManager.addItem(new CafeInfo(37.543009, 127.070587, "최가커피"));
        mClusterManager.addItem(new CafeInfo(37.538680, 127.077392, "감미품"));
        mClusterManager.addItem(new CafeInfo(37.541521, 127.063340, "암실"));
        mClusterManager.addItem(new CafeInfo(37.518602, 127.030208, "67소호"));
        mClusterManager.addItem(new CafeInfo(37.512922, 127.038863, "꼼다비뛰드"));
        mClusterManager.addItem(new CafeInfo(37.520665, 127.038012, "쎄쎄종"));


//9호선
        mClusterManager.addItem(new CafeInfo(37.505587, 127.023085, "로우어가든"));
        mClusterManager.addItem(new CafeInfo(37.502414, 127.024910, "카페프레도"));
        mClusterManager.addItem(new CafeInfo(37.508921, 127.018114, "카페희다"));
        mClusterManager.addItem(new CafeInfo(37.512022, 126.954478, "카페비러브드"));
        mClusterManager.addItem(new CafeInfo(37.511526, 126.954244, "그런커피"));
        mClusterManager.addItem(new CafeInfo(37.511571, 126.950526, "클라소피"));
        mClusterManager.addItem(new CafeInfo(37.537927, 126.894404, "피크니크"));
        mClusterManager.addItem(new CafeInfo(37.536726, 126.892343, "엘카페커피로스터스"));
        mClusterManager.addItem(new CafeInfo(37.539151, 126.892188, "카페소도시"));





       map.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(37.552961, 126.988153)));
        map.animateCamera(CameraUpdateFactory.zoomTo(11));

    }
}
