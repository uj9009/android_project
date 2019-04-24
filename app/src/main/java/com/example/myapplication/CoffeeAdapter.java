package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CoffeeAdapter extends BaseAdapter {

   private LayoutInflater inflater;
    private ArrayList<CoffeeItem> data; //Item 목록을 담을 배열
    private int layout;

    public CoffeeAdapter(Context context, int layout, ArrayList<CoffeeItem> data) {
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.data = data;
        this.layout = layout;
    }

 /* private ArrayList<CoffeeItem> coffeeItem = new ArrayList<>(); */

    @Override
    public int getCount() {  //리스트 안 Item의 개수를 센다.
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    // 실제로 item이 보여지는 부분
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       /* CustomViewHolder holder;

        if (convertView == null) {
            convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.coffee_item, null, false);

            holder = new CustomViewHolder();
            holder.profile = (ImageView)convertView.findViewById(R.id.profile);
            holder.name = (TextView)convertView.findViewById(R.id.name);
            holder.info = (TextView)convertView.findViewById(R.id.info);

            convertView.setTag(holder);
        } else {
            holder = (CustomViewHolder) convertView.getTag();
        }

        CoffeeItem item = coffeeItem.get(position);

        holder.profile.setImageResource(item.getProfile());
        holder.name.setText(item.getName());
        holder.info.setText(item.getInfo());

        return convertView;
    }

    class CustomViewHolder {
        ImageView profile;
        TextView name;
        TextView info;
    }

    public void addItem(CoffeeItem item){
        coffeeItem.add(item);
    } */


       if (convertView == null) {
            convertView = inflater.inflate(layout, parent, false);
        }
        CoffeeItem coffeeItem = data.get(position);

        // 이미지 파일 연동
        ImageView profile = (ImageView)convertView.findViewById(R.id.profile);
        profile.setImageResource(coffeeItem.getProfile());

        ImageView profile2 = (ImageView)convertView.findViewById(R.id.profile2);
        profile2.setImageResource(coffeeItem.getProfile2());

        //이름 연동
        TextView name = (TextView)convertView.findViewById(R.id.name);
        name.setText(coffeeItem.getName());

        //정보 연동
        TextView info = (TextView)convertView.findViewById(R.id.info);
        info.setText(coffeeItem.getInfo());

        return convertView;
    }
}
