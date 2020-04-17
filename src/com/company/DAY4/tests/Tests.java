package com.company.DAY4.tests;

import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.Result;
import com.company.DAY4.entity.TestLevel;
import com.company.DAY4.worker.AutomationEngineer;
import com.company.DAY4.worker.Engineer;
import com.company.DAY4.worker.TestEngineer;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.AutomatedTest;
import org.junit.Assert;
import org.junit.Test;

public class Tests {


    private static final String MSGAnxiety = "Engineer's anxiety is not correct!";
    private static final String MSGSkill = "Engineer's skill is not correct";
    private static final String MSGExecution = "Test execution  is not correct !";

    private Engineer testEngineer = new TestEngineer();
    private Engineer automationEngineer = new AutomationEngineer();
    private static com.company.DAY4.entity.Test test;


    @Test
    public void verifyAnxietyByTestEngineer() {
        Assert.assertEquals(MSGAnxiety, 3, testEngineer.getAnxiety());
    }

    @Test
    public void verifySetAnxietyByTestEngineer() {
        testEngineer.setAnxiety(1);
        Assert.assertEquals(MSGAnxiety, 1, testEngineer.getAnxiety());
    }

    @Test
    public void verifyRandomSetSkillByAutomationEngineer() {
        Assert.assertTrue(MSGSkill,
                1 <= automationEngineer.getSkill() && automationEngineer.getSkill() <= 10);
    }
    //   @Test
    //   public void verifySetSkillByAutomationEngineer() {
    //       Assert.assertEquals(MSGSkill, 6, automationEngineer.getSkill());

//    }

    @Test
    public void verifyManualTestByTestEngineerPASSED() {
        test = new ManualTest(TestLevel.API, 3);
        testEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), testEngineer.getClass().getSimpleName(),
                testEngineer.getAnxiety()), Result.PASSED, testEngineer.executeTest(test));
    }

    @Test
    public void verifyManualTestByAutomationEngineerPASSED() {
        test = new ManualTest(TestLevel.GUI, 9);
        automationEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), automationEngineer.getClass().getSimpleName(),
                automationEngineer.getAnxiety()), Result.PASSED, automationEngineer.executeTest(test));
    }

    @Test
    public void verifyManualTestByAutomationEngineerFAILED() {
        test = new ManualTest(TestLevel.GUI, 3);
        automationEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), automationEngineer.getClass().getSimpleName(),
                automationEngineer.getAnxiety()), Result.FAILED, automationEngineer.executeTest(test));
    }

    @Test
    public void verifyAutomatedTestByTestEngineerPASSED() {
        test = new AutomatedTest(TestLevel.API, 2);
        testEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), testEngineer.getClass().getSimpleName(),
                testEngineer.getAnxiety()), Result.PASSED, testEngineer.executeTest(test));
    }

    @Test
    public void verifyAutomatedTestByTestEngineerFAILED() {
        test = new AutomatedTest(TestLevel.GUI, 2);
        testEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), testEngineer.getClass().getSimpleName(),
                testEngineer.getAnxiety()), Result.FAILED, testEngineer.executeTest(test));
    }

    @Test
    public void verifyAutomatedTestByAutomationEngineerFAILED() {
        test = new AutomatedTest(TestLevel.GUI, 2);
        automationEngineer.setSkill(5);
        Assert.assertEquals(String.format(MSGExecution,
                test.getClass().getSimpleName(), automationEngineer.getClass().getSimpleName(),
                automationEngineer.getAnxiety()), Result.FAILED, automationEngineer.executeTest(test));
    }
}





