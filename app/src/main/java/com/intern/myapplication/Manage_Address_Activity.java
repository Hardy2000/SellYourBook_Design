package com.intern.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Manage_Address_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manage__address_);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.toolbar_child_activity);

        TextView tool_Bar_Title = getSupportActionBar().getCustomView().findViewById(R.id.activity_title);
        ImageButton back_button = getSupportActionBar().getCustomView().findViewById(R.id.back_button);

        tool_Bar_Title.setText("Manage address");

    }
}