package com.example.emulatororrealdevice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
    }

    private void initViews() {
        TelephonyManager tm = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        String networkOperator = tm.getNetworkOperatorName();
        if("Android".equals(networkOperator)) {
            // Emulator
            Log.d("@@@","Emulator");
        }
            // Device
        Log.d("@@@","Device");

    }

}