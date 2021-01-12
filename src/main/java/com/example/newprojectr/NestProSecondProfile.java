package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class NestProSecondProfile extends AppCompatActivity {
    FrameLayout nest_pro_second;

    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nest_pro_second_profile);
        tv1 = findViewById(R.id.tv_view_profile_second);
        nest_pro_second=findViewById(R.id.nest_pro_second);
        nest_pro_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NestProSecondProfile.this,SahilDahiyaReviews.class);
                startActivity(intent);

            }
        });

    }
}
