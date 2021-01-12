package com.example.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.newprojectr.PostPropertyViewPagerActivity;
import com.example.newprojectr.R;
import com.example.newprojectr.ReviewActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class PostPropertyViewPagerBasicDetails extends Fragment {

    TextView tv_continue;


    public PostPropertyViewPagerBasicDetails() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_post_property_view_pager_basic_details, container, false);
        tv_continue = view.findViewById(R.id.frag_continue_view_pager);
        tv_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ReviewActivity.class));
            }
        });

        return view;
    }

}
