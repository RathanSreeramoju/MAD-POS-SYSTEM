package com.example.madpossystem.view;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.madpossystem.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "My SEND Button is clicked!");
    }
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
   /* public void onButtonClick(View v) {
        double v1 = 0.15;
        EditText e1 = (EditText)findViewById(R.id.editText);
        EditText e2 = (EditText)findViewById(R.id.editText2);
        TextView3 t3 = (TextView)findViewById(R.id.textView3);
        int num1 = Integer.parseInt(e1.getText().toString());
        int num2 = Integer.parseInt(e2.getText().toString());
        int CALCULATE = (int) ((num1 * num2) * v1);
        t3.setText(Integer.toString(CALCULATE));
    }*/
}
