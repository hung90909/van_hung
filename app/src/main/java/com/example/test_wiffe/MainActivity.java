package com.example.test_wiffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
    public static final String ACTION_WIFI="com.vanhung";
    public static final String TEXT="hung";
    broadcast broadcast;
    Button click;
    EditText text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        broadcast = new broadcast();
        click = findViewById(R.id.click);
        text = findViewById(R.id.text);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACTION_WIFI);
                String chu = text.getText().toString();
                intent.setAction(ACTION_WIFI);
                intent.putExtra(TEXT,chu);
               sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        IntentFilter filter = new IntentFilter(ACTION_WIFI);
        registerReceiver(broadcast,filter);
    }

    @Override
    protected void onStop() {
        super.onStop();
        unregisterReceiver(broadcast);
    }
}