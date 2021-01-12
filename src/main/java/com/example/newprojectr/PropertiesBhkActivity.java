package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.example.AdapterClass.Pager;
import com.example.Fragment.ProjectPhotos;
import com.example.Fragment.ScreenTwentySaleRent;
import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

public class PropertiesBhkActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager viewPager;
     TabLayout tabs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_properties_bhk);
        viewPager= findViewById(R.id.view_pager);
        tabs = findViewById(R.id.tabs_properties);
        tabs.setTabGravity(TabLayout.GRAVITY_FILL);
        setupViewPager(viewPager);
        tabs.setupWithViewPager(viewPager);
    /*    frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PropertiesBhkActivity.this,AmentiesActivity.class);
                startActivity(i);
            }
        });*/



    }

    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new ProjectPhotos(), "Project(12)");
        adapter.addFragment(new ScreenTwentySaleRent(), "Floor Plan(1)");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
