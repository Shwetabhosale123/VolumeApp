package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cylinder extends AppCompatActivity {
    EditText editText_cylinderRadius,editText_cylinderHeight;

    TextView cylinderTextView, cylinderResult;
    Button cylinderBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cylinder);

        editText_cylinderRadius=findViewById(R.id.editText_cylinderRadius);
        editText_cylinderHeight=findViewById(R.id.editText_cylinderHeight);
        cylinderTextView=findViewById(R.id.cylinderTextView);
        cylinderResult=findViewById(R.id.cylinderResult);
        cylinderBtn=findViewById(R.id.cylinderBtn);

        cylinderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String radius=editText_cylinderRadius.getText().toString();
                String height=editText_cylinderRadius.getText().toString();
                int r = Integer.parseInt(radius);
                int h = Integer.parseInt(height);

                //V=πr 2 h
                double volume =3.14159*r*2*h;
                cylinderResult.setText("V = " + volume + " m");
            }
        });

    }
}