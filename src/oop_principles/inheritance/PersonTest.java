package oop_principles.inheritance;

import test.Test;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.getClass().getName());

        Tester t1 = new Tester();
        Tester t2 = new Tester("Filiz",42, "10/24/1980", "333");
        System.out.println(t2);

        System.out.println(p1);
        System.out.println(t1);
        t1.isAutomationTester = true;
        System.out.println(t1);
    }
}
