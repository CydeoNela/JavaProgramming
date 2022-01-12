package day09_ifStatements;

public class MinNumber {

    public static void main(String[] args) {
        int n1=100,
                n2=200;

        boolean n1isMIn=n1<n2;
        boolean n2IsMin=n2<n1;
        boolean equal=n1==n2;

        if(n1isMIn){//if n1 is min num
            System.out.println(n1+" is min number");//output, first pass variable(n1)
        }

           if(n2IsMin) {//if n2 is the min num
               System.out.println(n2+ " is the min num");//we declared 2 if st for 2 possibilities
           }
           if(equal){//if n1 is equal n2
               System.out.println("Equal");
           }
           //How do I know which st gets executed, depends on boolean expression
        //you will see 100 in min numb on cosnsole

/*

1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number

2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number


 */

    }
}
