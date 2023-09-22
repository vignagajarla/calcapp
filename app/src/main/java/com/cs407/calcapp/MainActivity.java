package com.cs407.calcapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void additionFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                + Integer.parseInt(integer2.getText().toString());
        Log.i("INFO", String.valueOf(result));

        goToResult(String.valueOf(result));
    }

    public void subtractionFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                - Integer.parseInt(integer2.getText().toString());
        Log.i("INFO", String.valueOf(result));

        goToResult(String.valueOf(result));
    }

    public void multiplicationFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        int result = Integer.parseInt(integer1.getText().toString())
                * Integer.parseInt(integer2.getText().toString());
        Log.i("INFO", String.valueOf(result));

        goToResult(String.valueOf(result));
    }

    public void divisonFunction(View view){
        EditText integer1 = (EditText) findViewById(R.id.integer1);
        EditText integer2 = (EditText) findViewById(R.id.integer2);
        String result = "";
        if(Integer.parseInt(integer2.getText().toString()) ==0){
             result = "Cannot divide by zero";
        }else {
            int num = Integer.parseInt(integer1.getText().toString())
                    / Integer.parseInt(integer2.getText().toString());
             result = String.valueOf(num);
        }
        goToResult(result);
    }

    public void goToResult(String result){
        Intent intent = new Intent(this, result.class);
        intent.putExtra("message", result);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}