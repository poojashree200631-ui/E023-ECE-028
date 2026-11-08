package com.ece028;

public class AMCPlan {

    private String planName;
    private double rate;
    private int visitsPerYear;

    public AMCPlan(String planName, double rate, int visitsPerYear) {
        this.planName = planName;
        this.rate = rate;
        this.visitsPerYear = visitsPerYear;
    }

    public String getPlanName() {
        return planName;
    }

    public double getRate() {
        return rate;
    }

    public int getVisitsPerYear() {
        return visitsPerYear;
    }

    public double calculateAMC(double equipmentValue) {
        return Math.max(1500, equipmentValue * rate);
    }
}