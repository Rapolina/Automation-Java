package com.company.DAY2;

public class Person extends Human {
    private String name;
    private String surname;
    public Person(int age, String language, String name, String surname, boolean test, boolean code) {
        super(age, language);
        this.name = name;
        this.surname= surname;
    }
    public void display(){
        System.out.println("Age:" + getAge());
        System.out.println("Name:" + name);
        System.out.println("Surname:" + surname);
    }
}
