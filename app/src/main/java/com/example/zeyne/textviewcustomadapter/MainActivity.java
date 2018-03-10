package com.example.zeyne.textviewcustomadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvitem;
    private ItemListAdapter adapter;
    private List<Item> mitemList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvitem = (ListView) findViewById(R.id.listview_item);
lvitem.line
        mitemList = new ArrayList<>();

        mitemList.add(new Item(1,"asd","zxc"));
        mitemList.add(new Item(2,"fgh","vbn"));
        mitemList.add(new Item(3,"jkl","möç"));

        adapter = new ItemListAdapter(getApplicationContext(), mitemList);
        lvitem.setAdapter(adapter);

    }
}