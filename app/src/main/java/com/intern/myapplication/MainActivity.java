package com.intern.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;

    IntroSliderAdapter introSliderAdapter;
    TextView[] dots;

    int currentPos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        viewPager = findViewById(R.id.intro_Slider);
        dotsLayout = findViewById(R.id.intro_dots);
        introSliderAdapter = new IntroSliderAdapter(this);
        viewPager.setAdapter(introSliderAdapter);

        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);


    }



    private void addDots(int position) {

        dots = new TextView[3];
        dotsLayout.removeAllViews();
        for (int i = 0; i < dots.length; i++) {
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(50);
            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0) {
            dots[position].setTextSize(50);
            dots[position].setTextColor(getResources().getColor(R.color.theme_blue));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            currentPos=position;
            addDots(position);


        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

    public void skip(View view) {
        startActivity(new Intent(getApplicationContext(),Login_Activity.class));
    }

    public void next(View view) {

            viewPager.setCurrentItem(currentPos + 1);


    }
}