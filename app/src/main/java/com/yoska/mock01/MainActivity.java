package com.yoska.mock01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ActionBar;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    String[] topicArray = {"Yoska Running Academy","Yoska Running Academy" };

    String[] infoArray = {
            "General Discussion",
            "General Discussion",
    };

    Integer[] imageArray1 = {R.drawable.color_orange,
            R.drawable.color_orange};

    Integer[] imageArray2 = {R.drawable.color_yellow,
            R.drawable.color_yellow};

    Integer[] imageArray3 = {R.drawable.color_purple,
            R.drawable.color_purple};

    ListView list1, list2, list3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("MESSAGING");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        //bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);

        ArrayList<Event> arrayList = new ArrayList<>();
        arrayList.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_orange_ring));
        arrayList.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_orange));

        CustomAdapter adapter1 = new CustomAdapter(this, R.layout.item_list, arrayList);
        list1 = (ListView) findViewById(R.id.listView1);
        list1.setAdapter(adapter1);

        ArrayList<Event> arrayList1 = new ArrayList<>();
        arrayList1.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_yellow));
        arrayList1.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_yellow));

        CustomAdapter2 adapter2 = new CustomAdapter2(this, R.layout.item_list, arrayList1);
        list2 = (ListView) findViewById(R.id.listView2);
        list2.setAdapter(adapter2);

        ArrayList<Event> arrayList2 = new ArrayList<>();
        arrayList2.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_purple));
        arrayList2.add(new Event("Yoska Running Academy","General Discussion", R.drawable.color_purple));

        CustomAdapter3 adapter3 = new CustomAdapter3(this, R.layout.item_list, arrayList2);
        list3 = (ListView) findViewById(R.id.listView3);
        list3.setAdapter(adapter3);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return super.onOptionsItemSelected(item);
    }


}