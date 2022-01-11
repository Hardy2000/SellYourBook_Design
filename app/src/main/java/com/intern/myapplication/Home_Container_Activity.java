package com.intern.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Home_Container_Activity extends AppCompatActivity {


    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_home_container);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home_activity_toolbar);

        TextView tool_Bar_Title = getSupportActionBar().getCustomView().findViewById(R.id.currentLocation);
        ImageButton chooseLocation=getSupportActionBar().getCustomView().findViewById(R.id.expand_Dialogbox_location_btn);
        chooseLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();

            }
        });

        tool_Bar_Title.setText("Custom text");

        bottomNavigationView = findViewById(R.id.home_bottom_nav_view);
        getSupportFragmentManager().beginTransaction().replace(R.id.home_container_layout, new Home_Fragment()).commit();
        bottomNavigationView.setSelectedItemId(R.id.home_home);
        //        bottomNavigationView.setSelectedItemId(R.id.home_b);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {

                    case R.id.home_home:
                        fragment = new Home_Fragment();
                        break;
                    case R.id.home_sell_book:
                        fragment = new SellBooks_Fragment();
                        break;
                    case R.id.home_pickup:
                        fragment = new Pickup_Fragment();
                        break;
                    case R.id.home_account:
                        fragment = new Account_Fragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.home_container_layout, fragment).commit();

                return true;
            }
        });
    }

    private void showDialog() {
        Dialog dialog = new Dialog(this, R.style.Link_Account_Dialog_Style);

        dialog.setContentView(R.layout.detect_location_dialogbox);
        dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT,WindowManager.LayoutParams.MATCH_PARENT);
        ImageButton button = dialog.findViewById(R.id.close_dialog_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();


            }
        });
        dialog.show();


    }


}