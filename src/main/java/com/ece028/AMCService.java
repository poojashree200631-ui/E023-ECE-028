package com.ece028;

public class AMCService {

    public double calculateBreakdownCharge(int calls) {
        if (calls <= 2) {
            return 0;
        }
        return (calls - 2) * 500;
    }

    public double calculateNonAMCCharge(int labourHours) {
        double charge = 800;

        if (labourHours > 1) {
            charge += (labourHours - 1) * 300;
        }

        return charge;
    }

    public double calculatePartsCharge(String planName,
                                      double partPrice,
                                      boolean underWarranty,
                                      String partName) {

        if (underWarranty) {
            return 0;
        }

        if (planName.equalsIgnoreCase("COMPREHENSIVE")
                && !partName.equalsIgnoreCase("Battery")) {
            return 0;
        }

        return partPrice;
    }
}