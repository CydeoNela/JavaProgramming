package day06_PrimitiveTypeCastings;

import jdk.swing.interop.SwingInterOpUtils;

public class AritmeticOperators {
    public static void main(String[] args) {
        System.out.println(10+20);//30
        System.out.println("12"+1);//string involved-concatinantion 121
        System.out.println(100-50);//50
        System.out.println(10*6); //60


        System.out.println(100/3);//to get decimal, one number(numerator or denominator has to be decimal

        System.out.println(10D/4);//add D or d to get decimal result
                                  //2.5
        int a=100;
        double b=a/6; //16
        System.out.println(b);

        double c=a/6d;
        System.out.println(c);





    }


}
/*

+:Addition
-:Substraction
*:Multiplication
/:Division

integer/integer======integer
decimal/integer======>decimal
integer/decimal======>decimal
decimal/decimal=======>decimal
%:Reminder



 */