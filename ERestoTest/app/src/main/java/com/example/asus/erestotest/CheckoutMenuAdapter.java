package com.example.asus.erestotest;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



/**
 * Created by hari sabardi on 22/11/2017.
 */



public class CheckoutMenuAdapter extends ArrayAdapter<String> {

    Activity activity;
    String[] namaMakanan, hargaMakanan;

    public CheckoutMenuAdapter(Checkout menu, String[] namaMakanan, String[] hargaMakanan){
        super(menu,R.layout.activity_checkout, namaMakanan);
        this.activity = menu;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View  v = inflater.inflate(R.layout.activity_checkout,null,true);

        TextView textNamaMenu = (TextView)v.findViewById(R.id.namaMenuShow);
        TextView textHargaMenu = (TextView)v.findViewById(R.id.hargaMenuShow);

        textNamaMenu.setText(namaMakanan[position]);
        textHargaMenu.setText(hargaMakanan[position]);


        return v;
    }
}

