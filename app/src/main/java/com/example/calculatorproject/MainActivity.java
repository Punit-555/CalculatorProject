package com.example.calculatorproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v){
        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
        EditText et3  = (EditText) findViewById(R.id.result);
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;
        et3.setText("Result is : " + result);
    }
    public void Subtract(View v){
        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
        EditText et3  = (EditText) findViewById(R.id.result);
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;
        et3.setText("Result is : " + result);
    }
    public void Multiply(View v){
        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
        EditText et3  = (EditText) findViewById(R.id.result);
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;
        et3.setText("Result is : " + result);
    }

    public void Divide(View v){
        EditText et1 = (EditText) findViewById(R.id.num1);
        EditText et2 = (EditText) findViewById(R.id.num2);
        EditText et3  = (EditText) findViewById(R.id.result);
        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1/n2;
        et3.setText("Result is : " + result);

    }

}