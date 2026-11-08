package com.ece028;

public class Installation {

    private String installationId;
    private String customerName;
    private String phone;
    private String equipmentType;
    private double equipmentValue;

    public Installation(String installationId, String customerName,
                        String phone, String equipmentType,
                        double equipmentValue) {
        this.installationId = installationId;
        this.customerName = customerName;
        this.phone = phone;
        this.equipmentType = equipmentType;
        this.equipmentValue = equipmentValue;
    }

    public String getInstallationId() {
        return installationId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getPhone() {
        return phone;
    }

    public String getEquipmentType() {
        return equipmentType;
    }

    public double getEquipmentValue() {
        return equipmentValue;
    }
}