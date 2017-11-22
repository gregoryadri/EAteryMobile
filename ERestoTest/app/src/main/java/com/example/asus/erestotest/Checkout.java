package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;


public class Checkout extends AppCompatActivity implements View.OnClickListener {
    Button kembali;
    ListView list_menu;
    String[] nama_makanan = {"Nasi Goreng", "Mie Goreng", "Es Teh Manis", "Teh Manis Hangat"};
    String[] harga_makanan = {"10.000", "10.000", "6.000", "5.000"};
    String[] orderMakanan, orderHarga;
    int orderPosition = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CheckoutMenuAdapter adapterMenu = new CheckoutMenuAdapter(this,nama_makanan,harga_makanan);

        list_menu.setAdapter(adapterMenu);

        kembali.setOnClickListener(this);
    }

    public void onClick(View v) {
        if (v == kembali) {
            startActivity(new Intent(getApplicationContext(), Menu.class));
        }
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        orderMakanan[orderPosition] = nama_makanan[position];
        orderHarga[orderPosition] = harga_makanan[position];
        orderPosition++;
    }
}


