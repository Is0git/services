package com.android.servicestest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import static android.content.ContentValues.TAG;

public class Noservice extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        Log.d(TAG, "onBind: on bind");
        return null;
    }

    @Override
    public void onCreate() {
        Log.d(TAG, "onCreate: created" );
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "onStartCommand: " + "Started " + intent.getStringExtra("Test"));

        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy: " + "destroyed");
        super.onDestroy();
    }
}
