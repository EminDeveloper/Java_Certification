package quizes.section_6.second;

class test {

    public int test;  // Line 1
    {
        test = 1;
    }
    public int test() { return test;   }  // Line 2
    public test() {  test = 2;   }
    {   test = 3;   }  // Line 3
//    static { test = 4; }   // Line 4

    public String toString() {  return ""+test();   }
}

public class CallTest {
    public static void main(String[] args) {
        test test = new test();   // Line 5
        System.out.println(test);
    }

}