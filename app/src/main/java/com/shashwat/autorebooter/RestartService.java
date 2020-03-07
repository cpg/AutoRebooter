package com.shashwat.autorebooter;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;

public class RestartService extends Service {
    String LOG_TAG = "SHASHWAT_SHASHWAT";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(LOG_TAG, "Service started");
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                PowerManager pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
                pm.reboot("Debugging");
            }
        }, 40000);
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
