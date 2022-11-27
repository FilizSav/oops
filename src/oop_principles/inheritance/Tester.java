package oop_principles.inheritance;

public class Tester extends Person {
    public Tester() {}
    public Tester(String fName, int age) {
        super(fName, age);
    }
    public Tester(String fName, int age, String DOB) {
        super(fName, age, DOB);
    }
    public Tester(String fName, int age, String DOB, String SSN) {
        super(fName, age, DOB, SSN);
    }

    public Tester(String fName, int age, String DOB, String SSN, boolean isAutomationTester) {
        super(fName, age, DOB, SSN);
        this.isAutomationTester = isAutomationTester;
    }

    public boolean isAutomationTester;
    public void code(){
        System.out.println("Tester codes");
    }
    public void code(String str){
        System.out.println("Tester codes in " + str + " language");
    }

    @Override
    public void sleeps(){
        System.out.println("Tester sleeps");
    }

    @Override
    public String toString() {
        return "Tester{" +
                ", fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + getSSN() + '\'' +
                ", isAutomationTester=" + isAutomationTester +
                '}';
    }
}
