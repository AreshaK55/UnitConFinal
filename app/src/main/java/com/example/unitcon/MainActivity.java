package com.example.unitcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView textView, textView2, textView4, value;
    Button  button, button1, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.uc);
        textView2 = findViewById(R.id.others);
        textView4 = findViewById(R.id.textView4);
        value = findViewById(R.id.valueinpounds);

        editText = findViewById(R.id.editTextNumber);
        button = findViewById(R.id.action);
        button1 = findViewById(R.id.action1);
        button2 = findViewById(R.id.action2);
        button3 = findViewById(R.id.action3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConvertfromKilotoPounds();
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Convertfromcmtom();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Convertfromctof();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Convertfrommtofeet();
            }
        });

    }
    private void ConvertfromKilotoPounds(){
            String valueinkg = editText.getText().toString();
            double kilo = Double.parseDouble(valueinkg);
            double pounds = kilo*2.205;
            value.setText("" + pounds + " pounds");
    }
    private void Convertfromcmtom(){
        String valueinkg = editText.getText().toString();
        double kilo = Double.parseDouble(valueinkg);
        double pounds = kilo/100;
        value.setText("" + pounds + " m");
    }
    private void Convertfrommtofeet(){
        String valueinkg = editText.getText().toString();
        double kilo = Double.parseDouble(valueinkg);
        double pounds = kilo*3.281;
        value.setText("" + pounds + " feet");
    }
    private void Convertfromctof(){
        String valueinkg = editText.getText().toString();
        double kilo = Double.parseDouble(valueinkg);
        double pounds = (kilo*(1.8)+32);
        value.setText("" + pounds + " farenheit");
    }
}