package com.example.admin.coolweather.gson;

/**
 * Created by admin on 2018/7/25.
 */

public class AQI {
    public AQICity city;

    public class  AQICity{
        public String api;
        public  String pm25;
    }
}
