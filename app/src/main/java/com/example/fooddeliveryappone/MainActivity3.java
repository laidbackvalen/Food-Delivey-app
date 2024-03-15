package com.example.fooddeliveryappone;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
public Button africans;
public Button asians;
public Button italian;
public Button specials;
public Button japanese;

public Button buttoncat;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        africans = findViewById(R.id.africans);
        asians = findViewById(R.id.asians);
        italian = findViewById(R.id.italian);
        specials = findViewById(R.id.specials);
        japanese = findViewById(R.id.japanese);

        buttoncat = findViewById(R.id.buttoncat);
        buttoncat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity3.this, MainActivity4.class));
                buttoncat.setBackgroundColor(Color.BLACK);
                buttoncat.setTextColor(Color.WHITE);
            }
        });



    }
}