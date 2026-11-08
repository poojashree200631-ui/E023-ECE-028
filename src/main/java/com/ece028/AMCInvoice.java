package com.ece028;

public class AMCInvoice {

    private String customerName;
    private double amcAmount;
    private double gstAmount;
    private double totalAmount;

    public AMCInvoice(String customerName, double amcAmount) {
        this.customerName = customerName;
        this.amcAmount = amcAmount;
        this.gstAmount = amcAmount * 0.18;
        this.totalAmount = amcAmount + gstAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAmcAmount() {
        return amcAmount;
    }

    public double getGstAmount() {
        return gstAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}