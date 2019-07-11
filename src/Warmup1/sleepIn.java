package Warmup1;

public class sleepIn {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(vacation){
            return true;
        }
        else if (!weekday){
            return true;
        }else return false;

    }


