package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class ExpertLogin extends AppCompatActivity {
    EditText userID, Password;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expert_login);

        userID = findViewById(R.id.Id_login_exp);
        Password = findViewById(R.id.password_login_exp);
        progressBar = findViewById(R.id.loginProgressbarExpert);
    }

    private void LoginUser(){
        String userid, password;
        userid = userID.getText().toString();
        password = Password.getText().toString();
        Log.d("data Login  user id ", userid);
        Log.d("data Login  password" , password);
        // ---------------------------------Validation   Part------------------------------------------
        if (TextUtils.isEmpty(userid)) {
            userID.setError("Email is Required !");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Password.setError("Password is Required !");
            return;
        }
        progressBar.setVisibility(View.VISIBLE);

        startActivity(new Intent(ExpertLogin.this, ProfileForExpert.class));

        //---------------------------------------------------------------------------------------
    }
    public void GoToViewYourProifle(View view) {LoginUser(); }

    public void goToRgister(View view) { startActivity(new Intent(ExpertLogin.this, RegisterScreen.class));}
}
