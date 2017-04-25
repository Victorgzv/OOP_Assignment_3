package com.example.vctor.findme;

import java.text.DecimalFormat;

/**
 * Created by Víctor on 24/04/2017.
 */

public class BleItem {
    public String uuid_no,distance,mac_address;
    public BleItem(String uuid, String dist,String mac_address){
        this.distance=dist;
        this.uuid_no=uuid;
        this.mac_address=mac_address;

    }
    public static double getRoundedDistance(double distance) {
        return Math.ceil(distance * 100.0D) / 100.0D;
    }
    public static String getRoundedDistanceString(double distance) {
        return new DecimalFormat("##0.00").format(getRoundedDistance(distance));
    }
    public String updateBeaconDistance( double distance) {
        return getRoundedDistanceString(distance);
    }
}
