package com.company.DAY2;

public class Engineers extends Person {
    private  boolean test;
    public Engineers(int age, String language, String name, String surname, boolean test, boolean code) {
        super(age, language, name, surname, true, true);
        this.test=test;
    }
    public void executeTest() {
        System.out.println("Can this Engineer execute tests? " + test);
    }
}
