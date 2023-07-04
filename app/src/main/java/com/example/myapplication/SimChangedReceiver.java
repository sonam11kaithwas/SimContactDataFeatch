package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class SimChangedReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, final Intent intent) {

        Toast.makeText(context, "Change SIM......", Toast.LENGTH_SHORT).show();
        Log.d("SimChangedReceiver", "--> SIM state changed <--");

        // Most likely, checking if the SIM changed could be limited to
        // events where the intent's extras contains a key "ss" with value "LOADED".
        // But it is more secure to just always check if there was a change.
    }
}
