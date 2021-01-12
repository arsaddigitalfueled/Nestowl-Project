package com.example.Fragment;


import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.newprojectr.HomeScreen;
import com.example.newprojectr.HomeScreenSeller;
import com.example.newprojectr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeScreenTwo extends Fragment {
    FrameLayout frameLayout;
    TextView textView,tv_post;
    HomeScreenSeller homeScreenTwo;
    ScrollView scrollView_two;

    public HomeScreenTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_screen_two, container, false);
        frameLayout = view.findViewById(R.id.manage_property_id);
        tv_post=view.findViewById(R.id.post_property_dialog);
        homeScreenTwo= (HomeScreenSeller) getActivity();

        scrollView_two=view.findViewById(R.id.home_screen_seller_id);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            scrollView_two.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {


                    if (scrollY>100)
                    {
                        homeScreenTwo.bottomNavigationView.setVisibility(View.GONE);

                    }
                    else {
                        homeScreenTwo.bottomNavigationView.setVisibility(View.VISIBLE);
                    }

                }
            });
        }
        tv_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.boost_post_layour);

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



        frameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getContext());
                dialog.setContentView(R.layout.manage_property_layout);

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

}
