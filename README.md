UPS and Inverter AMC Pricing and Service Visit Scheduler

1. Project Overview

The UPS and Inverter AMC Pricing and Service Visit Scheduler is a Java console application developed to manage Annual Maintenance Contracts (AMC) for UPS and inverter equipment.

It helps register installations, calculate AMC prices, schedule preventive maintenance visits, generate invoices, and calculate service charges.

2. Technologies Used

- Java
- Maven
- JUnit
- Git and GitHub
- CSV file storage

3. Project Features

1. Register Installation
2. Calculate AMC Price
3. Schedule Service Visit
4. Generate AMC Invoice
5. Battery Replacement Report
6. Display All Installations
7. Create Service Job Card
8. Calculate Breakdown Service Charges
9. Calculate Non-AMC Service Charges
10. Calculate Parts and Warranty Charges

4. Business Rules

- Basic AMC: 8% of equipment value
- Comprehensive AMC: 14% of equipment value
- Minimum AMC amount: ₹1,500 before GST
- GST: 18%
- Basic AMC: 2 preventive visits per year
- Comprehensive AMC: 4 preventive visits per year
- First 2 breakdown calls are free
- Additional breakdown call: ₹500
- Non-AMC service visit: ₹800
- Additional labour: ₹300 per hour after the first hour
- SMF battery life: 36 months
- Tubular battery life: 48 months
- Battery replacement recommended at 80% life usage
- Battery replacement mandatory at 100% life usage

5. How to Run the Project

Compile

mvn compile

Run Tests

mvn test

Run Application

mvn exec:java "-Dexec.mainClass=com.ece028.App"

6. Data Storage

- "installations.csv" stores installation details.
- "jobcards.csv" stores service job card details.

7. Testing

JUnit tests are used to test AMC price calculations, battery replacement status, breakdown charges, and non-AMC service charges.

8. Project Type

Java Console Application