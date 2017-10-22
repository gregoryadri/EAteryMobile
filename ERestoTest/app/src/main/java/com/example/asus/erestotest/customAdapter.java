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
public class customAdapter extends ArrayAdapter<String> {

    String[] data;
    Activity activity;

    public customAdapter(menu menu, String[] data){
        super(menu,R.layout.activity_menu_interface,data);
        this.activity = menu;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        View v = inflater.inflate(R.layout.activity_menu_interface,null,true);

        TextView text = (TextView)v.findViewById(R.id.menuInterfaceChange);
        text.setText(data[position]);

        return v;
    }
}
