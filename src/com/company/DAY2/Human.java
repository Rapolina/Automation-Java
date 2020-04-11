package com.company.DAY2;

public class Human {
    private int age;
    private String language;


    public int getAge() {
        return age;
    }
    public String getLanguage(){
        return language;
    }
    public Human(int age, String language ){
        this.age =age;
        this.language = language;
    }
    public void canSpeak(){
        System.out.println("Language:"+ language );
    }
}
