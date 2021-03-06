package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class Menu extends AppCompatActivity
        implements View.OnClickListener, AdapterView.OnItemClickListener {

    //variable
    String[] orderMakanan, orderHarga;
    int orderPosition = 0;

    Button cekOrder, pembayaran;

    ListView list_menu;

    String[] hanyaAkal;

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

        list_menu = (ListView)findViewById(R.id.listMenu);

        ItemMenuAdapter adapterMenu = new ItemMenuAdapter(this,nama_makanan,harga_makanan);

        cekOrder.setOnClickListener(this);
        pembayaran.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == cekOrder){
            Intent i = new Intent(getApplicationContext(),ShowOrder.class);
            for(int a = 0; a < orderPosition; a++){
                i.putExtra("NamaMakanan",orderMakanan[a]);
                i.putExtra("HargaMakanan",orderHarga[a]);
            }
            orderPosition = 0;

            startActivity(i);
        } else {
            orderPosition = 0;
            startActivity(new Intent(getApplicationContext(),Checkout.class));
        }
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        orderMakanan[orderPosition] = nama_makanan[position];
        orderHarga[orderPosition] = harga_makanan[position];
        orderPosition++;
    }
}
