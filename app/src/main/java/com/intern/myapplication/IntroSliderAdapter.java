package com.intern.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class IntroSliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public IntroSliderAdapter(Context context) {
        this.context = context;
    }

    int images[] = {
            R.drawable.app_intro_bg_yellow,
            R.drawable.app_intro_bg_yellow,
            R.drawable.app_intro_bg_yellow

    };

    int headings[]={
            R.string.first_intro_head,
            R.string.second_intro_head,
            R.string.third_intro_head

    };

    int descriptions[]={

            R.string.intro_subText1,
            R.string.intro_subText1,
            R.string.intro_subText1
    };


    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {

        return view == (ConstraintLayout)object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {


        layoutInflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.slide_layout,container,false);
        ImageView imageView=view.findViewById(R.id.intro_Head_image);
        TextView heading=view.findViewById(R.id.intro_Head_text);
        TextView desc=view.findViewById(R.id.intro_sub_Head);

        imageView.setImageResource(images[position]);
        heading.setText(headings[position]);
        desc.setText(descriptions[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);

    }
}
