package com.example.Fragment;


import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.Spinner;

import com.example.AdapterClass.Pager;
import com.example.newprojectr.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class ActivityMyProperties extends Fragment implements TabLayout.OnTabSelectedListener{
    ViewPager vp;
    TabLayout tab;
FrameLayout frame_filter_first,
        spinner_filter_uper;

    public ActivityMyProperties() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_activity_my_properties, container, false);
        frame_filter_first=view.findViewById(R.id.search_by_filter_properties);

spinner_filter_uper=view.findViewById(R.id.spiner_filter);
spinner_filter_uper.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Dialog dialog = new Dialog(getContext());
        dialog.setContentView(R.layout.filtersampledesign);

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.BOTTOM;
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getContext(), android.R.color.transparent)));


        dialog.getWindow().setAttributes(lp);
        dialog.show();

    }
});
        frame_filter_first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.filtersampledesign);

                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width = WindowManager.LayoutParams.MATCH_PARENT;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
                lp.gravity = Gravity.BOTTOM;
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(getContext(), android.R.color.transparent)));


                dialog.getWindow().setAttributes(lp);
                dialog.show();
            }
        });


        return view;
    }

    private void setupViewPager(ViewPager viewPager) {
        Pager adapter = new Pager(getChildFragmentManager());
        adapter.addFragment(new ActivityMyProperties(), "My Projects");
        adapter.addFragment(new ProjectPhotos(), "Floor Plan(1)");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
        adapter.addFragment(new ProjectPhotos(), "Contact");
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
