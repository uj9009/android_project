package com.example.myapplication;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.provider.ContactsContract;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RefillAdapter extends BaseAdapter {

    /* 아이템을 세트로 담기 위한 어레이 */
   private ArrayList<RefillItem> refillItems = new ArrayList<>();

    @Override
    public int getCount() {
        return refillItems.size();
    }

    @Override
    public Object getItem(int position) {
        return refillItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
       // Context context = parent.getContext();

        CustomViewHolder holder;

        if (converView == null){
        //    LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            converView = LayoutInflater.from(parent.getContext()).inflate(R.layout.refill_item, null, false);

            holder = new CustomViewHolder();
            holder.img_title = (ImageView)converView.findViewById(R.id.img_title);
            holder.title = (TextView)converView.findViewById(R.id.title);
            holder.tv_sang = (TextView)converView.findViewById(R.id.tv_sang);
            holder.tv_ga = (TextView)converView.findViewById(R.id.tv_ga);
            holder.tv_jo = (TextView)converView.findViewById(R.id.tv_jo);

            converView.setTag(holder);

        } else {
            holder = (CustomViewHolder)converView.getTag();
        }

        RefillItem refillItem = refillItems.get(position);

        holder.img_title.setImageResource(refillItem.getImg_title());
        holder.title.setText(refillItem.getTitle());
        holder.tv_sang.setText(refillItem.getTv_sang());
        holder.tv_jo.setText(refillItem.getTv_jo());
        holder.tv_ga.setText(refillItem.getTv_ga());

        return converView;
    }

    class CustomViewHolder {
        ImageView img_title;
        TextView title, tv_sang, tv_jo, tv_ga;
    }
    public  void addItem(RefillItem refillItem) {
        refillItems.add(refillItem);
    }
}
