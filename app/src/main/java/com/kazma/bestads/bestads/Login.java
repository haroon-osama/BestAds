package com.kazma.bestads.bestads;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;


public class Login extends Activity{

    EditText email, password;
    Button signIn, signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    private void initialize() {
        email = (EditText) findViewById(R.id.etEmail);
        password = (EditText) findViewById(R.id.etPassword);
        signIn = (Button) findViewById(R.id.btnSignIn);
        signUp = (Button) findViewById(R.id.btnSignUp);
    }

    public void loginEvent(View v){
        startActivity(new Intent(Login.this, SlideMenu.class));
 }

    public void signUpEvent(View v){
        startActivity(new Intent(Login.this, RegisterUser.class));
    }

}
