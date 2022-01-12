package day09_ifStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a=10,
              b=15,
                c=20;


        //a=15,b=10,c=20
        boolean aisMedian=( a > b && a < c) || (a < c && a < b);


        //b=15, a=20, c=10      b=15,a=10,c=20
        boolean bisMedian=(b>c && b<a) ||   (b>a && b<c) ;

        boolean cIsMedian=!aisMedian && !bisMedian;

    if(aisMedian){//if a is the median number
        System.out.println(a+ " is the median number");
    }

    if(bisMedian) {//if b is the median number
        System.out.println(b + " is median number");
    }
    if(cIsMedian){
        System.out.println(c+ "is the median number");
    }

    }




}
/*

2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number




 */