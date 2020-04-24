package com.company.DAY4;

import com.company.DAY4.entity.AutomatedTest;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.Test;
import com.company.DAY4.entity.TestLevel;

public class Runner4 {
    public static void main(String[] args) {
        Test manualTest = new ManualTest(TestLevel.GUI, 5);
        Test automatedTest = new AutomatedTest(TestLevel.API, 3);

        Engineer testEngineer = new TestEngineer();
        Engineer automationEngineer = new AutomationEngineer();


        automationEngineer.executeTest(manualTest);
        automationEngineer.executeTest(automatedTest);

        testEngineer.executeTest(manualTest);
        testEngineer.executeTest(automatedTest);
    }
}

