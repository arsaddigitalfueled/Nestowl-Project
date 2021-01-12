package com.example.newprojectr;

import android.content.Intent;
import android.os.Bundle;

import com.example.Fragment.ActivityFragment;
import com.example.Fragment.AlertParentLeadsFragment;
import com.example.Fragment.HomeScreenTwo;
import com.example.Fragment.ProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class HomeScreenSeller extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
   public BottomNavigationView bottomNavigationView;
    FrameLayout frame_seller;
    LinearLayout lnr_owner_plans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen_seller);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        bottomNavigationView=findViewById(R.id.bottom_sellerr);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        lnr_owner_plans=findViewById(R.id.lnr_owner_plans_id);
        NavigationView navigationView = findViewById(R.id.nav_view);
        frame_seller =findViewById(R.id.frame_toolbar_seller);
        lnr_owner_plans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeScreenSeller.this,OwnerPlans.class);
                startActivity(intent);
            }
        });
        frame_seller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreenSeller.this,PostRequirementSkip.class);
                startActivity(intent);
            }
        });
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_home_two,new HomeScreenTwo()).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId()==R.id.navigation_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_two,new HomeScreenTwo()).commit();

                } else if (menuItem.getItemId()==R.id.navigation_activity_second){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_two,new ActivityFragment()).commit();




                }else if (menuItem.getItemId()==R.id.nav_post_property){

                }else if (menuItem.getItemId()==R.id.navigation_alert){


                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_two,new AlertParentLeadsFragment()).commit();


                }else if (menuItem.getItemId()==R.id.navigation_profile){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_two,new ProfileFragment()).commit();
                }

                return true;
            }
        });

/*
        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_home_two,new HomeScreenTwo()).commit();
*/

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_screen_seller, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
