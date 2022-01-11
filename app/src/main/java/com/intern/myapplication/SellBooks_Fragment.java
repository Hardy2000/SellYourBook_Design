package com.intern.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SellBooks_Fragment extends Fragment {

    private View sf_homeview;

    public SellBooks_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        sf_homeview = inflater.inflate(R.layout.fragment_sell_books_, container, false);
        return sf_homeview;

    //Connect Sell_your_books activity after clicking item view in recycler


    }
}