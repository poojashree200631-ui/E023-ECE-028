package com.ece028;

import java.time.LocalDate;

public class ServiceScheduler {

    public void scheduleVisits(String planName, LocalDate startDate) {

        int visits;

        if (planName.equalsIgnoreCase("BASIC")) {
            visits = 2;
        } else {
            visits = 4;
        }

        System.out.println("Scheduled Service Visits:");

        for (int i = 1; i <= visits; i++) {
            LocalDate visitDate = startDate.plusMonths(12 / visits * i);
            System.out.println("Visit " + i + ": " + visitDate);
        }
    }
}