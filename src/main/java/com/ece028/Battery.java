package com.ece028;

public class Battery {

    private String batteryType;
    private int batteryAgeMonths;
    private int batteryLifeMonths;

    public Battery(String batteryType, int batteryAgeMonths,
                   int batteryLifeMonths) {
        this.batteryType = batteryType;
        this.batteryAgeMonths = batteryAgeMonths;
        this.batteryLifeMonths = batteryLifeMonths;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public int getBatteryAgeMonths() {
        return batteryAgeMonths;
    }

    public int getBatteryLifeMonths() {
        return batteryLifeMonths;
    }

    public double getBatteryPercentage() {
        return (double) batteryAgeMonths / batteryLifeMonths * 100;
    }
}