package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WorldAdapter extends BaseAdapter {

    private LayoutInflater inflater2;
    private ArrayList<WorldItem> data2; //Item 목록을 담을 배열
    private int layout2;

    public WorldAdapter(Context context, int layout2, ArrayList<WorldItem> data2) {
        this.inflater2 = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data2 = data2;
        this.layout2 = layout2;
    }

    @Override
    public int getCount() {
        return data2.size();
    }

    @Override
    public Object getItem(int position) {
        return data2.get(position).getWorldinfo();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater2.inflate(layout2, parent, false);
        }
        WorldItem worldItem = data2.get(position);

        // 이미지 파일 연동
        ImageView worldpro = (ImageView)convertView.findViewById(R.id.worldpro);
        worldpro.setImageResource(worldItem.getWorldpro());

        //이름 연동
        TextView worldname = (TextView)convertView.findViewById(R.id.worldname);
        worldname.setText(worldItem.getWorldname());

        //정보 연동
        TextView worldinfo = (TextView)convertView.findViewById(R.id.worldinfo);
        worldinfo.setText(worldItem.getWorldinfo());

        return convertView;
    }
}
