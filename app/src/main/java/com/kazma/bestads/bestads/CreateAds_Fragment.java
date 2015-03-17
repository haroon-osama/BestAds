package com.kazma.bestads.bestads;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by MohammedOsama on 2/23/15.
 */
public class CreateAds_Fragment extends Fragment {

    View rootview;
    EditText adName, adPrice;
    Spinner adCategories;
    CheckBox accept;
    Button postAd;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.createads_layout, container, false);
        initialize();
        return rootview;

    }

    private void initialize() {

        adName = (EditText) rootview.findViewById(R.id.etAdName);
        adPrice = (EditText) rootview.findViewById(R.id.etAdPrice);
        adCategories = (Spinner) rootview.findViewById(R.id.spAdCategories);
        accept = (CheckBox) rootview.findViewById(R.id.cbAccept);
        postAd = (Button) rootview.findViewById(R.id.btnPostAd);
    }

    public void setPostAd(View v){

    }

}
