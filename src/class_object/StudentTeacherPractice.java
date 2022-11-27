package class_object;

public class StudentTeacherPractice {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("John", "Doe");
        Teacher teacher2 = new Teacher("Alex", "Morgan");

        System.out.println(teacher1.getStudents());

        Student student1 = new Student("Mike", "Smith", 25);
        Student student2 = new Student("Jane", "Smith", 30);
        Student student3 = new Student("A", "Smith", 17);
        Student student4 = new Student("B", "Smith", 19);
        Student student5 = new Student("C", "Smith", 21);

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(teacher1.getStudents());

        teacher1.addStudent(student1);
        teacher1.addStudent(student2);
        teacher2.addStudent(student3);
        teacher2.addStudent(student4);
        teacher2.addStudent(student5);

        System.out.println(teacher1.getStudents());
    }
}
