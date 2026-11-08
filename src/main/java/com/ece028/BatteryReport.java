package com.ece028;

public class BatteryReport {

    public String getBatteryStatus(double percentage) {

        if (percentage >= 100) {
            return "Replacement Mandatory";
        } else if (percentage >= 80) {
            return "Replacement Recommended";
        } else {
            return "Battery Condition Good";
        }
    }
}