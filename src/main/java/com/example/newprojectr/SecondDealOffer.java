package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondDealOffer extends AppCompatActivity {
    TextView frame_see_if_you_are_eligible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_deal_offer);
        frame_see_if_you_are_eligible =findViewById(R.id.see_if_eligible_first_screen);
        frame_see_if_you_are_eligible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(SecondDealOffer.this,SaveMoreSeeifEligible.class);
                startActivity(intent);
            }
        });
    }
}
