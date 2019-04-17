package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class WorldList extends AppCompatActivity implements View.OnClickListener {


    private ArrayList<WorldItem> data2 = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_world_list);

        ListView world_list = findViewById(R.id.world_list);

        data2 = new ArrayList<>();
        // 1번 아이템
        WorldItem world1 = new WorldItem(R.drawable.coffee1, "대한민국", "에스프레소 + 물 \n 아메리카노는 물과 에스프레소를 섞은 것으로 음청 써요 그래서 호불호가 갈리는 커피랍니다");

        //2번 아이템
        WorldItem world2 = new WorldItem(R.drawable.coffee3, "라떼", "에스프레소 + 우유");

        //리스트에 추가
        data2.add(world1);
        data2.add(world2);

        //리스트 속의 아이템 연결
        WorldAdapter worldAdapter = new WorldAdapter(this, R.layout.world_item, data2);
        world_list.setAdapter(worldAdapter);

        // 아이템 클릭시 작동

        world_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent worldintent = new Intent(getApplicationContext(), WorldClicked.class);

                /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */
                worldintent.putExtra("worldpro", Integer.toString(data2.get(position).getWorldpro()));
                worldintent.putExtra("worldname", data2.get(position).getWorldname());
                worldintent.putExtra("worldinfo", data2.get(position).getWorldinfo());
                startActivity(worldintent);
            }
        });

    }

    @Override
    public void onClick(View v) {

    }
}

