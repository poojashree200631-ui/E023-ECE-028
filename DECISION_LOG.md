::writing{variant="document" id="73182"}
# DECISION LOG

## UPS and Inverter AMC Pricing and Service Visit Scheduler

**Team ID:** E023  
**Problem Statement ID:** ECE-028

### 1. Purpose

This document records the main technical and design decisions reflected in the development of the UPS and Inverter AMC Pricing and Service Visit Scheduler. It explains the technologies, application structure, storage approach and business logic used in the current implementation.

### 2. Technical and Design Decisions

| ID | Decision | Reason / Implementation |
|---|---|---|
| D-01 | Use Java | Java is used to implement the application's business logic and object-oriented structure. |
| D-02 | Use Java 17 | The project is configured to compile using Java 17. |
| D-03 | Use Maven | Maven manages project configuration, dependencies and build operations. |
| D-04 | Use a console-based interface | A menu-driven interface provides access to the application's functions. |
| D-05 | Follow object-oriented design | Separate classes represent installations, AMC plans, invoices, batteries and service job cards. |
| D-06 | Separate AMC calculation logic | The `AMCPlan` class handles plan-based AMC amount calculations. |
| D-07 | Calculate GST separately | The `AMCInvoice` class calculates GST and the final invoice amount. |
| D-08 | Use CSV file storage | CSV files are used to append installation and service job-card records. |
| D-09 | Use JUnit 5 | JUnit is used to test selected business calculations and battery status conditions. |
| D-10 | Separate battery reporting | Battery life calculation and replacement status reporting are handled by separate classes. |
| D-11 | Use a dedicated scheduling class | `ServiceScheduler` calculates preventive visit dates. |
| D-12 | Separate service charge calculations | `AMCService` handles selected service-related charge calculations. |

### 3. Business Logic Decisions

The current implementation uses the following business rules:

- BASIC AMC rate: 8% of equipment value.
- COMPREHENSIVE AMC rate: 14% of equipment value.
- Minimum AMC amount: ₹1,500.
- GST: 18%.
- BASIC preventive visits: 2 per year.
- COMPREHENSIVE preventive visits: 4 per year.
- First 2 breakdown calls: free.
- Additional breakdown call charge: ₹500 per call.
- Non-AMC labour: ₹800 base visit charge and ₹300 for each additional labour hour.
- SMF battery expected life: 36 months.
- TUBULAR battery expected life: 48 months.
- Battery replacement recommendation: 80% life usage.
- Battery replacement mandatory status: 100% life usage.

### 4. Testing Approach

JUnit 5 is used for unit testing. The current `AppTest.java` contains eight test methods covering:

- BASIC AMC calculation.
- Minimum AMC amount.
- COMPREHENSIVE AMC calculation.
- Battery condition status.
- Battery replacement recommendation.
- Mandatory battery replacement status.
- Breakdown call charges.
- Non-AMC labour charges.

### 5. Implementation Limitations and Future Improvements

The following areas need further implementation or verification against the complete project requirements:

1. Loading previously saved installation records from CSV when the application starts.
2. Tracking preventive visit completion and overdue status.
3. Implementing the 15-day grace period for overdue visits.
4. Checking the 12-month manufacturer warranty period using replacement dates.
5. Handling AMC expiry when calculating service charges.
6. Improving input validation and boundary-condition testing.

These items are documented as improvement areas and are not claimed as completed functionality.

### 6. Conclusion

The current project uses Java 17, Maven, object-oriented classes, CSV file storage and JUnit 5 testing. The design separates important application responsibilities such as AMC pricing, invoicing, service scheduling, battery reporting and service charge calculations.

This decision log records the current implementation approach and can be updated as the project develops.

**Repository:** https://github.com/poojashree200631-ui/E023-ECE-028
:::
