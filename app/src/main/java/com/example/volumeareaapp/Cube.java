package com.example.volumeareaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cube extends AppCompatActivity {

    EditText editText_cube;

    TextView cubeLength, resultCube;
    Button resultCubeBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cube);

        editText_cube = findViewById(R.id.editText_cube);
        cubeLength = findViewById(R.id.cubeLength);
        resultCube = findViewById(R.id.resultCube);
        resultCubeBtn = findViewById(R.id.resultCubeBtn);

        resultCubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String length = editText_cube.getText().toString();

                int l = Integer.parseInt(length);

                // V = l*l*l

                double volume = l*l*l;
                resultCube.setText("V = " + volume + " m^3");
            }
        });
    }
}