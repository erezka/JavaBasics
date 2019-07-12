package Warmup2;

public class FrontTimes {
    public  static String frontTimes(String str, int n) {
        String result = "";
        int a = str.length();
        for (int i = 0; i < n; i++) {
            if (a >= 3) {
                result = result + str.substring(0, 3);
            } else {
                result = result + str.substring(0, a);
            }
        }
        return result;
    }
}
