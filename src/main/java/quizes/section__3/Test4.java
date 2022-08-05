package quizes.section__3;

public class Test4 {
    static float tax_rate =0.06F;
    public static void main(String[] args) {

        var result = 0;
        var tax_rate = 0.05;    // Line 1
        var price = 100;
        var adjusted_tax = price * tax_rate;  // Line 2
//        result = price + adjusted_tax;  // Line 3
        System.out.println("Adjusted price = " + result);
    }

//    Line 3 fails to compile when a double is added to an int
//    and the result is a double which does not fit into the result variable
//    which was inferred to be an int.

}
