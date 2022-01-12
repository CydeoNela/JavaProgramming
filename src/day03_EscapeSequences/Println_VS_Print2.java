package day03_EscapeSequences; //It is the package name of this class

import jdk.swing.interop.SwingInterOpUtils;

public class Println_VS_Print2 {// this is classs

    public static void main(String[] args) { //this is main method
        System.out.println("Knock Knock");// It prints knock knock, then it oppeneds a new line
        System.out.println("Who is this?");

        System.out.print("This is Java");
        System.out.println("------------------------------");

        System.out.println("Knock Knock");
        System.out.println("Who is this");
        System.out.println("This is Java");

        System.out.println();
        System.out.println("---------------------------------------");

        System.out.println("Hello everyone, How are you all today? We will learn sequences...");

        System.out.println("-----------------------------------");

        System.out.println("Hello everyone"); //prints knock knock, does not append new line
        System.out.println("How are you all today?");
        System.out.println("Today we will learn....");


//single line comment here

//Topics:
     /*   println
                print method
                    comments */

    }


}
