package oop_principles.inheritance;
import org.jcp.xml.dsig.internal.dom.DOMBase64Transform;
public class Person {
    // default constructor is here
    public Person(){}
    public Person(String fName, int age) {
        this.fName = fName;
        this.age = age;
    }
    public Person(String fName, int age, String DOB) {
       this(fName, age);
        this.DOB = DOB;
    }
    public Person(String fName, int age, String DOB, String SSN) {
       this(fName, age, DOB);
        this.SSN = SSN;
    }
    //instance variables
    public String fName;
    protected int age;
    String DOB;
    private String SSN;

    public String getSSN() {
        return SSN;
    }
    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
    public void eat(){
        System.out.println("Person eats");
    }
    public void eat(String str){
        System.out.println("Person eats " + str);
    }
    public void sleeps(){
        System.out.println("Person sleeps");
    }
    public void sleeps(int i){
        System.out.println("Person sleeps " + i + " hours");
    }
    @Override
    public String toString() {
        return "Person{" +
                "fName='" + fName + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", SSN='" + SSN + '\'' +
                '}';
    }
}
