package com.example.newprojectr;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.example.Fragment.ActivityFragmentBuer;
import com.example.Fragment.AlertParentLeadsFragment;
import com.example.Fragment.HomeFragment;
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
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.Menu;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Context context;
    LinearLayout lnr_owner_screen;
    FrameLayout frame_toolbar_post;
    FragmentManager manager = getSupportFragmentManager();

    FragmentTransaction fragmentTransaction = manager.beginTransaction();

   public BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        lnr_owner_screen=findViewById(R.id.owner_plans_home_screen);
        lnr_owner_screen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeScreen.this,OwnerPlans.class);
                startActivity(intent);
            }
        });

        setSupportActionBar(toolbar);
         bottomNavigationView = findViewById(R.id.bottom_navigation);
        TextView textView = bottomNavigationView.findViewById(R.id.nav_post_property).findViewById(R.id.largeLabel);
        textView.setTextSize(10);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        frame_toolbar_post = findViewById(R.id.toolbar_post_requirement);
        frame_toolbar_post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HomeScreen.this,PostRequirementSkip.class);
                startActivity(i);
            }
        });

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId()==R.id.navigation_home){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_one,new HomeFragment()).commit();

                } else if (menuItem.getItemId()==R.id.navigation_activity){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_one,new ActivityFragmentBuer()).commit();



                }else if (menuItem.getItemId()==R.id.nav_post_property){

                }else if (menuItem.getItemId()==R.id.navigation_alert){


                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_one,new AlertParentLeadsFragment()).commit();


                }else if (menuItem.getItemId()==R.id.navigation_profile){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout_home_one,new ProfileFragment()).commit();
                }

                return true;
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().add(R.id.frame_layout_home_one,new HomeFragment()).commit();
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
        getMenuInflater().inflate(R.menu.home_screen, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
     /*   if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {


        } else if (id == R.id.nav_post) {




        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.owner) {
            Intent intent = new Intent(context,OwnerPlans.class);
            startActivity(intent);


        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
