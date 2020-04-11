package com.company.DAY4;

import com.company.DAY4.entity.AutomatedTest;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.TestLevel;
import com.company.DAY4.worker.AutomationEngineer;
import com.company.DAY4.worker.TestEngineer;

public class Runner4 {
    public static void main(String[] args) {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 2);
        TestEngineer testEngineer = new TestEngineer();
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 4);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        System.out.println("Test " + manualTest.apply(automationEngineer));
        System.out.println("Test " + manualTest.apply(testEngineer));
        System.out.println("Test " + automatedTest.apply(testEngineer));
        System.out.println("Test " + automatedTest.apply(automationEngineer));
    }
}
