package String2;

public class doubleChar {
    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            result = result + ch + ch;
        }
        return result;
    }
}
