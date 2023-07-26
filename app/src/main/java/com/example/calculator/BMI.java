package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BMI extends AppCompatActivity {
    private Button button;
    private TextView textView5;
    private EditText editText1;
    private EditText editText2;
    private TextView textView7;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        button = findViewById(R.id.buttons);
        textView5 = findViewById(R.id.textView5);
        editText1 = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);
        textView7 = findViewById(R.id.textView7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BMI.this,"Your BMI has been calulated...", Toast.LENGTH_SHORT).show();
                String s1 = editText1.getText().toString();
                int weight = Integer.parseInt(s1);
                String s2 = editText2.getText().toString();
                int height = Integer.parseInt(s2);
                double height2 = (height*height)/10000.00;
                double bmi = weight/height2;
                textView5.setText(bmi+"");
                if(bmi<=18.5 && bmi>=16.0){
                    textView7.setText("According to your BMI, your weight is Underweight.");
                }
                else if(bmi>18.5 && bmi<=25.0){
                    textView7.setText("According to your BMI, your weight is Normal.");
                }
                else if(bmi>25.0 && bmi<=40.0){
                    textView7.setText("According to your BMI, your weight is Overweight.");
                }
                else{
                    textView7.setText("Your BMI is NOT Valid.");
                }

            }
        });
    }
}