package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_screen);
    }

    public void goToStudentRegister(View view) {  startActivity(new Intent(RegisterScreen.this, StudentRegister.class));}

    public void goTOExpertRegister(View view) { startActivity(new Intent(RegisterScreen.this, ExpertRegister.class));}
}
