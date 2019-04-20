package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RefillAdapter extends BaseAdapter {

    List<RefillItem> refillItems;
    Context context;

    public RefillAdapter (Context c, List<RefillItem> r){
        context = c;
        refillItems = r;
    }
    @Override
    public int getCount() {
        return refillItems.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {
        if (View == null){
            LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View = inflater.inflate(R.layout.refill_item, parent, false);
        }

        ImageView img_title = (ImageView)View.findViewById(R.id.img_title);
        TextView tv_sang = (TextView)View.findViewById(R.id.tv_sang);
        TextView tv_ga = (TextView)View.findViewById(R.id.tv_ga);
        TextView tv_jo = (TextView)View.findViewById(R.id.tv_jo);

        img_title.setImageDrawable(refillItems.get(position).getImg_title());
        tv_sang.setText(refillItems.get(position).getTv_sang());
        tv_jo.setText(refillItems.get(position).getTv_jo());
        tv_ga.setText(refillItems.get(position).getTv_ga());
        return View;
    }
}
