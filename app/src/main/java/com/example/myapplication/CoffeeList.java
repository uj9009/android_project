package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class CoffeeList extends AppCompatActivity implements View.OnClickListener {

 private ArrayList<CoffeeItem> data = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_list);

        ListView coffee_list = findViewById(R.id.coffee_list);

        data = new ArrayList<>();
        // 1번 아이템
        CoffeeItem coffee1 = new CoffeeItem(R.drawable.coffee1, "아메리카노", "에스프레소 + 물 \n 아메리카노는 물과 에스프레소를 섞은 것으로 음청 써요 그래서 호불호가 갈리는 커피랍니다");
        //2번 아이템
        CoffeeItem coffee2 = new CoffeeItem(R.drawable.coffee2, "라떼", "에스프레소 + 우유");

        //리스트에 추가
        data.add(coffee1);
        data.add(coffee2);

        //리스트 속의 아이템 연결
        CoffeeAdapter coffeeadapter = new CoffeeAdapter(this, R.layout.coffee_item, data);
        coffee_list.setAdapter(coffeeadapter);

        // 아이템 클릭시 작동

        coffee_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Intent coffeeintent = new Intent(getApplicationContext(), CoffeeClicked.class);

                /* putExtra의 첫 값은 식별 태그, 뒤에는 다음 화면에 넘길 값 */
                coffeeintent.putExtra("profile", Integer.toString(data.get(position).getProfile()));
                coffeeintent.putExtra("name", data.get(position).getName());
                coffeeintent.putExtra("info", data.get(position).getInfo());
                startActivity(coffeeintent);
            }
        });


    }

    @Override
    public void onClick(View v) {

    }
}
