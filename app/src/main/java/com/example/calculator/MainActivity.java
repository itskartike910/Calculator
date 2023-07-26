package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void normalCalc(View v1){
        Intent intent1 = new Intent(this,Normal.class);
        startActivity(intent1);
    }
    public void numeralCalc(View v2){
        Intent intent2 = new Intent(this,NumeralCalc.class);
        startActivity(intent2);
    }
    public void discountCalc(View v3){
        Intent intent3 = new Intent(this,Discount.class);
        startActivity(intent3);
    }
    public void currencyCalc(View v4){
        Intent intent4 = new Intent(this,Currency.class);
        startActivity(intent4);
    }
    public void BMICalc(View v5){
        Intent intent5 = new Intent(this,BMI.class);
        startActivity(intent5);
    }
    public void ScientificCalc(View v6){
        Intent intent6 = new Intent(this,ScientificCalc.class);
        startActivity(intent6);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}