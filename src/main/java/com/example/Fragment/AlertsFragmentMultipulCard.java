package com.example.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.newprojectr.BuyerDetails;
import com.example.newprojectr.NestProDetails;
import com.example.newprojectr.NestProSecondProfile;
import com.example.newprojectr.R;
import com.example.newprojectr.ReraActivity;
import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlertsFragmentMultipulCard extends Fragment {
    FrameLayout frame_nest_pro,nest_pro_details,frame_fifth;


    public AlertsFragmentMultipulCard() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_alerts_fragment_multipul_card, container, false);
        frame_nest_pro=view.findViewById(R.id.fouth_card_id_alaer);
        nest_pro_details=view.findViewById(R.id.frame_last_card);
        frame_fifth=view.findViewById(R.id.frame_fifth_card);
        frame_fifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), BuyerDetails.class));

            }
        });
        nest_pro_details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NestProDetails.class));

            }
        });
        frame_nest_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NestProSecondProfile.class));

            }
        });


        return view;
    }

}
