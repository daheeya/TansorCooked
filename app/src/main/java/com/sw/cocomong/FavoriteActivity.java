package com.sw.cocomong;

import android.os.Bundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.sw.cocomong.fooditem.FoodAdapter;

public class FavoriteActivity extends AppCompatActivity {
    FoodAdapter foodAdapter;
    ListView list;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favorite_list);

        list=findViewById(R.id.favoriteList);
        foodAdapter = new FoodAdapter(FavoriteActivity.this, MainFoodListActivity.favoriteItems);
        list.setAdapter(foodAdapter);



    }
}
