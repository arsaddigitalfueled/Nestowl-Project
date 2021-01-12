package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class SahilDahiyaCircle extends AppCompatActivity {
    FrameLayout frame_see_if_you_are_eligible;
    TextView tv,tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sahil_dahiya_circle);
        tv = findViewById(R.id.reviews);
        frame_see_if_you_are_eligible =findViewById(R.id.see_if_you_eligible);
        frame_see_if_you_are_eligible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SahilDahiyaCircle.this, SecondDealOffer.class);
                startActivity(intent);

            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SahilDahiyaCircle.this, SahilDahiyaTwo.class);
                startActivity(intent);
            }
        });

    }
}
