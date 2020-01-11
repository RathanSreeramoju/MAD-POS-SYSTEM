package com.example.madpossystem.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.madpossystem.R;
import com.example.madpossystem.SecondActivity;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    /*private static final Integer minCar = 25000;
    private static final Integer minBike = 10000;
    private static final Integer minPlane = 950000;
    private static final Integer minBoat = 145500;*/
    private EditText num1;
    private EditText num2;
    private Button calculate;
    private TextView taxes;
    private TextView total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editText);
        num2 = (EditText)findViewById(R.id.editText2);
        calculate = (Button)findViewById(R.id.button2);
        taxes = (TextView)findViewById(R.id.editText3);
        total = (TextView)findViewById(R.id.editText4);

        num1.addTextChangedListener(watch);
        num2.addTextChangedListener(watch);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                double tax = (number1 * number2)*0.15;
                double totalresult = (number1 * number2) + tax;
                taxes.setText("" + String.valueOf(tax));
                total.setText("" + String.valueOf(totalresult));
            }

        });

    }

    private TextWatcher watch = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String input1 = num1.getText().toString().trim();
            String input2 = num2.getText().toString().trim();

            calculate.setEnabled(!input1.isEmpty() && !input2.isEmpty());


        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "My Simple Message Button is clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }


       /* public void onButtonClick(View v) {
        double v1 = 0.15;
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView3 t3 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int CALCULATE = (int) ((num1 * num2) * v1);
        t3.setText(Integer.toString(CALCULATE));*/
    }

