package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class ScreenSixteenDetailsPage extends AppCompatActivity {
    FrameLayout frame_make_offer,frame_start_offer,frame_amenties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_sixteen_details_page);
        frame_make_offer = findViewById(R.id.make_offer_arshi_onee);
        frame_start_offer=findViewById(R.id.start_an_sixteeen);
        frame_amenties=findViewById(R.id.amenties_sixteen);
        frame_amenties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenSixteenDetailsPage.this,AmentiesActivity.class);
                startActivity(intent);

            }
        });
        frame_start_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenSixteenDetailsPage.this,StartAnOffer.class);
                startActivity(intent);
            }
        });
        frame_make_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenSixteenDetailsPage.this,MakeOfferActivity.class);
                startActivity(intent);
            }
        });
    }
}
