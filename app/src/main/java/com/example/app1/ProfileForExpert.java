package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ProfileForExpert extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private Spinner spinner;

    String item;
    private static final String[] paths = {"programming", "quality assurance","project management","network administration"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_for_expert);

        spinner = (Spinner)findViewById(R.id.spinnerq);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProfileForExpert.this,
                android.R.layout.simple_spinner_item,paths);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        item = parent.getItemAtPosition(position).toString();
        Log.d("TAG", item);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    private void Find(){
        Log.d("Register get iT",item);
        startActivity(new Intent(ProfileForExpert.this, RetriveForExpert.class));
    }

    public void Find(View view) {
        Find();
    }
}
