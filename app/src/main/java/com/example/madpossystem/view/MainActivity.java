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
import android.widget.RadioButton;
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
    private EditText taxes;
    private EditText total;
    private RadioButton rb1,rb2,rb3,rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editText);
        num2 = (EditText)findViewById(R.id.editText2);
        calculate = (Button)findViewById(R.id.button2);
        taxes = (EditText)findViewById(R.id.editText3);
        total = (EditText)findViewById(R.id.editText4);
        RadioButton rb1 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton rb2 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton rb3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.radioButton2);

        num1.addTextChangedListener(watch);
        num2.addTextChangedListener(watch);
        rb1.setOnClickListener(first_radio_listener);
        rb2.setOnClickListener(first_radio_listener);
        rb3.setOnClickListener(first_radio_listener);
        rb4.setOnClickListener(first_radio_listener);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                double tax = (number1 * number2)*0.15;
                double totalresult = (number1 * number2) + tax;
                taxes.setText("" + String.valueOf(tax).trim());
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

    final View.OnClickListener first_radio_listener = new View.OnClickListener() {
        public void onClick(View v) {
            num1.getText().clear();
            num2.getText().clear();
            taxes.getText().clear();
            total.getText().clear();
            /*if (rb1.isChecked() == true ) {
                boolean m =( Integer.parseInt(num1.getText().toString())) >= 25000;
            }
            if (rb2.isChecked() == true ) {
                boolean m =( Integer.parseInt(num1.getText().toString())) >= 10000;
            }
            if (rb3.isChecked() == true ) {
                boolean m =( Integer.parseInt(num1.getText().toString())) >= 950000;
            }
            if (rb4.isChecked() == true ) {
                boolean m =( Integer.parseInt(num1.getText().toString())) >= 145000;
            }*/

        }
    };

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "My Simple Message Button is clicked!");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);

    }

}

