package class_object;

import java.util.Arrays;

public class Apple_Exercise {
    public static void main(String[] args) {


        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        apple1.color = "Red";
        apple2.color = "Yellow";
        apple3.color = "Green";

        apple1.taste = "Sweet";
        apple2.taste = "Sweet";
        apple3.taste = "Sour";

        apple1.price = 0.5;
        apple2.price = 0.75;
        apple3.price = 1.0;

        System.out.println(apple1);
        System.out.println(apple2);
        System.out.println(apple3);

        System.out.println((apple1.price+apple2.price+apple3.price)/3);

        //Apple[] apples = new Apple[3];

        Apple[] apples = {apple1, apple2, apple3};

        System.out.println(Arrays.toString(apples));
        System.out.println(apples.length);
        System.out.println(apples[1]);
        System.out.println(apples[2].taste);

        int countSweet = 0;
        for (int i = 0; i < apples.length; i++) {
            if(apples[i].taste.equals("Sweet")) countSweet++;
        }
        System.out.println(countSweet);

        Apple[] appleArr = {
        new Apple("Yellow", 0.5, "Sour"),
        new Apple("Red", 0.75, "Sour"),
        new Apple("Green", 0.5, "Sour"),
        new Apple("Yellow", 1.0, "Sweet"),
        new Apple("Yellow", 1.5, "Sweet")
        };

        for (Apple apple : appleArr) {
            System.out.println(apple);
        }

        for (Apple apple : appleArr) {
            System.out.println("------------");
            System.out.println(apple.color);
            System.out.println(apple.price);
            System.out.println(apple.taste);
        }

        int count = 0;
        for (Apple apple : appleArr) {
            if(apple.taste.equals("Sour"))count++;
        }
        System.out.println(count);
        System.out.println("\n==========FORI==============");
        int countSour = 0;
        for (int i = 0; i < appleArr.length; i++) {
            if (appleArr[i].taste.equals("Sour"))countSour++;
        }
        System.out.println(countSour);
    }
}

