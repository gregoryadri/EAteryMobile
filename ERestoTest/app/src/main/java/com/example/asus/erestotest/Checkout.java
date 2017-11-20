package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;


public class Checkout extends AppCompatActivity implements View.OnClickListener {
    Button kembali;
    ListView list_makanan, list_minuman;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        list_makanan = (ListView) findViewById(R.id.list_makanan);
        list_minuman = (ListView) findViewById(R.id.list_minuman);

        kembali.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == kembali) {
            startActivity(new Intent(getApplicationContext(), menu.class));
        }
    }
}


