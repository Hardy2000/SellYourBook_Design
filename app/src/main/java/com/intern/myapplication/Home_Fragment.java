package com.intern.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class Home_Fragment extends Fragment {


    RecyclerView hf_recyclerview;
    private View hf_homeview;
    public Home_Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        hf_homeview= inflater.inflate(R.layout.fragment_home_, container, false);
        hf_recyclerview=hf_homeview.findViewById(R.id.hf_recyclerView);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,false);
        hf_recyclerview.setLayoutManager(layoutManager);
        return hf_homeview;
    }




}