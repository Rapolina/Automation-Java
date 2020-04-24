package com.company.DAY4.test;

import com.company.DAY4.AutomationEngineer;
import com.company.DAY4.Engineer;
import com.company.DAY4.entity.AutomatedTest;
import com.company.DAY4.entity.ManualTest;
import com.company.DAY4.entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BaseEngineerTest {

    private final com.company.DAY4.entity.Test test;
    private final int expected;
    final String MSGSkill = "Engineer's skill is not correct";

    public BaseEngineerTest(com.company.DAY4.entity.Test test, int expected) {
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new AutomatedTest(TestLevel.API, 3), 3},
                {new AutomatedTest(TestLevel.API, 5), 5},
                {new ManualTest(TestLevel.GUI, 9), 9},
                {new ManualTest(TestLevel.API, 2), 2},
        });
    }


    @Test
    public void verifyRandomSetSkillByAutomationEngineer() {
        Engineer automationEngineer = new AutomationEngineer();
        Assert.assertTrue(MSGSkill,
                1 <= automationEngineer.getSkill() && automationEngineer.getSkill() <= 10);

    }
}
