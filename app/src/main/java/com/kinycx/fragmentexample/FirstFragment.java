package com.kinycx.fragmentexample;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class FirstFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //VIEW CHE CONTIENE (HOLD) TUTTI GLI ELEMENTI DEL DESIGN

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        //per inserire qualunque cosa bisogna richiamare la view
        //view.findViewById(QUALCOSA)


        return view;
    }
}
