package class_object;


import java.util.ArrayList;
import java.util.List;

public class StudentTeacherPractice2 {

    public static void main(String[] args) {

        Teacher teacher = new Teacher("Alex", "Smith");
        Student student1 = new Student("John", "Doe", 15);
        Student student2 = new Student("Jane", "Doe", 20);
        Student student3 = new Student("Mike", "Smith", 25);
        Student student4 = new Student("Robert", "Smith", 50);

        teacher.addStudent(student1);
        teacher.addStudent(student2);
        teacher.addStudent(student3);
        teacher.addStudent(student4);

        List<Student> students = new ArrayList<>();

        System.out.println(students);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        System.out.println(students);
        int max = Integer.MIN_VALUE; int min = Integer.MAX_VALUE;
        for (Student student : teacher.getStudents()) {
            if(student.age > max) max = student.age;
            if (student.age < min) min = student.age;

        }
        System.out.println(max-min);

    }
}
