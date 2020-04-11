package com.company.DAY4.worker;

import com.company.DAY4.entity.Result;
import org.junit.Test;

public abstract class Engineer {
    protected int a = 1;
    protected int b = 11;
    protected int anxiety;
    private int skill;

    public void setSkill() {
        this.skill = a + (int)(Math.random()*(b-a)) ;
    }


    public int getSkill() {
        return skill;
    }

    public int getAnxiety() {
        return anxiety;
    }


    public Result executeTest(Test test) {
        return null;
    }
}
