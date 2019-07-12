package Warmup1;


public class Diff21 {
    public static int diff21(int n) {
        if (n > 21) {
            return Math.abs(21 - n) * 2;
        } else return Math.abs(21 - n);
    }

}
