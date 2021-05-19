package com.ro.weather;

public class WeatherReport implements Reporter{
    @Override
    public void print() {
        System.out.println("Ding dong");
    }
}
