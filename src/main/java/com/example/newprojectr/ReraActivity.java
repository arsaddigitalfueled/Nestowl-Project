package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class ReraActivity extends AppCompatActivity {
    FrameLayout frame_start_offer;
    ScrollView scroll_view;
LinearLayout lnr_hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rera);
        lnr_hide=findViewById(R.id.lnr_hide_scroll);
        scroll_view=findViewById(R.id.scroll_id_rera);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            scroll_view.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                    if (scrollY>100)
                    {
                        lnr_hide.setVisibility(View.GONE);

                    }
                    else {
                        lnr_hide.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
        frame_start_offer=findViewById(R.id.start_an_rera);
        frame_start_offer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ReraActivity.this,StartAnOffer.class);
                startActivity(intent);
            }
        });
    }
}
