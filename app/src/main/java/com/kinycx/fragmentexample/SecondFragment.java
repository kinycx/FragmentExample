package com.kinycx.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //VIEW CHE CONTIENE (HOLD) TUTTI GLI ELEMENTI DEL DESIGN

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        //per inserire qualunque cosa bisogna richiamare la view


        return view;
    }
}