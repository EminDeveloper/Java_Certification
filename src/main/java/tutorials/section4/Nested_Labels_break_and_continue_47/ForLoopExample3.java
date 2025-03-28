package tutorials.section4.Nested_Labels_break_and_continue_47;/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 4: Using Operators and Decision Constructs
Topic: Loops
Sub-Topic: For Loop
*/
 
public class ForLoopExample3 {
 
    // Create a method which may throw an exception and returns an int
    public static int interruptIt(int i) throws Exception {
        System.out.println("interruptIt: i = " + i);
        if (i < 10) throw new Exception("Break it up");
        return i;
    }
 
    public static void main(String[] args) {
 
        int i = 0;
        // First, let's throw an exception in the initialization block...
        try {
            System.out.println("------- Executing For Loop A -------");
            // termination section of for loop declaration has prefix increment
            // increment section of for loop declaration uses postfix increment
            for (interruptIt(i); ++i < 10; i++) {
                System.out.println("A forloop: i = " + i);
            }
        } catch (Exception e) {
            System.out.println(e + ": i = " + i);
        }
    }
}