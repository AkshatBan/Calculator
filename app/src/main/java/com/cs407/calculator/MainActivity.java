package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void additionFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        showAdd(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
    }
    public void showAdd(int n1, int n2){
        Intent intent=new Intent(this, Result.class);
        String result = String.valueOf(n1 + n2);
        intent.putExtra("message", result);
        startActivity(intent);
    }

    public void subtractionFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        showSub(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
    }
    public void showSub(int n1, int n2){
        Intent intent=new Intent(this, Result.class);
        String result = String.valueOf(n1 - n2);
        intent.putExtra("message", result);
        startActivity(intent);
    }
    public void multFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        showMult(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
    }
    public void showMult(int n1, int n2){
        Intent intent=new Intent(this, Result.class);
        String result = String.valueOf(n1 * n2);
        intent.putExtra("message", result);
        startActivity(intent);
    }
    public void divFunction(View view){
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        showDiv(Integer.parseInt(num1.getText().toString()), Integer.parseInt(num2.getText().toString()));
    }
    public void showDiv(int n1, int n2){
        Intent intent=new Intent(this, Result.class);
        if(n2 == 0) {
            intent.putExtra("message", "Cannot divide by zero!");
            startActivity(intent);
        } else {
            String result = String.valueOf(n1 / n2);
            intent.putExtra("message", result);
            startActivity(intent);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}