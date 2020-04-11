package com.company.DAY4.tests;

import com.company.DAY4.entity.AutomatedTest;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.Result;
import com.company.DAY4.entity.TestLevel;
import com.company.DAY4.worker.AutomationEngineer;
import com.company.DAY4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void manualTestFailed(){
        ManualTest manualTest =  new ManualTest(TestLevel.GUI, 1);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals( Result.FAILED, manualTest.apply(automationEngineer));
    }

    @Test
    public void manualTestPassed(){
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals(Result.PASSED, manualTest.apply(testEngineer));
    }

    @Test
    public void automatedTestFailed(){
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 5);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals(Result.FAILED, automatedTest.apply(automationEngineer));
    }
    @Test
    public void automatedTestPassed(){
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 2);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals(Result.PASSED, automatedTest.apply(testEngineer));
    }

}
