package com.ece028;

import java.time.LocalDate;

public class ServiceVisit {

    private String customerName;
    private LocalDate visitDate;
    private String visitStatus;

    public ServiceVisit(String customerName, LocalDate visitDate,
                        String visitStatus) {
        this.customerName = customerName;
        this.visitDate = visitDate;
        this.visitStatus = visitStatus;
    }

    public String getCustomerName() {
        return customerName;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public String getVisitStatus() {
        return visitStatus;
    }
}