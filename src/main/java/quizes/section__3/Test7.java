package quizes.section__3;

public class Test7 {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(0);  // Line 1
        String hello = "hello";

        hello.concat(" world");

        builder1.append(hello);
        builder2.append(builder1).append(" world");

        System.out.println(builder1);
        System.out.println(builder2);
    }

}