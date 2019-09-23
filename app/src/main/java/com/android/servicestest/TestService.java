package com.android.servicestest;

import android.app.IntentService;
import android.app.Notification;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

import static android.content.ContentValues.TAG;

public class TestService extends IntentService {
    public TestService() {
        super("Test");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "onHandleIntent: " + intent.getStringExtra("Test"));

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Notification notification = new Notification.Builder(this, "CHANNEL")
                .setContentText("REAL NOTI")
                .build();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public void onStart(@Nullable Intent intent, int startId) {
        super.onStart(intent, startId);
        Log.d(TAG, "onStart: " + startId);
    }



    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
