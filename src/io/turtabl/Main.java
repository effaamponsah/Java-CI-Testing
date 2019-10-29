package io.turtabl;

public class Main {

    //todo: work on the main method
    public static void main(String[] args) {
         System.out.println("Hello, Dennis!");

         if (args.length == 0) {
             System.err.println("Please pass in parameters");
         }
         else {
             int length = args.length;
             System.out.println("Thanks for passing "+ length + " arguments");
             printArgs(args);
         }
    }

    public static void printArgs(String[] arg) {
        for (String i :arg ) {
            printArg(i);
        }
    }

    public static void printArg(String value) {
        System.out.println(value);
    }
}



