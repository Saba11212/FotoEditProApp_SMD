package com.sabakarim.fotoeditpro_smd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class done extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);
        ImageView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                // Handle the click event, navigate to forgot_pass.xml
                Intent intent = new Intent(getApplicationContext(), edit.class); // Replace with the actual name of your activity
                startActivity(intent);
            }
        });


    }
}