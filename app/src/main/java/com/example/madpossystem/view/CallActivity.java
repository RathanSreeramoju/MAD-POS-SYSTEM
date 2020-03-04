package com.example.madpossystem.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.madpossystem.R;

public class CallActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.buttonCall);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent call = new Intent(Intent.ACTION_CALL);
                call.setData(Uri.parse("tel:0377778888"));

                if (ActivityCompat.checkSelfPermission(CallActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(call);
            }
        });

    }
}
