package com.kazma.bestads.bestads;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by MohammedOsama on 2/23/15.
 */
public class UpdateProfile_Fragment extends Fragment {

    View rootview;
    EditText name, birthDate, email, phone, company;
    Button updateProfile;

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootview = inflater.inflate(R.layout.updateprofile_layout, container, false);
        initialize();
        return rootview;
    }

    private void initialize() {

        name = (EditText) rootview.findViewById(R.id.etName);
        birthDate = (EditText) rootview.findViewById(R.id.etBirthDate);
        email = (EditText) rootview.findViewById(R.id.etEmail);
        phone = (EditText) rootview.findViewById(R.id.etPhone);
        company = (EditText) rootview.findViewById(R.id.etCompany);
        updateProfile = (Button) rootview.findViewById(R.id.btnUpdateProfile);
    }
}
