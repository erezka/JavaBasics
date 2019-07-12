package String2;

public class CountHi {
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals("hi")) {
                count++;
            }
        }
        return count;
    }
}
