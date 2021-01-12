package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.TextView;

import com.example.AdapterClass.Pager;
import com.example.Fragment.FiltersFragemetnLimit;
import com.example.Fragment.FiltersFragmentSecond;
import com.example.Fragment.PostPropertyViewPagerBasicDetails;
import com.example.Fragment.ProjectPhotos;
import com.google.android.material.tabs.TabLayout;

public class FiltersScreen extends AppCompatActivity implements TabLayout.OnTabSelectedListener {
    ViewPager viewPager_filter;
    TabLayout tab_filters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filters_screen);

        viewPager_filter =findViewById(R.id.filters_view_pager);
        tab_filters = findViewById(R.id.tab_filter_screen);
        tab_filters.addTab(tab_filters.newTab().setText("Residential"));
        tab_filters.addTab(tab_filters.newTab().setText("Commercial"));
        tab_filters.setOnTabSelectedListener(this);
getSupportFragmentManager().beginTransaction().add(R.id.frame_filter_id,new FiltersFragemetnLimit()).commit();

    }

    private void setupViewPager(ViewPager viewPager) {

        Pager adapter = new Pager(getSupportFragmentManager());
        adapter.addFragment(new FiltersFragemetnLimit(), "Residential");
        adapter.addFragment(new FiltersFragemetnLimit(), "Commercial");
        adapter.addFragment(new FiltersFragemetnLimit(), "Other");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onTabSelected(TabLayout.Tab tab) {
        if (tab.getPosition()==0){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_filter_id,new FiltersFragemetnLimit()).commit();

        }else if (tab.getPosition()==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.frame_filter_id,new FiltersFragmentSecond()).commit();

        }

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }
}
