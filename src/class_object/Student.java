package class_object;

public class Student {
    public Student(){}

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        LastName = lastName;
        this.age = age;
        Student.addStudent();
    }

    public static int numberOfStudents= 0;

    public static final String program = "Software Engineer in Test Program";

    public String firstName;
    public String LastName;
    public int age;
    public Teacher teacher;

    public void study(){
        System.out.println(this.firstName + " studies");
    }
    public void rest(){
        System.out.println(this.firstName +  " " + this.LastName + " rests");
    }
    public static void addStudent(){
        numberOfStudents++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                '}';
    }
}
