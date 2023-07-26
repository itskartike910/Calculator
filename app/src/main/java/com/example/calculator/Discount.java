package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Discount extends AppCompatActivity {
    private EditText editText1,editText2,editText3;
    private TextView textView1,textView2;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount2);
        editText1 = findViewById(R.id.editTextNumber4);
        editText2 = findViewById(R.id.editTextNumber3);
        editText3 = findViewById(R.id.editTextNumber5);
        button = findViewById(R.id.buttons2);
        textView1 = findViewById(R.id.textView18);
        textView2 = findViewById(R.id.textView17);

        button.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                Toast.makeText(Discount.this, "Your Final Price has been calculated...", Toast.LENGTH_SHORT).show();
                String s1 = editText1.getText().toString();
                int op = Integer.parseInt(s1);
                String s2 = editText2.getText().toString();
                int ds = Integer.parseInt(s2);
                String s3 = editText3.getText().toString();
                int gst = Integer.parseInt(s3);
                double discount = op*ds/100.00;
                double taxes = op*gst/100.00;
                double fp = (op-discount+taxes);
                textView1.setText("₹ "+ fp);
                if(fp<op && fp>=1)
                    textView2.setText("You save ₹ "+(discount-taxes));
                else
                    textView2.setText("You save nothing, Final price is greater than Original price.");
            }
        });
    }
}