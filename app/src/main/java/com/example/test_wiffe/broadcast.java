package com.example.test_wiffe;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class broadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String chuoi = intent.getStringExtra(MainActivity.TEXT);
        Toast.makeText(context, chuoi, Toast.LENGTH_SHORT).show();
        Intent intent1 = new Intent(context,MyService.class);
        context.startService(intent1);
    }
}
