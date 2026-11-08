package com.ece028;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class App {
    static InstallationManager manager = new InstallationManager();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== UPS AND INVERTER AMC SYSTEM =====");
            System.out.println("1. Register Installation");
            System.out.println("2. Calculate AMC Price");
            System.out.println("3. Schedule Service Visit");
            System.out.println("4. Generate AMC Invoice");
            System.out.println("5. Battery Replacement Report");
            System.out.println("6. Exit");
            System.out.println("7. Display All Installations");
            System.out.println("8. Create Service Job Card");
            System.out.println("9. Calculate Breakdown Service Charges");
            System.out.println("10. Calculate Non-AMC Service Charges");
            System.out.println("11. Calculate Parts and Warranty Charges");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
    System.out.println("\n--- Register Installation ---");

    sc.nextLine();

    System.out.print("Enter Customer Name: ");
    String name = sc.nextLine();

    System.out.print("Enter Customer Phone: ");
    String phone = sc.nextLine();

    System.out.print("Enter Equipment Type (UPS/Inverter): ");
    String equipment = sc.nextLine();

    System.out.print("Enter Equipment Value: ");
    double value = sc.nextDouble();
    
    String installationId = "INS" + System.currentTimeMillis();
    Installation installation = new Installation(
        installationId, name, phone, equipment, value);

manager.addInstallation(installation);

    System.out.println("\nInstallation Registered Successfully!");
    System.out.println("Installation ID: " + installationId);
    try {
    FileWriter fw = new FileWriter("installations.csv", true);

    fw.write(installationId + "," + name + "," + phone + "," + equipment + "," + value + "\n");

    fw.close();

    System.out.println("Customer details saved to CSV file!");

} catch (IOException e) {
    System.out.println("Error saving customer details!");
}
    System.out.println("Customer Name: " + name);
    System.out.println("Phone: " + phone);
    System.out.println("Equipment: " + equipment);
    System.out.println("Equipment Value: Rs." + value);

    break;

                case 2:
    System.out.println("\n--- Calculate AMC Price ---");

    sc.nextLine();

    System.out.print("Enter Equipment Value: ");
    double equipmentValue = sc.nextDouble();

    sc.nextLine();

    System.out.print("Enter AMC Plan (BASIC/COMPREHENSIVE): ");
    String plan = sc.nextLine();

    double rate;

if (plan.equalsIgnoreCase("BASIC")) {
    rate = 0.08;
} else if (plan.equalsIgnoreCase("COMPREHENSIVE")) {
    rate = 0.14;
} else {
    System.out.println("Invalid AMC Plan!");
    break;
}

AMCPlan amcPlan = new AMCPlan(plan, rate,
        plan.equalsIgnoreCase("BASIC") ? 2 : 4);

double amcPrice = amcPlan.calculateAMC(equipmentValue);

    double gst = amcPrice * 0.18;
    double total = amcPrice + gst;

    System.out.printf("AMC Price: Rs.%.2f%n", amcPrice);
    System.out.printf("GST: Rs.%.2f%n", gst);
    System.out.printf("Total Amount: Rs.%.2f%n", total);

    break;

                case 3:
    System.out.println("\n--- Schedule Service Visit ---");

    sc.nextLine();

    System.out.print("Enter AMC Plan (BASIC/COMPREHENSIVE): ");
    String servicePlan = sc.nextLine();

    int visits;

    if (servicePlan.equalsIgnoreCase("BASIC")) {
        visits = 2;
    } else if (servicePlan.equalsIgnoreCase("COMPREHENSIVE")) {
        visits = 4;
    } else {
        System.out.println("Invalid AMC Plan!");
        break;
    }

    System.out.println("Total Preventive Visits per Year: " + visits);

System.out.print("Enter AMC Start Date (YYYY-MM-DD): ");
String startDateInput = sc.nextLine();

LocalDate startDate = LocalDate.parse(startDateInput);

ServiceScheduler scheduler = new ServiceScheduler();
scheduler.scheduleVisits(servicePlan, startDate);

    break;

                case 4:
    System.out.println("\n--- Generate AMC Invoice ---");

    sc.nextLine();

    System.out.print("Enter Customer Name: ");
    String invoiceName = sc.nextLine();

    System.out.print("Enter Equipment Value: ");
    double invoiceValue = sc.nextDouble();

    sc.nextLine();

    System.out.print("Enter AMC Plan (BASIC/COMPREHENSIVE): ");
    String invoicePlan = sc.nextLine();

    double invoiceRate;

if (invoicePlan.equalsIgnoreCase("BASIC")) {
    invoiceRate = 0.08;
} else if (invoicePlan.equalsIgnoreCase("COMPREHENSIVE")) {
    invoiceRate = 0.14;
} else {
    System.out.println("Invalid AMC Plan!");
    break;
}

AMCPlan invoiceAMCPlan = new AMCPlan(
        invoicePlan, invoiceRate,
        invoicePlan.equalsIgnoreCase("BASIC") ? 2 : 4);

double invoicePrice = invoiceAMCPlan.calculateAMC(invoiceValue);

AMCInvoice invoice = new AMCInvoice(invoiceName, invoicePrice);

double invoiceGST = invoice.getGstAmount();
double invoiceTotal = invoice.getTotalAmount();

    System.out.println("\n========== AMC INVOICE ==========");
    System.out.println("Customer Name: " + invoiceName);
    System.out.println("AMC Plan: " + invoicePlan);
    System.out.printf("AMC Price: Rs.%.2f%n", invoicePrice);
    System.out.printf("GST (18%%): Rs.%.2f%n", invoiceGST);
    System.out.printf("Total Amount: Rs.%.2f%n", invoiceTotal);
    System.out.println("===============================");

    break;

                case 5:
    System.out.println("\n--- Battery Replacement Report ---");

    sc.nextLine();

    System.out.print("Enter Customer Name: ");
    String batteryName = sc.nextLine();

    System.out.print("Enter Battery Type (SMF/TUBULAR): ");
    String batteryType = sc.nextLine();

    System.out.print("Enter Battery Age in Months: ");
    int batteryAge = sc.nextInt();

    int batteryLife;

    if (batteryType.equalsIgnoreCase("SMF")) {
        batteryLife = 36;
    } else if (batteryType.equalsIgnoreCase("TUBULAR")) {
        batteryLife = 48;
    } else {
        System.out.println("Invalid Battery Type!");
        break;
    }

    Battery battery = new Battery(batteryType, batteryAge, batteryLife);

double batteryPercentage = battery.getBatteryPercentage();

BatteryReport batteryReport = new BatteryReport();

    System.out.println("\nCustomer Name: " + batteryName);
    System.out.println("Battery Type: " + batteryType);
    System.out.println("Battery Age: " + batteryAge + " months");
    System.out.printf("Battery Life Used: %.2f%%%n", batteryPercentage);

    String batteryStatus = batteryReport.getBatteryStatus(batteryPercentage);

System.out.println("Status: " + batteryStatus);

    break;
                case 8:
                    System.out.println("\n--- Create Service Job Card ---");

                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String jobCustomer = sc.nextLine();

                    System.out.print("Enter Equipment Type (UPS/Inverter): ");
                    String jobEquipment = sc.nextLine();

                    System.out.print("Enter Service Description: ");
                    String jobDescription = sc.nextLine();

                    System.out.print("Enter Technician Name: ");
                    String technician = sc.nextLine();
                    ServiceJobCard jobCard = new ServiceJobCard(
        jobCustomer, jobEquipment, jobDescription, technician);

                    System.out.println("\n========== SERVICE JOB CARD ==========");
                    System.out.println("Customer Name: " + jobCustomer);
                    System.out.println("Equipment: " + jobEquipment);
                    System.out.println("Service Description: " + jobDescription);
                    System.out.println("Technician: " + technician);
                    System.out.println("Status: Service Recorded");
                    try {
                        FileWriter jobFile = new FileWriter("jobcards.csv", true);

                        jobFile.write(jobCustomer + "," + jobEquipment + "," 
                                + jobDescription + "," + technician + "\n");

                        jobFile.close();

                        System.out.println("Job Card saved to CSV file!");

                    } catch (IOException e) {
                        System.out.println("Error saving Job Card!");
                    }
                    System.out.println("====================================");

                    break;
                case 9:
                    System.out.println("\n--- Breakdown Service Charges ---");

                    System.out.print("Enter Breakdown Calls Used: ");
                    int breakdownCalls = sc.nextInt();

                    AMCService service = new AMCService();

double breakdownCharge = service.calculateBreakdownCharge(breakdownCalls);

                    System.out.println("Free Breakdown Calls: 2");
                    System.out.println("Calls Used: " + breakdownCalls);
                    System.out.println("Additional Charges: Rs." + breakdownCharge);

                    break;
                case 10:
                    System.out.println("\n--- Non-AMC Service Charges ---");

                    System.out.print("Enter Labour Hours: ");
                    int labourHours = sc.nextInt();

                    AMCService service10 = new AMCService();

double serviceCharge = service10.calculateNonAMCCharge(labourHours);

                    System.out.println("Service Visit Charge: Rs.800");
                    System.out.println("Additional Labour Charge: Rs."
                            + Math.max(0, labourHours - 1) * 300);
                    System.out.println("Total Service Charge: Rs."
                            + serviceCharge);

                    break;
                case 11:
                    System.out.println("\n--- Parts and Warranty Charges ---");

                    sc.nextLine();

                    System.out.print("Enter AMC Plan (BASIC/COMPREHENSIVE/NONE): ");
                    String partsPlan = sc.nextLine();

                    System.out.print("Enter Part Name: ");
                    String partName = sc.nextLine();

                    System.out.print("Enter Part Price: ");
                    double partPrice = sc.nextDouble();

                    System.out.print("Is Part Under Warranty? (YES/NO): ");
                    sc.nextLine();
                    String warranty = sc.nextLine();

                    AMCService service11 = new AMCService();

boolean underWarranty = warranty.equalsIgnoreCase("YES");

double partsCharge = service11.calculatePartsCharge(
        partsPlan, partPrice, underWarranty, partName);

                    System.out.println("\nPart Name: " + partName);
                    System.out.printf("Parts Charge: Rs.%.2f%n", partsCharge);

                    break;
                case 6:
                    System.out.println("Thank you for using the system!");
                    break;
                case 7:
    System.out.println("\n--- All Registered Installations ---");
    manager.displayInstallations();
    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}