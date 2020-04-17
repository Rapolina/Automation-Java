package com.company.DAY4;

import com.company.DAY4.entity.AutomatedTest;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.TestLevel;
import com.company.DAY4.worker.AutomationEngineer;
import com.company.DAY4.worker.TestEngineer;
import com.company.DAY4.worker.Engineer;
import com.company.DAY4.entity.Test;




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
