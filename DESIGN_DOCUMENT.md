# DESIGN DOCUMENT
## UPS and Inverter AMC Pricing and Service Visit Scheduler

**Team ID:** E023  
**Problem Statement ID:** ECE-028  
**Project Type:** Java Console Application

---

## 1. Introduction

The UPS and Inverter AMC Pricing and Service Visit Scheduler is a Java-based console application developed to manage Annual Maintenance Contracts (AMC) for UPS and inverter equipment.

The system helps users register equipment installations, calculate AMC prices, schedule preventive maintenance visits, generate invoices, manage service job cards and calculate service charges.

## 2. Project Objectives

- To register UPS and inverter installations.
- To calculate AMC prices automatically.
- To schedule preventive maintenance visits.
- To generate AMC invoices.
- To monitor battery replacement requirements.
- To manage service job cards.
- To calculate breakdown and non-AMC service charges.
- To calculate parts and warranty charges.

## 3. Technologies Used

| Technology | Purpose |
|---|---|
| Java | Application development |
| Maven | Project building and dependency management |
| JUnit | Unit testing |
| Git | Version control |
| GitHub | Source code hosting |
| CSV | Data storage |

## 4. System Architecture

The application follows a simple console-based architecture.

### Main Components

1. User Interface Layer
   - Accepts input from users through the console.
   - Displays menus and results.

2. Business Logic Layer
   - Calculates AMC prices.
   - Determines service charges.
   - Schedules maintenance visits.
   - Checks battery replacement status.

3. Data Storage Layer
   - Stores installation information in installations.csv.
   - Stores service job card information in jobcards.csv.

### System Workflow

User
  ↓
Console Menu
  ↓
Java Application
  ↓
Business Logic Processing
  ↓
CSV File Storage
  ↓
Display Results

## 5. Main Modules

### 5.1 Register Installation
Allows users to register customer and equipment installation details.

### 5.2 Calculate AMC Price
Calculates AMC prices based on equipment value and selected AMC plan.

### 5.3 Schedule Service Visit
Schedules preventive maintenance visits based on the selected AMC plan.

### 5.4 Generate AMC Invoice
Generates invoices containing AMC charges and applicable GST.

### 5.5 Battery Replacement Report
Checks battery usage and indicates when replacement is recommended or mandatory.

### 5.6 Display All Installations
Displays the registered installation records.

### 5.7 Create Service Job Card
Creates service job cards for maintenance and repair activities.

### 5.8 Breakdown Service Charges
Calculates charges for breakdown service calls.

### 5.9 Non-AMC Service Charges
Calculates service visit and additional labour charges for customers without an active AMC.

### 5.10 Parts and Warranty Charges
Calculates parts charges according to AMC coverage and warranty conditions.

## 6. Business Rules

| Rule | Description |
|---|---|
| Basic AMC | 8% of equipment value |
| Comprehensive AMC | 14% of equipment value |
| Minimum AMC | ₹1,500 before GST |
| GST | 18% |
| Basic preventive visits | 2 per year |
| Comprehensive preventive visits | 4 per year |
| Free breakdown calls | First 2 calls |
| Additional breakdown call | ₹500 |
| Non-AMC visit charge | ₹800 |
| Additional labour | ₹300 per hour after first hour |
| SMF battery life | 36 months |
| Tubular battery life | 48 months |
| Replacement recommendation | 80% life usage |
| Mandatory replacement | 100% life usage |

## 7. Data Storage Design

The application uses CSV files for storing information.

### 7.1 installations.csv
Stores UPS and inverter installation details.

### 7.2 jobcards.csv
Stores service job card details.

CSV file storage allows the application to save and retrieve records.

## 8. Testing Design

JUnit is used for unit testing.

The main testing areas include:

- AMC price calculation.
- Battery replacement status.
- Breakdown service charges.
- Non-AMC service charges.

The Maven command used to execute the tests is:

mvn test

## 9. Build and Execution

The project uses Maven.

Compile the project:

mvn compile

Run tests:

mvn test

Run the application:

mvn exec:java "-Dexec.mainClass=com.ece028.App"

## 10. Expected Outcome

The application provides a simple way to manage UPS and inverter AMC activities.

It reduces manual calculations, helps organize service visits, manages installation records and provides information about AMC pricing, battery replacement and service charges.

## 11. Conclusion

The UPS and Inverter AMC Pricing and Service Visit Scheduler provides an organized approach to managing AMC-related activities.

The project demonstrates the use of Java, Maven, JUnit, GitHub and CSV file storage in developing a practical service management application.

---

**Team E023 – ECE-028**
