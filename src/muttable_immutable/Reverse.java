package muttable_immutable;

public class Reverse {



    public static String reverse(String str){
        String reverse = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);

        }return reverse;
    }


    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        String [] str4 = {"i", "Love", "Java"};
        System.out.println(reverseTwo(str4));
    }

    public static String reverseTwo(String[] str) {
        String reverse = "";
        for (int i = 0; i < str.length; i++) {
            StringBuilder sb = new StringBuilder(str[i]);
            sb.reverse();
            reverse += sb.toString() + " ";
        }
        return reverse;
    }
    public static String reverseString(String str){
       return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
