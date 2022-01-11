package com.intern.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Account_Fragment extends Fragment {

    private View hf_homeview;

    public Account_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        hf_homeview = inflater.inflate(R.layout.fragment_account_, container, false);

        ImageButton back_button=hf_homeview.findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(),Profile_Activity.class));
            }
        });
        return hf_homeview;
    }
}