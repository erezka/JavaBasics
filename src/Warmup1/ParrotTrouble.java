package Warmup1;

public class ParrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
    }

}
