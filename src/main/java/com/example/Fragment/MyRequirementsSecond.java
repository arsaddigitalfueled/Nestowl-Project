package com.example.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.newprojectr.AkshitActivity;
import com.example.newprojectr.BuyerDetails;
import com.example.newprojectr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyRequirementsSecond extends Fragment {
    FrameLayout frame_view;


    public MyRequirementsSecond() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_requirements_second, container, false);

        frame_view=view.findViewById(R.id.requirement_proposal_card);
        frame_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), AkshitActivity.class));

            }
        });

        return view;
    }

}
