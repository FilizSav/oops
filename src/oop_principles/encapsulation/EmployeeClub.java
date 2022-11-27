package oop_principles.encapsulation;

import java.util.Arrays;

public class EmployeeClub {
    public static void main(String[] args) {

        Company company1 = new Company("Microsoft", "Washington", "(000)123-1234");
        Company company2 = new Company("Apple", "California", "(000)000-0000");

        Employee emp1 = new Employee("John Doe", "Manager", 45, company1);
        Employee emp2 = new Employee("Alex Smith", "Developer", 40, company2);
        Employee emp3 = new Employee("Jane Doe", "Developer", 20, company1);
        Employee emp4 = new Employee("Ryan Smith", "Tester", 22, company1);
        Employee emp5 = new Employee("James Reynold", "Tester", 30, company2);
        Employee emp6 = new Employee("Matt Morgan", "Developer", 40, company1);

       Employee[] employees = {emp1,emp2,emp3,emp4,emp5,emp6};

       int totalAppleEmp = 0;

        for (Employee e : employees) {
            if(e.getCompany().getName().equals("Apple")) totalAppleEmp++;
        }
        System.out.println(totalAppleEmp);

        System.out.println(Arrays.stream(employees).filter(e-> e.getCompany().getName().equals("Microsoft")).count());
        System.out.println(Arrays.stream(employees).filter(e-> e.getJobPosition().equals("Developer")).count());
        System.out.println(Arrays.stream(employees).filter(e-> e.getJobPosition().equals("Tester")).count());
        System.out.println(Arrays.stream(employees).filter(e-> e.getCompany().getName().equals("Microsoft") && e.getJobPosition().equals("Developer")).count());
        System.out.println(Arrays.stream(employees).filter(e-> e.getCompany().getName().equals("Apple") && e.getJobPosition().equals("Tester")).count());

        Employee maxAgeMicDevop = new Employee();
        for (Employee employee : employees) {

         if(employee.getCompany().getName().equals("Microsoft")
           && employee.getJobPosition().equals("Developer")
            && employee.getAge() > maxAgeMicDevop.getAge()) maxAgeMicDevop = employee;
        }
        System.out.println(maxAgeMicDevop);

        System.out.println(maxAgeMicDevop.getFullName().split(" ")[0] + " is the oldest "
        +maxAgeMicDevop.getJobPosition()
        + " working for "
        + maxAgeMicDevop.getCompany().getName()
        + " with the age "
        + maxAgeMicDevop.getAge());
    }
}
