package com.example.asus.erestotest;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.app.Activity;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {
    private RadioGroup radioGroup;
    private RadioButton pelanggan, restoran;
    private TextView textView;
    private Button registerButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        radioGroup = (RadioGroup) findViewById(R.id.radio_signup);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // find which radio button is selected
                if (checkedId == R.id.radio_pelanggan) {
                    Toast.makeText(getApplicationContext(), "Pelanggan telah dipilih",
                            Toast.LENGTH_SHORT).show();
                }
                if (checkedId == R.id.radio_restoran) {
                    Toast.makeText(getApplicationContext(), "Restoran telah dipilih",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerButton = (Button)findViewById(R.id.email_register);
        registerButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(mainIntent);
            }
        });

    }

}
