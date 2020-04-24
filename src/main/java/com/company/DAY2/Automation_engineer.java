package com.company.DAY2;

public class Automation_engineer extends Engineers{
    private boolean code;
    public Automation_engineer(int age, String language, String name, String surname, boolean test, boolean code) {
        super(age, language, name, surname, test, code);
        this.code=code;
    }
    public void inventCode(){
        System.out.println("Can this Engineer invent code? " + code);
    }
}
