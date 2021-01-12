package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class NestOwnersSixteen extends AppCompatActivity {
    FrameLayout frame_make_offer_first,frame_start_offers,frame_last,view_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_owners_sixteen);
        frame_make_offer_first=findViewById(R.id.make_offer_arshi_one);
        frame_start_offers =findViewById(R.id.start_an_offer_nest_owner);
        frame_last=findViewById(R.id.make_an_offer_arshi_last);
        view_profile=findViewById(R.id.view_profile_nineteen);
        view_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestOwnersSixteen.this,SahilDahiyaReviews.class);
                startActivity(intent);
            }
        });
        frame_last.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestOwnersSixteen.this,MakeOfferActivity.class);
                startActivity(intent);
            }
        });
        frame_start_offers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestOwnersSixteen.this,StartAnOffer.class);
                startActivity(intent);
            }
        });
        frame_make_offer_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestOwnersSixteen.this,MakeOfferActivity.class);
                startActivity(intent);
            }
        });
    }
}
