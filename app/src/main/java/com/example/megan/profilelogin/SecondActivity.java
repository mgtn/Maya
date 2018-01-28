package com.example.megan.profilelogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button Record;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Record = (Button)findViewById(R.id.btn);

        Record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });

    }

//    private void validate(String userName, String userPassword) {
//        if((userName.equals("hi")) && (userPassword.equals("hi"))) {
//            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//            startActivity(intent);
//        }
//        else {
//            // Login.setEnabled(false);
//            Info.setText("Incorrect Login");
//        }
//
//    }
}
