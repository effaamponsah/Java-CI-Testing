package io.turtabl;

public class Numbers {

    public static int sum (int num1, int num2) {
        return num1+num2;
    }

    public static boolean isPositive(int number) {
        if (number > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static  boolean isNegative(int number){
        if ( number < 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isEvenOrGreaterThanZero(int number){
        if ( number > 0 && number %2 ==0  ) {
            return true;
        }
        else {
            return false;
        }
    }

    public static  boolean isALeapYear(){
        return false;
    }
}
