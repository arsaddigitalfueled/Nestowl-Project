package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.AdapterClass.Pager;
import com.example.Fragment.PostPropertyViewPagerBasicDetails;
import com.example.Fragment.PostpropertySecond;
import com.example.Fragment.ProjectPhotos;
import com.google.android.material.tabs.TabLayout;

public class PostPropertyViewPagerActivity extends AppCompatActivity implements TabLayout.OnTabSelectedListener{
    ViewPager vp;
    TabLayout tab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_property_view_pager);
        vp = findViewById(R.id.view_pager_post_property);
        tab = findViewById(R.id.tab_post_property);
        setupViewPager(vp);
        tab.setupWithViewPager(vp);

    }

    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new PostPropertyViewPagerBasicDetails(), "Basic Details");
        adapter.addFragment(new PostpropertySecond(), "Property Feature");
        adapter.addFragment(new PostpropertySecond(), "Pricing other");
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
