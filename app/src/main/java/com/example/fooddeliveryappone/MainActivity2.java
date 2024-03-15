package com.example.fooddeliveryappone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
public TextView next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        next = findViewById(R.id.next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                next.setBackgroundResource(R.drawable.on_click_backgro);
                next.setTextColor(Color.WHITE);

                startActivity(new Intent(MainActivity2.this, MainActivity3.class));
                finish();
            }
        });
    }
}