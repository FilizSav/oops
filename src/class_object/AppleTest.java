package class_object;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple myApple = apple2; // same object

        System.out.println("==============APPLE1==========");
        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);

        System.out.println("==============APPLE2==========");
        apple2.color = "Green";
        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        System.out.println(apple2.price);

        System.out.println(apple1);

    }
}
