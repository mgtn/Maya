package com.example.megan.profilelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    private Button Allergies;
    private Button Meds;
    private Button Vitals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Allergies = (Button)findViewById(R.id.btn1);
        Meds = (Button)findViewById(R.id.btn2);
        Vitals = (Button)findViewById(R.id.btn3);

        Allergies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, AllergiesActivity.class);
                startActivity(intent);
            }
        });

        Meds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, MedsActivity.class);
                startActivity(intent);
            }
        });

        Vitals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ThirdActivity.this, VitalsActivity.class);
                startActivity(intent);
            }
        });
    }
}
