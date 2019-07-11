package Warmup1;

public class notString {
    public String notString(String str) {
        String a = "not";
        if (str.startsWith(a)){
            return str;
        }else{
            return a + " " + str;
        }
    }
}
