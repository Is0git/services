package com.android.servicestest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.drm.DrmStore;
import android.net.Uri;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
        Button button;
        Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        final Intent intents = new Intent(this, TestService.class);
        intents.putExtra("Test", "TESTING");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

        startService(intents);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                stopService(intents);
            }
        });

    }
}
