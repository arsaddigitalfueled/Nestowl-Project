package com.example.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.newprojectr.NewProjectHomeBuyer;
import com.example.newprojectr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AlertsFragmetn extends Fragment {
    TextView textView;


    public AlertsFragmetn() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_alerts_fragmetn, container, false);
        /*textView=view.findViewById(R.id.alerts_multipul_card);*/


        return view;
    }

}
