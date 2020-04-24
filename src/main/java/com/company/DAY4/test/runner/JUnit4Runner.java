package com.company.DAY4.test.runner;

import com.company.DAY4.test.ExecuteTestTest;
import com.company.DAY4.test.BaseEngineerTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ExecuteTestTest.class, BaseEngineerTest.class})
public class JUnit4Runner {
}
