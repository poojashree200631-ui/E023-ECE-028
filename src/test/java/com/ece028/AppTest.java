package com.ece028;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testBasicAMC() {
        AMCPlan basic = new AMCPlan("BASIC", 0.08, 2);
        assertEquals(2000.0, basic.calculateAMC(25000), 0.01);
    }

    @Test
    public void testMinimumAMC() {
        AMCPlan basic = new AMCPlan("BASIC", 0.08, 2);
        assertEquals(1500.0, basic.calculateAMC(10000), 0.01);
    }

    @Test
    public void testComprehensiveAMC() {
        AMCPlan comprehensive =
                new AMCPlan("COMPREHENSIVE", 0.14, 4);
        assertEquals(3500.0, comprehensive.calculateAMC(25000), 0.01);
    }
    @Test
    public void testBatteryGoodStatus() {
        BatteryReport report = new BatteryReport();
        assertEquals("Battery Condition Good",
                report.getBatteryStatus(50));
    }

    @Test
    public void testBatteryRecommendedStatus() {
        BatteryReport report = new BatteryReport();
        assertEquals("Replacement Recommended",
                report.getBatteryStatus(85));
    }

    @Test
    public void testBatteryMandatoryStatus() {
        BatteryReport report = new BatteryReport();
        assertEquals("Replacement Mandatory",
                report.getBatteryStatus(100));
    }
    @Test
    public void testBreakdownCharge() {
        AMCService service = new AMCService();
        assertEquals(1000.0,
                service.calculateBreakdownCharge(4), 0.01);
    }

    @Test
    public void testNonAMCCharge() {
        AMCService service = new AMCService();
        assertEquals(1400.0,
                service.calculateNonAMCCharge(3), 0.01);
    }
}
