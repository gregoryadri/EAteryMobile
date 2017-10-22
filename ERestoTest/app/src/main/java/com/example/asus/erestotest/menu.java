package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class menu extends AppCompatActivity
        implements View.OnClickListener {

    //variable
    Button cekOrder, pembayaran;

    ListView list_nama, list_harga;

    String[] nama_makanan = {"Nasi Goreng", "Mie Goreng", "Es Teh Manis", "Teh Manis Hangat"};
    String[] harga_makanan = {"10.000", "10.000", "6.000", "5.000"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        cekOrder = (Button)findViewById(R.id.check_order);
        pembayaran = (Button)findViewById(R.id.checkout);

        list_nama = (ListView)findViewById(R.id.listView3);
        list_harga = (ListView)findViewById(R.id.listView4);

        customAdapter adapterNama = new customAdapter(this,nama_makanan);
        customAdapter adapterHarga = new customAdapter(this,harga_makanan);

        list_nama.setAdapter(adapterNama);
        list_harga.setAdapter(adapterHarga);

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
