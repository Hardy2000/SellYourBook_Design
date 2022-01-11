package com.intern.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sell_your_books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_your_books);
        TextView tool_Bar_Title = getSupportActionBar().getCustomView().findViewById(R.id.activity_title);
        ImageButton back_button = getSupportActionBar().getCustomView().findViewById(R.id.back_button);

        tool_Bar_Title.setText("Sell your books ");
    }
}