package com.example.a15657_000.listviewtest;

import android.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
            actionBar.hide();

        initFruit();
        listView = (ListView) findViewById(R.id.listview1);
        FruitAdapter fa = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        listView.setAdapter(fa);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit = fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initFruit(){
            for(int i = 0;i < 2;i++)
            {
                Fruit apple = new Fruit("Apple",R.drawable.apple);
                fruitList.add(apple);
                Fruit carrot = new Fruit("Carrot",R.drawable.carrot);
                fruitList.add(carrot);
                Fruit grape = new Fruit("Grape",R.drawable.grape);
                fruitList.add(grape);
                Fruit orange = new Fruit("Orange",R.drawable.orange);
                fruitList.add(orange);
                Fruit pear = new Fruit("Pear",R.drawable.pear);
                fruitList.add(pear);
                Fruit watermelon = new Fruit("Watermelon",R.drawable.watermelon);
                fruitList.add(watermelon);
            }
    }
}
