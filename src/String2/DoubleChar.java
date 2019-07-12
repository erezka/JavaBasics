package String2;

public class DoubleChar {
    public static String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i));
            result.append(str.charAt(i));
        }
        return result.toString();
    }
}
