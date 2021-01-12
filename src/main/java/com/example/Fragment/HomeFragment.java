package com.example.Fragment;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.newprojectr.HomeScreen;
import com.example.newprojectr.LoginActivity;
import com.example.newprojectr.NestOwnersSixteen;
import com.example.newprojectr.NewProjectHomeBuyer;
import com.example.newprojectr.R;
import com.example.newprojectr.ReraActivity;
import com.example.newprojectr.SahilDahiyaCircle;
import com.example.newprojectr.SahilDahiyaReviews;
import com.example.newprojectr.SaleProperties;
import com.example.newprojectr.SaveMoreActivity;
import com.example.newprojectr.ScreenSixteenDetailsPage;
import com.example.newprojectr.SearchViewActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {
    FrameLayout frameLayout,new_project ;
    ImageView imageView;
    TextView tv_se_all,nes_professional,city_centre,nest_project,hot_properties,featured_product,tv_new_project;
LinearLayout lnr_save_more,lnr_hello_sahil,lnr_city,ht_properties,lnr_nest_professional,frame_rera;
ScrollView scrollView_home;
HomeScreen homeScreen;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);
        tv_new_project =view.findViewById(R.id.new_projects_alt);
        lnr_save_more=view.findViewById(R.id.save_more_linear_layour);
        lnr_city=view.findViewById(R.id.lnr_city_centric);
        new_project=view.findViewById(R.id.new_projects_home);
        new_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ReraActivity.class));


            }
        });
        scrollView_home=view.findViewById(R.id.scroll_id_home_seller);
        homeScreen= (HomeScreen) getActivity();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            scrollView_home.setOnScrollChangeListener(new View.OnScrollChangeListener() {
                @Override
                public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                    if (scrollY>100)
                    {
                        homeScreen.bottomNavigationView.setVisibility(View.GONE);

                    }
                    else {
                        homeScreen.bottomNavigationView.setVisibility(View.VISIBLE);
                    }

                }
            });
        }
        lnr_nest_professional =view.findViewById(R.id.lnr_nest_professional);
        lnr_nest_professional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NestOwnersSixteen.class));

            }
        });
        ht_properties=view.findViewById(R.id.hot_properties_nr);
        ht_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ReraActivity.class));

            }
        });
        lnr_city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ReraActivity.class));

            }
        });/*
                startActivity(new Intent(getContext(), NestOwnersSixteen.class));
*/

        lnr_hello_sahil =view.findViewById(R.id.id_home_frg_hello_sahil);
        frame_rera=view.findViewById(R.id.home_frame_nest);
        frame_rera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getContext(), ScreenSixteenDetailsPage.class));


            }
        });
        lnr_hello_sahil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SahilDahiyaReviews.class));

            }
        });
        lnr_save_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaveMoreActivity.class));


            }
        });

        nes_professional=view.findViewById(R.id.see_all_nest_professional);
        city_centre= view.findViewById(R.id.see_all_city_centre);
        nest_project = view.findViewById(R.id.see_all_new_project);
        hot_properties=view.findViewById(R.id.see_all_hot_properties);
        featured_product=view.findViewById(R.id.see_all_featured_product);
        imageView = view.findViewById(R.id.search_view);
        tv_se_all = view.findViewById(R.id.see_all_nestowener);
        tv_new_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), NewProjectHomeBuyer.class));

            }
        });

        featured_product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        hot_properties.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        nest_project.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        city_centre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        nes_professional.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        tv_se_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SaleProperties.class));

            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), SearchViewActivity.class));

            }
        });
        return view;
    }


}
