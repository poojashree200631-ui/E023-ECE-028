package com.ece028;

public class ServiceJobCard {

    private String customerName;
    private String equipmentType;
    private String serviceDescription;
    private String technicianName;

    public ServiceJobCard(String customerName, String equipmentType,
                          String serviceDescription, String technicianName) {
        this.customerName = customerName;
        this.equipmentType = equipmentType;
        this.serviceDescription = serviceDescription;
        this.technicianName = technicianName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public String getTechnicianName() {
        return technicianName;
    }
}