package com.kazma.bestads.bestads;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by MohammedOsama on 2/23/15.
 */
public class Home_Fragment extends Fragment {

    View rootview;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.home_layout, container, false);
        return rootview;
    }

}
