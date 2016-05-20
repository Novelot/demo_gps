package com.novelot.demo.gps;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by 刘云龙 on 2016/5/20.
 */
public class LocationUpdatesListener implements LocationListener {
    @Override
    public void onLocationChanged(Location location) {
        Log.v("novelot", String.format("经纬:[%.2f,%.2f]", location.getLongitude(), location.getLatitude()));
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
        Log.v("novelot", "onStatusChanged");
    }

    @Override
    public void onProviderEnabled(String s) {
        Log.v("novelot", "onProviderEnabled");
    }

    @Override
    public void onProviderDisabled(String s) {
        Log.v("novelot", "onProviderDisabled");
    }
}
