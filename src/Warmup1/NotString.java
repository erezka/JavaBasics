package Warmup1;

public class NotString {
    public static String notString(String str) {
        String a = "not";
        if (str.startsWith(a)) {
            return str;
        } else {
            return a + " " + str;
        }
    }
}
