package io.turtabl;

public class Numbers {

    private  static int sum (int num1, int num2) {
        return num1+num2;
    }

    private static boolean isPositive(int number) {
        if (number > 0){
            return true;
        }
        else {
            return false;
        }
    }

    private static  boolean isNegative(int number){
        if ( number < 0 ) {
            return true;
        }
        else {
            return false;
        }
    }

    private static boolean isEvenOrGreaterThanZero(int number){
        if ( number > 0 && number %2 ==0  ) {
            return true;
        }
        else {
            return false;
        }
    }

    private static  boolean isALeapYear(){
        return false;
    }
}
