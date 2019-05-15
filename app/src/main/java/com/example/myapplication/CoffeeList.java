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
        //아이템 리스트
        data = new ArrayList<>();
        // 1번 아이템
        CoffeeItem coffee1 = new CoffeeItem(R.drawable.americano, R.drawable.americano, "아메리카노", "Americano \n 에스프레소 + 물 \n 단어를 해석하자면 '미국식 커피'로, 말 그대로 '유럽식 커피에 비해 옅은 농도인 미국식 커피 스타일'을 일컫는 말이다.");
        //2번 아이템
        CoffeeItem coffee2 = new CoffeeItem(R.drawable.latte, R.drawable.latte,"카페라떼", "Cafe Latte \n 에스프레소 + 스팀밀크 \n 우유를 넣은 커피의 일종이다. 이탈리아어로 카페는 커피를, 라테는 우유를 뜻한다. 때문에 커피에 우유를 넣은 것이다.");
        //3번 아이템
        CoffeeItem coffee3 = new CoffeeItem(R.drawable.caramelmacchiato, R.drawable.caramelmacchiato,"카라멜 마끼야또", "Caramel Macchiato \n 거품을 낸 우유 + 바닐라향 시럽 + 에스프레소 약간 + 카라멜 소스 \n 라떼 마키아토에 캐러멜 소스를 첨가한 것으로, 스타벅스에서 카라멜 마끼아또라는 이름으로 팔리기 때문에 유명해졌다. 물론 커피의 본 고장인 이탈리아에는 없던 음료.");
        //4번 아이템
        CoffeeItem coffee4 = new CoffeeItem(R.drawable.appuccino, R.drawable.appuccino,"카푸치노", "Cappuccino \n 에스프레소 + 우유거품 => 두개를 섞고 그위에 우유거품을 얹는다. \n 우유를 넣은 커피의 일종. 오스트리아 방식의 커피 음용법이다. 에스프레소에 우유를 붓고, 그 위에 우유 거품을 올리는데, 우유 비율이 높은 카페오레, 카페라떼보다도" +
                "우유 거품의 비율이 높은지라 커피 본연의 맛은 더 진한 편이다.");

        CoffeeItem coffee5 = new CoffeeItem(R.drawable.vanillalatte, R.drawable.vanillalatte,"바닐라 라떼", "Vanilla Latte \n 에스프레소 + 스팀 밀크 + 바닐라 시럽 \n 에스프레소에 우유와 바닐라 시럽을 넣은 커피로 에스프레소의 쓴맛과 바닐라시럽의 향미가 느껴지는 커피이다.");

        CoffeeItem coffee6 = new CoffeeItem(R.drawable.caramellatte, R.drawable.caramellatte,"카라멜 라떼", "Caramel Latte \n 바닐라향 시럽 + 스팀 밀크 + 에스프레소 약간 + 생크림(기호에 맞게) \n 카라멜 마끼야또는 휘핑크림으로 우유거품이 올라가지만 카라멜 라떼는 생크림이 얹어진다.");

        CoffeeItem coffee7 = new CoffeeItem(R.drawable.hazelnutlatte, R.drawable.hazelnutlatte,"헤이즐넛 라떼", "Hazlnut Latte \n 헤이즐넛 시럽 + 스팀우유 + 에스프레소 약간 \n 헤이즐넛 시럽을 사용하여 향이 매우 좋고 고소한 커피.");

        CoffeeItem coffee8 = new CoffeeItem(R.drawable.mocha, R.drawable.mocha,"카페모카", "Cafe Mocha \n 에스프레소 + 우유 + 다크초콜릿 \n (휘핑크림은 기호에 맞게) \n 베리에이션 커피의 일종. 에스프레소에 우유와 초콜릿 시럽을 넣어서 만든다. 초콜릿 시럽을 넣는다는 점이 포인트이고, 휘핑크림은 기호에 따라 올리기도 하고 안 올리기도 한다");

        CoffeeItem coffee9 = new CoffeeItem(R.drawable.cinnamoncafemocha, R.drawable.cinnamoncafemocha,"시나몬 카페모카", "Cinnamon CafeMocha \n 에스프레소 + 우유 + 초콜릿 + 시나몬가루 (휘핑크림은 기호에 맞게) \n 카페모카에 시나몬가루를 뿌린 것.");
        CoffeeItem coffee10 = new CoffeeItem(R.drawable.espresso, R.drawable.espresso,"에스프레소", "Espresso \n 에스프레소 + 설탕(기호에 맞게) \n 곱게 간 원두에 고온 고압의 물을 투과시켜 추출해 데미타스 컵에 담은 커피, 원래 원두를 끓여 우려내었던 커피를 신속하게 추출하기 위해 고안된 방법이다.");
        CoffeeItem coffee11 = new CoffeeItem(R.drawable.whitecafemocha, R.drawable.whitecafemocha,"화이트 카페 모카", "White Cafe Mocha \n 에스프레소 + 우유 + 화이트초콜릿 (휘핑크림은 기호에 맞게)\n 카페 모카에 검은색 초콜릿이 아닌 화이트 초콜릿을 사용하여 만든 커피.");
        CoffeeItem coffee12 = new CoffeeItem(R.drawable.coffee2, R.drawable.coffee1,"비엔나", "Vienna \n 휘핑크림 + 물 + 에스프레소\n 차가운 생크림의 부드러움과 뜨거운 커피의 쌉싸름함이 차츰 더해지는 단맛의 묘미.");
        CoffeeItem coffee13 = new CoffeeItem(R.drawable.coffee2, R.drawable.coffee1,"에스프레소 콘 파냐", "Espresso Con Panna \n 휘핑크림 + 에스프레소\n 에스프레소 샷에 휘핑크림을 얹은 커피 음료로서, 뜨거운 커피의 맛과 차갑고 달콤한 생크림의 맛을 동시에 즐길 수 있다.");

        //리스트에 추가
        data.add(coffee1);
        data.add(coffee2);
        data.add(coffee3);
        data.add(coffee4);
        data.add(coffee5);
        data.add(coffee6);
        data.add(coffee7);
        data.add(coffee8);
        data.add(coffee9);
        data.add(coffee10);
        data.add(coffee11);
        data.add(coffee12);
        data.add(coffee13);

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
                coffeeintent.putExtra("profile2", Integer.toString(data.get(position).getProfile2()));
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
