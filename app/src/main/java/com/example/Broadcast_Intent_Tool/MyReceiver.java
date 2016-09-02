package com.example.Broadcast_Intent_Tool;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Bundle RecExtras = intent.getExtras() ;
        float value = RecExtras.getFloat("value");
        Toast.makeText(context, "MyReceiver.  " + value, Toast.LENGTH_LONG).show();
    }
}