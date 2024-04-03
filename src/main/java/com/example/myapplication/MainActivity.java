package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.ButtonExercise;
import com.example.myapplication.CalculatorActivity;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn2 = (Button) findViewById(R.id.btnButtonExercise);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(
                        MainActivity.this, ButtonExercise.class
                );
                startActivity(intent1);
            }
        });
        btn4 = (Button) findViewById(R.id.btnCalculator);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, CalculatorActivity.class);
                startActivity(intent1);
            }

        });

    }
}