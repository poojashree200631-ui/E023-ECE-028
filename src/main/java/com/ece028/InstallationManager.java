package com.ece028;

import java.util.ArrayList;
import java.util.List;

public class InstallationManager {

    private List<Installation> installations = new ArrayList<>();

    public void addInstallation(Installation installation) {
        installations.add(installation);
    }

    public void displayInstallations() {
        for (Installation installation : installations) {
            System.out.println("Installation ID: "
                    + installation.getInstallationId());
            System.out.println("Customer Name: "
                    + installation.getCustomerName());
            System.out.println("Equipment: "
                    + installation.getEquipmentType());
            System.out.println("Equipment Value: Rs."
                    + installation.getEquipmentValue());
            System.out.println("-------------------------");
        }
    }

    public int getInstallationCount() {
        return installations.size();
    }
}