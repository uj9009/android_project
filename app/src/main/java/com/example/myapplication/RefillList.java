package com.example.myapplication;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class RefillList extends AppCompatActivity {
    
    private RefillAdapter adapter;
    private ListView refill_list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refill_list);
        
        adapter = new RefillAdapter();
        refill_list = (ListView)findViewById(R.id.refill_list);
        
        setData();
        
        refill_list.setAdapter(adapter);
    }

    private void setData() {
        TypedArray arrimg = getResources().obtainTypedArray(R.array.img_title);
        String[] title = getResources().getStringArray(R.array.title);
        String[] tv_sang = getResources().getStringArray(R.array.tv_sang);
        String[] tv_jo = getResources().getStringArray(R.array.tv_jo);
        String[] tv_ga = getResources().getStringArray(R.array.tv_ga);

        for (int i = 0; i < arrimg.length(); i++) {
            RefillItem refillItem = new RefillItem();
            refillItem.setImg_title(arrimg.getResourceId(i, 0));
            refillItem.setTitle(title[i]);
            refillItem.setTv_sang(tv_sang[i]);
            refillItem.setTv_jo(tv_jo[i]);
            refillItem.setTv_ga(tv_ga[i]);

            adapter.addItem(refillItem);
        }
    }
}
