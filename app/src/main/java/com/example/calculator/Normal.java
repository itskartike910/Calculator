package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Normal extends AppCompatActivity {
    public EditText e1, e2;
    public TextView t1;
    public Button b1, b2, b3, b4, b5, b6, b7;
    int num1, num2;

    public boolean getNumbers() {
        e1 = (EditText) findViewById(R.id.editTextNumber8);
        e2 = (EditText) findViewById(R.id.editTextNumber10);
        t1 = (TextView) findViewById(R.id.result);

        // taking input from text box 1
        String s1 = e1.getText().toString();
        // taking input from text box 2
        String s2 = e2.getText().toString();

        if (s1.equals(null) && s2.equals(null)) {
            String r1  ="Please Enter The Value 1" ;
            String r2  ="Please Enter The Value 2" ;
            e1.setText(r1);
            e2.setText(r2);
            return false;
        }
        if (s1.equals(null) && !s2.equals(null)) {
            String result = "Please Enter The Value 1";
            e1.setText(result);
            return false;
        }if (!s1.equals(null) && s2.equals(null)) {
            String result = "Please Enter The Value 2";
            e2.setText(result);
            return false;
        }
        if (s1.equals("Please Enter The Value 1") || s2.equals("Please Enter The Value 2")) {
            return false;
        }
        if ((!s1.equals(null) && s2.equals(null)) || (!s1.equals("") && s2.equals(""))) {
            String result = "Please Enter The Value 2";
            e2.setText(result);
            return false;
        }
        if ((s1.equals(null) && !s2.equals(null)) || (s1.equals("") && !s2.equals(""))) {
            //checkAndClear();
            String result = "Please Enter The Value 1";
            e1.setText(result);
            return false;
        }
        if ((s1.equals(null) && s2.equals(null)) || (s1.equals("") && s2.equals(""))) {
            //checkAndClear();
            String result1 = "Please Enter The Value 1";
            e1.setText(result1);
            String result2 = "Please Enter The Value 2";
            e2.setText(result2);
            return false;
        }
            // converting string to int.
        num1 = Integer.parseInt(s1);
            // converting string to int.
        num2 = Integer.parseInt(s2);
        return true;
    }

    public void doSum(View v) {
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 + num2;
            Toast.makeText(Normal.this, "Your Addition has been calculated...", Toast.LENGTH_SHORT).show();
            t1.setText(Integer.toString(sum));
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    public void clearTextNum1(View v) {
        // get the input numbers
        e1.getText().clear();
    }

    public void clearTextNum2(View v) {
        // get the input numbers
        e2.getText().clear();
    }

    public void doPow(View v) {

        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            double sum = Math.pow(num1, num2);
            Toast.makeText(Normal.this, "Your Pow(A^B) has been calculated...", Toast.LENGTH_SHORT).show();
            t1.setText(Double.toString(sum));
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    // a public method to perform subtraction
    public void doSub(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 - num2;
            Toast.makeText(Normal.this, "Your Subtraction has been calculated...", Toast.LENGTH_SHORT).show();
            t1.setText(Integer.toString(sum));
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    // a public method to perform multiplication
    public void doMul(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            int sum = num1 * num2;
            Toast.makeText(Normal.this, "Your Multiplication has been calculated...", Toast.LENGTH_SHORT).show();
            t1.setText(Integer.toString(sum));
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    // a public method to perform Division
    public void doDiv(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            // displaying the text in text view assigned as t1
            Toast.makeText(Normal.this, "Your Division has been calculated...", Toast.LENGTH_SHORT).show();
            if(num2==0){
                String s = "Undefined";
                t1.setText(s);
            }
            else{
                double sum = num1 / (num2 * 1.0);
                t1.setText(Double.toString(sum));
            }
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    // a public method to perform modulus function
    public void doMod(View v) {
        //checkAndClear();
        // get the input numbers
        if (getNumbers()) {
            double sum = num1 % num2;
            Toast.makeText(Normal.this, "Your Modulus has been calculated...", Toast.LENGTH_SHORT).show();
            t1.setText(Double.toString(sum));
        } else {
            Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
            t1.setText("Error! Please enter Required Values");
        }
    }

    public void doRootPow(View v){
        if(getNumbers()){
            if(num2!=0){
                Toast.makeText(Normal.this, "Your RootPow(A^1/B) has been calculated...", Toast.LENGTH_SHORT).show();
                int x = 1/num2;
                double sum = Math.pow(num1,x);
                t1.setText(Double.toString(sum));
            }
            else{
                Toast.makeText(Normal.this, "Please Enter The Required Fields...", Toast.LENGTH_SHORT).show();
                t1.setText("Error! Please enter Required Values");
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        e1 = (EditText) findViewById(R.id.editTextNumber8);
        e2 = (EditText) findViewById(R.id.editTextNumber10);

        t1 = (TextView) findViewById(R.id.result);

        b1 = (Button) findViewById(R.id.buttons9);
        b2 = (Button) findViewById(R.id.buttons6);
        b3 = (Button) findViewById(R.id.buttons8);
        b4 = (Button) findViewById(R.id.buttons7);
        b5 = (Button) findViewById(R.id.buttons5);
        b6 = (Button) findViewById(R.id.buttons12);
        b7 = (Button) findViewById(R.id.buttons11);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSum(view);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSub(view);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doMul(view);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doDiv(view);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doPow(view);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doMod(view);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doRootPow(view);
            }
        });


    }
}
