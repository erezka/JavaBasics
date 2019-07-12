package Warmup2;

public class DoubleX {
    public static boolean doubleX(String str) {
        int a = str.indexOf("x");
        int b = str.indexOf("x", a + 1);
        return (b - a == 1);
    }
}
