package com.beech.newsreader;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.util.Log;

/**
 * Created by Wayne Beech on 11/24/2015.
 */
public class BatteryReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        //log low battery
        Log.d("News reader", "Battery Low");

        //create service intent with existing context
        Intent service = new Intent(context, NewsReaderService.class);

        //stop service in progress
        context.stopService(service);
    }
}
