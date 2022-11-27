package class_object.oopPractice;

import oop_principles.encapsulation.Company;
import oop_principles.encapsulation.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeExercise {
    public static void main(String[] args) {


        Company c1 = new Company("Tesla", "California", "123");
        Company c2 = new Company("USBank", "Minnesota", "123");
        Company c3 = new Company("Verizon", "Texas", "123");

        ArrayList<Employee> employees = new ArrayList<>(Arrays.asList(
                new Employee("Andrii", "Developer", 25, c1),
                new Employee("Yildiz", "System Architect", 23, c2),
                new Employee("Malek", "Developer", 30, c3),
                new Employee("Saeed", "Manager", 35, c3),
                new Employee("Samir", "Tester", 20, c2),
                new Employee("Viktoria", "Designer", 30, c1),
                new Employee("Ibrahim", "Designer", 27, c1),
                new Employee("Jeremiah", "Scrum Mater", 21, c2),
                new Employee("Olena", "Tester", 29, c3),
                new Employee("Yoanna", "Tester", 23, c1)));

        //employees.forEach(System.out::println);

        int teslaEmployees = 0, usbankEmployees = 0, verizonEmployees = 0;
        int Tester = 0, Developer = 0, Manager = 0, Designer = 0, SystemArchitect = 0, ScrumMaster = 0;
        Employee youngestTester = new Employee("F","S",100,c1), youngestDeveloper = new Employee("F","S",100,c1), youngestDesigner = new Employee("F","S",100,c1);
        Employee managerEmployee = new Employee(), systemArchitectEmployee = new Employee(), scrumMasterEmployee = new Employee();

        for (Employee employee : employees) {
            if(employee.getCompany().getName().equals("Tesla")) teslaEmployees++;
            else if(employee.getCompany().getName().equals("USBank")) usbankEmployees++;
            else verizonEmployees++;

            if(employee.getJobPosition().equals("Tester")) Tester++;
            else if (employee.getJobPosition().equals("Developer")) Developer++;
            else if (employee.getJobPosition().equals("Manager")) Manager++;
            else if (employee.getJobPosition().equals("Designer")) Designer++;
            else if (employee.getJobPosition().equals("System Architect")) SystemArchitect++;
            else ScrumMaster++;

            if (employee.getJobPosition().equals("Tester") && employee.getAge() < youngestTester.getAge()) youngestTester = employee;
            else if (employee.getJobPosition().equals("Developer") &&  employee.getAge() < youngestDeveloper.getAge()) youngestDeveloper = employee;
            else if (employee.getJobPosition().equals("Designer") && employee.getAge() < youngestDesigner.getAge()) youngestDesigner = employee;
            else if (employee.getJobPosition().equals("Manager")) managerEmployee = employee;
            else if (employee.getJobPosition().equals("System Architect")) systemArchitectEmployee = employee;
            else scrumMasterEmployee = employee;

        }
//youngestTester = employees.stream().filter(
//        e -> e.getJobPosition().equals("Tester")).min(Comparator.comparingInt(Employee::getAge)).get();
//youngestDeveloper = employees.stream().filter(
//        e -> e.getJobPosition().equals("Developer")).min(Comparator.comparingInt(Employee::getAge)).get();
//youngestDesigner = employees.stream().filter(
//        e -> e.getJobPosition().equals("Designer")).min(Comparator.comparingInt(Employee::getAge)).get();
        System.out.println("\nEmployee numbers for each company");
        System.out.println("Tesla = " + teslaEmployees);
        System.out.println("USBank = " + usbankEmployees);
        System.out.println("Verizon = " + verizonEmployees);

        System.out.println("\nEmployee numbers for each position");
        System.out.println("Tester = " + Tester);
        System.out.println("Developer = " + Developer);
        System.out.println("Manager = " + Manager);
        System.out.println("Designer  = " + Designer);
        System.out.println("System Architect = " + SystemArchitect);
        System.out.println("Scrum Master = " + ScrumMaster);

        System.out.println("\nFind youngest");
        System.out.println("Youngest tester = " + youngestTester.getFullName() + " with the age of " + youngestTester.getAge());
        System.out.println("Youngest developer = " + youngestDeveloper.getFullName() + " with the age of " + youngestDeveloper.getAge());
        System.out.println("Youngest designer = " + youngestDesigner.getFullName() +  " with the age of " + youngestDesigner.getAge());

        System.out.println("\nFind company");
        System.out.println(managerEmployee.getJobPosition() + " = " + managerEmployee.getFullName()+ " works at " + managerEmployee.getCompany().getName());
        System.out.println(systemArchitectEmployee.getJobPosition() + " = " + systemArchitectEmployee.getFullName() + " works at " + systemArchitectEmployee.getCompany().getName());
        System.out.println(scrumMasterEmployee.getJobPosition() + " = " + scrumMasterEmployee.getFullName() + " works at " + scrumMasterEmployee.getCompany().getName());
    }
}
