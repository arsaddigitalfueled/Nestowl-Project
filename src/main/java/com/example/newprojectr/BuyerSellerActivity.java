package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.Fragment.AlertsFragmentMultipulCard;

import org.w3c.dom.Text;

public class BuyerSellerActivity extends AppCompatActivity {

    FrameLayout fm,fm1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buyer_seller);


        fm= findViewById(R.id.buyer);
        fm1 =findViewById(R.id.seller);

        fm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyerSellerActivity.this,HomeScreen.class);
                startActivity(intent);
            }
        });

        fm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BuyerSellerActivity.this,HomeScreenSeller.class);
                startActivity(intent);
            }
        });
    }
}
