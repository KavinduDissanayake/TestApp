package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class ProfileForStudent extends AppCompatActivity  implements AdapterView.OnItemSelectedListener{
    private Spinner spinner;
    EditText qualifiaction;
    String item;
    private static final String[] paths = {"programming", "quality assurance","project management","network administration"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_for_student);
        spinner = (Spinner)findViewById(R.id.spinner);
        qualifiaction=findViewById(R.id.student_pro_qualif);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(ProfileForStudent.this,
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

    public void storeData(View view) {storeData(); }

    private void storeData(){
        Log.d("Register get iT",item);
        String qulafi;
        qulafi = qualifiaction.getText().toString();
        Log.d("data Login  qulafi id ", qulafi);
    }


}
