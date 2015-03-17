package com.kazma.bestads.bestads;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Acad on 3/10/2015.
 */
public class RegisterUser extends Activity {

    EditText firstName, lastName, email, password, cPassword;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initialize();
    }

    private void initialize() {
        firstName = (EditText) findViewById(R.id.etFirstName);
        lastName = (EditText) findViewById(R.id.etLastName);
        email = (EditText) findViewById(R.id.etRegisterEmail);
        password = (EditText) findViewById(R.id.etRegisterPassword);
        cPassword = (EditText) findViewById(R.id.etRegisterPasswordConfirm);
        register = (Button) findViewById(R.id.btnRegister);
    }
}
