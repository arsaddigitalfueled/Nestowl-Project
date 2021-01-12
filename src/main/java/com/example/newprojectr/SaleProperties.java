package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class SaleProperties extends AppCompatActivity {
    FrameLayout frame_contact_builder,make_offer,make_offer_second,frame_one,frame_two,frame_three;
    CardView card_sale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sale_properties);
        frame_contact_builder=findViewById(R.id.contact_builder_frame);
        make_offer=findViewById(R.id.make_offer_sale_act);
        make_offer_second=findViewById(R.id.maek_offer_two);
        frame_one=findViewById(R.id.frame_one_image);
        frame_two =findViewById(R.id.frame_two_image);
        frame_three =findViewById(R.id.frame_third_image);
        frame_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,PropertiesBhkActivity.class);
                startActivity(intent);
            }
        });
        frame_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,PropertiesBhkActivity.class);
                startActivity(intent);

            }
        });
        frame_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,PropertiesBhkActivity.class);
                startActivity(intent);

            }
        });
        card_sale=findViewById(R.id.card_sale_id);
        card_sale.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( SaleProperties.this,NestOwnersSixteen.class);
                startActivity(intent);
            }
        });
        make_offer_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,MakeOfferActivity.class);
                startActivity(intent);

            }
        });
        make_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,MakeOfferActivity.class);
                startActivity(intent);
            }
        });
        frame_contact_builder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SaleProperties.this,ReraActivity.class);
                startActivity(intent);
            }
        });
    }
}
