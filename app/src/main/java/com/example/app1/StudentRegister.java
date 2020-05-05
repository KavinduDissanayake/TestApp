package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

public class StudentRegister extends AppCompatActivity {
    EditText userID,userName,Password,Email,Degree;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_register);

        userID = findViewById(R.id.id_reg_student);
        userName = findViewById(R.id.username_reg_student);
        Email = findViewById(R.id.email_reg_student);
        Degree = findViewById(R.id.degree_reg_student);
        Password = findViewById(R.id.password_reg_student);
        progressBar = findViewById(R.id.progressRegStudent);

    }

    public void RegisterAsStudent(View view) {
        Register();
    }

    public void goToLogin(View view) { startActivity(new Intent(StudentRegister.this, LoginScreen.class));}



    private void Register(){

        String userid,password,username,degree,email;
        userid = userID.getText().toString();
        username = userName.getText().toString();
        email = Email.getText().toString();
        password = Password.getText().toString();
        degree = Degree.getText().toString();


        Log.d("data Login  user id ", userid);
        Log.d("data Login  user name ", username);
        Log.d("data Login  email" , email);
        Log.d("data Login  degree" , degree);

        Log.d("data Login  password" , password);
        // ---------------------------------Validation   Part------------------------------------------
        if (TextUtils.isEmpty(userid)) {
            userID.setError("Email is Required !");
            return;
        }
        if (TextUtils.isEmpty(username)) {
            userName.setError("userName is Required !");
            return;
        }
        if (TextUtils.isEmpty(email)) {
            Email.setError("Email is Required !");
            return;
        }
        if (TextUtils.isEmpty(degree)) {
            Degree.setError("Degree is Required !");
            return;
        }
        if (TextUtils.isEmpty(password)) {
            Password.setError("Password is Required !");
            return;
        }
        progressBar.setVisibility(View.VISIBLE);
    }

    }
