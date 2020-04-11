package com.company.DAY2;

public class Runner {
    public static void main(String[] args) {
        Automation_engineer automation = new Automation_engineer(25,"english", "Clara", "Monay", true, true );
        automation.display();
        automation.canSpeak();
        automation.inventCode();
        automation.executeTest();
    }
}
