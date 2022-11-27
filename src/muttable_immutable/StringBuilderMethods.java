package muttable_immutable;

public class StringBuilderMethods {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Alex");
        System.out.println(sb);

        StringBuilder sen = new StringBuilder("civic");

        String word = "civic";

        System.out.println(word.equals(sen.toString()));

    }
}
