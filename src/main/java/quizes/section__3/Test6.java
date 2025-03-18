package quizes.section__3;

public class Test6 {

    static String s;
    public static void main(String[] args) {

        String s;
        boolean isOk=true;
        if (isOk) s = Test6.s+"";  // Line 1
        else s="";
        s.concat("Hello ");  // Line 2
        s.concat("World");
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}