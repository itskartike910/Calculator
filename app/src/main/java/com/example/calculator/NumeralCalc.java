package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumeralCalc extends AppCompatActivity {
    private EditText editText1,editText2;
    private TextView textView1,textView2;
    private Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeral_calc);
        editText1 = findViewById(R.id.editTextNumber7);
        editText2 = findViewById(R.id.editTextNumber6);
        button1 = findViewById(R.id.buttons3);
        button2 = findViewById(R.id.buttons4);
        textView1 = findViewById(R.id.textView26);
        textView2 = findViewById(R.id.textView24);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NumeralCalc.this, "Decimal to Binary has been calculated...", Toast.LENGTH_SHORT).show();
                String s = editText1.getText().toString();
                int dec = Integer.parseInt(s);
                String bin = Integer.toBinaryString(dec);

                textView1.setText("Equivalent Binary Number:\n" + bin);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(NumeralCalc.this, "Binary to Decimal has been calculated...", Toast.LENGTH_SHORT).show();
                String s = editText2.getText().toString();
                int bin = Integer.parseInt(s,2);
                String dec = Integer.toString(bin);

                textView2.setText("Equivalent Decimal Number:\n" + dec);
            }
        });
    }
}