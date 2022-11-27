package oop_principles.encapsulation;

public class Test {
    public static void main(String[] args) {
        AccountHolder accountHolder = new AccountHolder();


        accountHolder.lastName = "Doe";
        accountHolder.address = "Chicago";
        accountHolder.phoneNumber = "(312) 000-0000";
        //accountHolder.firstName = "John";
        //System.out.println(accountHolder.firstName);

        accountHolder.setFirstName("John", "1234");
        System.out.println(accountHolder.getFirstName("5555"));


    }
}
