package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class LoginScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);
    }

    public void goToRgister(View view) { startActivity(new Intent(LoginScreen.this, RegisterScreen.class));}

    public void goToStudentLogin(View view) {startActivity(new Intent(LoginScreen.this, StudentLogin.class));}

    public void goToExpertLogin(View view) {startActivity(new Intent(LoginScreen.this, ExpertLogin.class)); }
}
