package com.example.asus.erestotest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.app.Activity;
import android.widget.TextView;

/**
 * Created by Asus on 10/22/2017.
 */
public class ItemMenuAdapter extends ArrayAdapter<String> {

    String[] namaMenu,hargaMenu;
    Activity activity;

    public ItemMenuAdapter(Menu menu, String[] namaMenu, String[] hargaMenu){
        super(menu,R.layout.activity_menu_item,namaMenu);
        this.namaMenu = namaMenu;
        this.hargaMenu = hargaMenu;
        this.activity = menu;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View  v = inflater.inflate(R.layout.activity_menu_item,null,true);

        TextView textNamaMenu = (TextView)v.findViewById(R.id.namaMenuShow);
        TextView textHargaMenu = (TextView)v.findViewById(R.id.hargaMenuShow);

        textNamaMenu.setText(namaMenu[position]);
        textHargaMenu.setText("Rp." + hargaMenu[position]);

        return v;
    }
}
