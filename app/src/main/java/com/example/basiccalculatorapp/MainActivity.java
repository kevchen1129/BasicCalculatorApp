package com.example.basiccalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View view){
        EditText first = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText second = (EditText)findViewById(R.id.editTextSecondNumber);

        int num1  = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(second.getText().toString());
        int res = num1 + num2;
        goToActivity2(String.valueOf(res));

    }
    public void subtract(View view){
        EditText first = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText second = (EditText)findViewById(R.id.editTextSecondNumber);

        int num1  = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(second.getText().toString());
        int res = num1 - num2;
        goToActivity2(String.valueOf(res));

    }
    public void mutiply(View view){
        EditText first = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText second = (EditText)findViewById(R.id.editTextSecondNumber);

        int num1  = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(second.getText().toString());
        int res = num1 * num2;
        goToActivity2(String.valueOf(res));

    }
    public void divide(View view){
        EditText first = (EditText) findViewById(R.id.editTextFirstNumber);
        EditText second = (EditText)findViewById(R.id.editTextSecondNumber);

        int num1  = Integer.parseInt(first.getText().toString());
        int num2 = Integer.parseInt(second.getText().toString());
        int res = num1 / num2;
        goToActivity2(String.valueOf(res));

    }

    public void goToActivity2(String res){
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message",res);
        startActivity(intent);
    }
}