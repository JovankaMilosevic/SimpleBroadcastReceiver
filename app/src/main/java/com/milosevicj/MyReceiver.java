/*
* @author Jovanka Milosevic
* */

package com.milosevicj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("Broadcast receiver", "Broadcast message is received");
        Toast.makeText(context, "Hello. Broadcast message is received.", Toast.LENGTH_LONG).show();
    }
}