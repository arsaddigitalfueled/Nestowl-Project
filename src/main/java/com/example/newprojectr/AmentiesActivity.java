package com.example.newprojectr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.AdapterClass.CardAdapterAmenties;

import java.util.ArrayList;

public class AmentiesActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<Integer> firslist = new ArrayList<>();
    ArrayList<String> secondlist = new ArrayList<>();
    CardAdapterAmenties adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenties);
        recyclerView = findViewById(R.id.recycler_card_amenties);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));



        firslist.add(R.drawable.home_icon_tym);
        firslist.add(R.drawable.mediation_icon);
        firslist.add(R.drawable.swiming_pool);
        firslist.add(R.drawable.swiming_pool);
        firslist.add(R.drawable.aaaa_png);
        firslist.add(R.drawable.security_icon);
        firslist.add(R.drawable.kids_play_icon);
        firslist.add(R.drawable.club_house);

        secondlist.add("Power Back Up");
        secondlist.add("Mediation");
        secondlist.add("Swiming");
        secondlist.add("Rain Water \nHarvesting");
        secondlist.add("Event Space \nAmphitheatre");
        secondlist.add("Security");
        secondlist.add("Kids Play Area");

        secondlist.add("Club House");

        adapter = new CardAdapterAmenties(this,firslist,secondlist);
        recyclerView.setAdapter(adapter);


    }
}
