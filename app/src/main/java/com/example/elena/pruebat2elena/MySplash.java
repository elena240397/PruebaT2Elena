package com.example.elena.pruebat2elena;


import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ScrollView;
import android.widget.Toast;

/**
 * Created by elena on 06/03/2018.
 */

public class MySplash extends AppCompatActivity {
    SwipeRefreshLayout swipeRefreshLayout;
    ScrollView scrollView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        swipeRefreshLayout= (SwipeRefreshLayout)findViewById(R.id.swipe) ;
        scrollView=(ScrollView)findViewById(R.id.scroll);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getApplicationContext(), "El poema ha sido refrescado", Toast.LENGTH_SHORT).show();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
