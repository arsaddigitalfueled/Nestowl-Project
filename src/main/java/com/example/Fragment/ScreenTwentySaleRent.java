package com.example.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.newprojectr.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScreenTwentySaleRent extends Fragment {


    public ScreenTwentySaleRent() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_twenty_sale_rent, container, false);
    }

}
