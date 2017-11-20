package com.example.asus.erestotest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

/**
 * Created by Asus on 10/22/2017.
 */
public class ItemMenuAdapter extends ArrayAdapter<String> {

    Map<String,String> mapMenu;
    Activity activity;
    String[] namaMakanan, hargaMakanan;

    public ItemMenuAdapter(Menu menu, String[] namaMakanan, String[] hargaMakanan){
        super(menu,R.layout.activity_menu_item, namaMakanan);
        this.activity = menu;
        this.namaMakanan = namaMakanan;
        this.hargaMakanan = hargaMakanan;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View  v = inflater.inflate(R.layout.activity_menu_item,null,true);

        TextView textNamaMenu = (TextView)v.findViewById(R.id.namaMenuShow);
        TextView textHargaMenu = (TextView)v.findViewById(R.id.hargaMenuShow);

        textNamaMenu.setText(namaMakanan[position]);
        textHargaMenu.setText(hargaMakanan[position]);


        return v;
    }
}
