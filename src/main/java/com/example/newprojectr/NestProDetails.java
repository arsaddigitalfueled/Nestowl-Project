package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NestProDetails extends AppCompatActivity {
    FrameLayout frame_nest_pro;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_pro_details);
        tv1 = findViewById(R.id.tv_view_profile);
        frame_nest_pro=findViewById(R.id.view_profile_nes_pro);
        frame_nest_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestProDetails.this,SahilDahiyaReviews.class);
                startActivity(intent);

            }
        });

    }
}
