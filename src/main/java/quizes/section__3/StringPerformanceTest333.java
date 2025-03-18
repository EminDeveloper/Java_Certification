package quizes.section__3;

public class StringPerformanceTest333 {
    public static void main(String[] args) {
        // 100,000 string birləşdirmə üçün performans testi
        long start = System.currentTimeMillis();

// String ilə test
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "a";
        }
        System.out.println("String ilə: " + (System.currentTimeMillis() - start) + " ms");

// StringBuilder ilə test
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        System.out.println("StringBuilder ilə: " + (System.currentTimeMillis() - start) + " ms");

// StringBuffer ilə test
        start = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            buffer.append("a");
        }
        System.out.println("StringBuffer ilə: " + (System.currentTimeMillis() - start) + " ms");
    }
}
