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
        WorldItem world1 = new WorldItem(R.drawable.coffee1, "브라질 커피", "브라질은 세계 제일의 커피 생산국이자 수출국으로, 다른 나라들에 비해 비교적 낮은 고도의 대규모 농장에서 커피를 경작한다.\n" +
                "브라질 커피는 주로 에스프레소 베이스 블랜딩(Espresso Base Blending)에 많이 사용된다.\n" +
                "주요산지\n" +
                "미나스 제라이스(Minas Gerais), 상파울루(San Paulo), 에스피리투 산토(Espirito Santo), 파라나(Parana)\n" +
                "재배품종\n" +
                "아라비카(Arabica), 로부스타(Robusta)\n" +
                "수확시기\n" +
                "5월~9월\n" +
                "생산량\n" +
                "약 309만 톤, 세계 1위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "5등급 (결점두에 따른 분류)\n" +
                "대표커피\n" +
                "버본 산토스(Bourbon Santos), 몬테알레그레(Montralegre), 카페 리오테(Cafe Riote)");

        //2번 아이템
        WorldItem world2 = new WorldItem(R.drawable.coffee3, "콜롬비아 커피", "콜롬비아 커피는 워시드 커피(Washed Coffee)인 마일드 커피(Mild Coffee)의 대명사로 콜롬비아 수프레모(Supremo)와 엑셀소\n" +
                "(Excelso)가 유명하며, 품질 면에서 세계 1위 커피를 생산하는 것으로 알려져 있다.\n" +
                "주요산지\n" +
                "마니살레스(Manizales), 아르메니아(Armenia), 메델린(Medellin), 부카라망가(Bucaramanga)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "10월~2월, 4월~6월\n" +
                "생산량\n" +
                "약 84만톤, 세계 3위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "4등급 (생두 크기에 따른 분류)\n" +
                "대표커피\n" +
                "콜롬비아 수프레모(Colombia Supremo), 엑셀소(Colombia Excelso), 마니살레스(Manizales), 아르메니아(Armenia), 메델린(Medellin)\n");

        //3번 아이템
        WorldItem world3 = new WorldItem(R.drawable.coffee3, "코스타리카 커피", "코스타리카는 법적으로 아라비카(Arabica) 종만을 재배할 수 있고, 커피 고유의 품질을 최대로 유지할 수 있는 습식 가공법\n" +
                "(Wet Method)을 사용하여 세계적으로 완벽한 커피를 생산한다.\n" +
                "주요산지\n" +
                "타라주(Tarrazu), 트레리오스(Tres Rios)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "8월, 9월~4월\n" +
                "생산량\n" +
                "약 93,600톤(국제커피협회, 2017년 crop year 기준)\n" +
                "등급분류\n" +
                "8등급 (재배지 고도에 따른 분류)\n" +
                "대표커피\n" +
                "타라주(Tarrzu), 트레리오스(Tres Rios), 코스타리카 카라콜리(Costa rica Caracoli)\n");

        WorldItem world4 = new WorldItem(R.drawable.coffee3, "에티오피아 커피", "에티오피아는 아라비카 커피(Arabica Coffee)의 원산지로 '커피의 고향'으로 알려졌으며, 아프리카 최대의 커피 생산국이다.\n" +
                "주요산지\n" +
                "하라(Harrar), 이르가체페(Yirgacheffe), 시다모(Sidamo), 짐마(Djimmah)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "10월~3월\n" +
                "생산량\n" +
                "약 46만톤, 세계 6위 (국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "8등급 (결점두에 따른 분류)\n" +
                "대표커피\n" +
                "하라(Harrar), 이르가체페(Yirgacheffe), 시다모(Sidamo), 짐마(Djimmah), 리무(Limmu)");

        WorldItem world5 = new WorldItem(R.drawable.coffee3, "과테말라 커피", "과테말라 커피는 주로 화산지역에서 경작되며 고급 스모크 커피(Smoke Coffee)의 대명사인 안티구아(Antigua)가 대표적이다.\n" +
                "주요산지\n" +
                "안티구아 과테말라(Antigua Guatemala), 코반(Coban), 우에우에테낭고(Huehuetenango), 산타 로사(Santa Rosa), 산 마르코스(San Marcos)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "8월~4월\n" +
                "생산량\n" +
                "약 23만톤, 세계 11위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "7등급 (재배지 고도에 따른 분류)\n" +
                "대표커피\n" +
                "안티구아(Antigua), 레인포레스트 코반(Rainforest Coban), 볼케닉 산 마르코스(Volcanic San Marcos), 하이랜드 휴휴(Highland Huehue), 트레디션 아티틀란(Tradition Atitlan)");

        WorldItem world6 = new WorldItem(R.drawable.coffee3, "인도 커피", "인도 커피 중 가장 유명한 몬순 커피(Monsooned Coffee)는 습한 남서 계절풍(몬순, Monsoon)에 커피를 건조하여 인위적으로\n" +
                "숙성시킨 것이다. 노란빛을 띠며, 독특한 향미를 갖고 있고, 진한 쓴맛으로 에스프레소 용으로 적합하다는 평가를 받는다.\n" +
                "주요산지\n" +
                "마이소르(Mysore), 말라바르(Malabar), 마드라스(Madras)\n" +
                "재배품종\n" +
                "아라비카(Arabica), 로부스타(Robusta)\n" +
                "수확시기\n" +
                "11월~2월\n" +
                "생산량\n" +
                "약 35만톤, 세계 7위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "5등급 (생두 크기, 가공방식, 품종에 따른 분류)\n" +
                "대표커피\n" +
                "몬순 말라바(Monsooned Malabar), 마이소르 너깃 엑스트라 볼드(Mysore Nuggets Extra Bold), 로부스타 카피 로얄(Robusta Kaapi Royale)\n");

        WorldItem world7 = new WorldItem(R.drawable.coffee3, "인도네시아 커피", "인도네시아는 아시아 최대의 커피 생산국으로 유일하게 습식 가공(Wet Method)으로 고품질의 로부스타(Robusta) 종을 경작하며,\n" +
                "세계에서 가장 값비싼 커피인 코피루왁(Kopi Luwak)으로 유명하다.\n" +
                "주요산지\n" +
                "수마트라(Sumatra), 자바(Java), 술라웨시(Sulawesi)\n" +
                "재배품종\n" +
                "아라비카(Arabica), 로부스타(Robusta)\n" +
                "수확시기\n" +
                "3월~6월\n" +
                "생산량\n" +
                "약 65만톤, 세계 4위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "6등급 (결점두에 따른 분류)\n" +
                "대표커피\n" +
                "만델링(Mandheling), 자바(Java), 토라자(Toraja), 가요 마운틴(Gayo Mountain), 코피 루악(Kopi Luak)");

        WorldItem world8 = new WorldItem(R.drawable.coffee3, "자메이카 커피", "커피의 황제, 세계 최고의 커피로 알려진 자메이카 블루마운틴(Jamaica Blue Mountain)은 자메이카 동쪽 블루마운틴\n" +
                "(Mt. Blue mountain) 지역에서 생산되는 커피를 말한다.\n" +
                "주요산지\n" +
                "포틀랜드(Portland), 세인트 토마스(St. Thomas), 세인트 앤드류(St. Andrews), 세인트 메리(St. Mary), 맨체스터(Manchester)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "8월~9월\n" +
                "생산량\n" +
                "24,000톤, 세계40위 (국제커피협회, 2008년 crop year 기준)\n" +
                "등급분류\n" +
                "4등급 (재배지 고도에 따른 분류)\n" +
                "대표커피\n" +
                "자메이카 블루마운틴(Jamaica Blue Mountain), 자블럼(JBM, Jablum)");

        WorldItem world9 = new WorldItem(R.drawable.coffee3, "케냐 커피", "케냐 커피는 국가 차원의 커피산업지원책으로 세계적으로 신뢰받는 경매 시스템을 가진 아프리카 대표 커피 생산국이다.\n" +
                "대표 커피로는 케냐 더블에이(Kenya AA), 이스테이트 케냐(Estate Kenya)가 있다.\n" +
                "주요산지\n" +
                "케냐산(Mt. Kenya), 엘곤(Mt. Elgon), 나쿠루(Nakuru)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "6월 중순~12월\n" +
                "생산량\n" +
                "약 47,400톤(국제커피협회, 2017년 crop year 기준)\n" +
                "등급분류\n" +
                "4등급 (생두 크기에 따른 분류)\n" +
                "대표커피\n" +
                "케냐 더블에이(Kenya AA), 이스테이트 케냐(Estate Kenya)\n");

        WorldItem world10 = new WorldItem(R.drawable.coffee3, "멕시코 커피", "멕시코는 세계 6위의 커피 생산국이며, 해발 1,700m 이상에서 재배된 품질 좋은 커피에 '알투라(Altura)' 라는 명칭을 붙인다.\n" +
                "유기농 커피(Organic Coffee)로 유명한 타파출라(Tapachula) 커피를 생산한다.\n" +
                "주요산지\n" +
                "치아파스(Chiapas), 베라크루즈(Veracruz), 오악사카(Oaxaca)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "9월~3월\n" +
                "생산량\n" +
                "약 24만톤, 세계 10위 (국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "4등급 (재배지 고도에 따른 분류)\n" +
                "대표커피\n" +
                "타파출라(Tapachula), 코아테펙(Coatepec), 알투라 오리자바(Altura Orizaba), 플루마(Pluma), 리퀴담바MS(Liquidambar MS)");

        WorldItem world11 = new WorldItem(R.drawable.coffee3, "온두라스 커피", "온두라스 커피는 커피 경작에 이상적인 해발 1,000~1,700m의 고지대에서 재배되며, 가장 유명한 커피는 온두라스 SHG,\n" +
                "온두라스 HG이다.\n" +
                "주요산지\n" +
                "산타바르바라(Santa Barbara), 코판(Copan), 렘피라(Lempira), 라파스(La Paz)\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "5월~10월\n" +
                "생산량\n" +
                "약 50만톤, 세계 5위(국제커피협회, 2017년 기준)\n" +
                "등급분류\n" +
                "3등급 (재배지 고도에 따른 분류)\n" +
                "대표커피\n" +
                "온두라스 SHG, 온두라스 HG");

        WorldItem world12 = new WorldItem(R.drawable.coffee3, "파푸아뉴기니 커피", "파푸아뉴기니 커피는 유기농 커피(Organic Coffee)로 유명하며 대표적인 커피인 파푸아뉴기니 시그리는 부드러운 신맛,\n" +
                "꽃과 과일 향 등 풍부한 향미를 가지고 있다.\n" +
                "주요산지\n" +
                "시그리(Sigri), 아로나(Arona)\n" +
                "재배품종\n" +
                "아라비카(Arabica), 로부스타(Robusta)\n" +
                "수확시기\n" +
                "4월~9월\n" +
                "생산량\n" +
                "약 66,000톤(국제커피협회, 2017년 crop year 기준)\n" +
                "등급분류\n" +
                "5등급 (생두 크기에 따른 분류)\n" +
                "대표커피\n" +
                "파푸아뉴기니 시그리(Papua New Guinea Sigri), 파푸아뉴기니 아로나(Papua New Guinea Arona)\n");

        WorldItem world13 = new WorldItem(R.drawable.coffee3, "탄자니아 커피", "탄자니아 커피는 킬리만자로(Killimanjaro, 탄자니아AA(Tanzania AA))로 대표되며 유럽에서는 '커피의 신사',\n" +
                "'영국 왕실의 커피'로 칭송받는다.\n" +
                "주요산지\n" +
                "모시(Moshi), 탕가니카(Tanganyika)호수, 니아사(Nyasa)호수, 탕가(Tanga)\n" +
                "재배품종\n" +
                "아라비카(Arabica), 로부스타(Robusta)\n" +
                "수확시기\n" +
                "아라비카(Arabica) - 10월~2월, 로부스타(Robusta) - 6월~12월\n" +
                "생산량\n" +
                "약 40,980톤(국제커피협회, 2017년 crop year 기준)\n" +
                "등급분류\n" +
                "6등급 (생두 크기에 따른 분류)\n" +
                "대표커피\n" +
                "킬리만자로(Killimanjaro, 탄자니아AA(Tanzania AA)), 모시(Moshi), 음베야(Mbeya)");

        WorldItem world14 = new WorldItem(R.drawable.coffee3, "베트남 커피", "베트남은 세계 2위의 커피 생산국이자 수출국으로, 세계에서 가장 큰 로부스타 생산국이기도 하다.\n" +
                "베트남 커피는 주로 인스턴트 커피로 활용되며, 버본(bourbon), 카투아이(catuai), 체리(Cherry), 위즐(weasel) 커피 등이 유명하다.\n" +
                "주요산지\n" +
                "베트남\n" +
                "재배품종\n" +
                "로부스타, 아라비카\n" +
                "수확시기\n" +
                "10~2월\n" +
                "생산량\n" +
                "연간 약 160만 톤 내외\n" +
                "등급분류\n" +
                "6등급 (결점두에 따른 분류)\n" +
                "대표커피\n" +
                "버본(bourbon), 카투아이(catuai), 체리(Cherry), 위즐(weasel) 커피");

        WorldItem world15 = new WorldItem(R.drawable.coffee3, "예멘 커피", "커피의 귀부인 칭호를 받는 예멘 모카(Yemen Mocha)는 자메이카 블루마운틴(Jamaica Blue Mountain),\n" +
                "하와이언 코나(Hawaiian Kona)와 더불어 세계 3대 명품 커피로 인정받고 있다.\n" +
                "주요산지\n" +
                "베니 마타르(Bani Mattar), 하라지(Haraz), 사나(Sana's) 인근\n" +
                "재배품종\n" +
                "아라비카(Arabica)\n" +
                "수확시기\n" +
                "3월~4월과 10월~12월\n" +
                "생산량\n" +
                "약 9,000톤(국제커피협회, 2017년 기준)\n" +
                "대표커피\n" +
                "예멘 모카(Yemen Mocha), 모카 마타리(Mocha Mattari), 모카 히라지(Mocha Hirazi), 사나니(Sanani)");

        //리스트에 추가
        data2.add(world1);
        data2.add(world2);
        data2.add(world3);
        data2.add(world4);
        data2.add(world5);
        data2.add(world6);
        data2.add(world7);
        data2.add(world8);
        data2.add(world9);
        data2.add(world10);
        data2.add(world11);
        data2.add(world12);
        data2.add(world13);
        data2.add(world14);
        data2.add(world15);


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

