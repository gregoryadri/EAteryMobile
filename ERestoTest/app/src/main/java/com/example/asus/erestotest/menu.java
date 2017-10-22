package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity implements View.OnClickListener {

    //variable
    Button cekOrder, pembayaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cekOrder = (Button)findViewById(R.id.check_order);
        pembayaran = (Button)findViewById(R.id.checkout);

        cekOrder.setOnClickListener(this);
        pembayaran.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v == cekOrder){
            startActivity(new Intent(getApplicationContext(),show_order.class));
        } else {
            //startActivity(new Intent(getApplicationContext(),checkout.class));
        }
    }
}
