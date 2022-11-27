import class_object.Student;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println(Student.numberOfStudents);
        System.out.println(Student.program);

        Student s1 = new Student("John", "Doe", 45);

        Student s2 = new Student("Jane", "Doe", 23);

        s1.study();     // void methods no printout

    }
}
