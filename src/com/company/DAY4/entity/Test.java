package com.company.DAY4.entity;

import com.company.DAY4.worker.AutomationEngineer;
import com.company.DAY4.worker.Engineer;
import com.company.DAY4.worker.TestEngineer;

import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result> {

    private int comlexity;
    private int instability;


    public int getComlexity() {
        return comlexity;
    }

    public void setComlexity(int comlexity) {
        this.comlexity = comlexity;
    }

    public int getInstability() {
        return instability;
    }

    public void setInstability(int instability) {
        this.instability = instability;
    }


    public Test(TestLevel testLevel) {
        this.comlexity = testLevel.COMLEXITY;
    }


    @Override
    public Result apply(Engineer engineer) {
        int anxiety;
        if((this instanceof ManualTest && engineer instanceof AutomationEngineer) || (this instanceof AutomatedTest && engineer instanceof TestEngineer)) {
            anxiety = engineer.getAnxiety();
        } else {
            anxiety = 1;
        }
        if (comlexity*instability*anxiety>30)
            return Result.FAILED;
        else
            return Result.PASSED;
    }
}
