package muttable_immutable;

public class StringBuffer_methods {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World"); // buffer is synchronized safe but string builder is faster

        System.out.println(insertMiddle("Filiz"));

    }

    public static String insertMiddle(String str){
        if(str.length() <= 1) return str;
        if(str.length() % 2 == 0) {
           return new StringBuilder(str).insert(str.length()/2, "*").toString();
        }else{
            return new StringBuilder(str).insert(str.length()/2, "*").insert(str.length()/2 + 2, "*").toString();
        }
    }
}
