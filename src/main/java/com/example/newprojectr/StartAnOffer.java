package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartAnOffer extends AppCompatActivity {
    TextView tv_offer_now;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_an_offer);
        tv_offer_now = findViewById(R.id.start_offer_now_id);
        tv_offer_now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StartAnOffer.this,StartOfferDetails.class);
                startActivity(intent);
            }
        });
    }
}
