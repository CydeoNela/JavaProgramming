package day08_ifStatements;

public class NumberOfDays {
    public static void main(String[] args) {


    int number=5;

    boolean has28Days= number==2;
    boolean has30Days=number==4 || number==6 || number==9 || number==11;//for the months that has 30 days
    boolean has31Days=!has28Days && !has30Days;//if the month does not have 28 days and doesn't have 30 days

    if(has28Days) {//if the month has 28 days it will print 28 days as output
        System.out.println("28 days");
    }
      if(has30Days) {//if the month has 30 days, this boolean expresion will print 30 days
          System.out.println("30 days");
      }

          if(has31Days){//if the month has 31 days, it will print 31 days
              System.out.println("31 days");
          }




    }

}
/*
1. Create a class called NameOfTheMonth, write a program that can display the name of the month

            number = 1 ~ 12

2. Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7

3. Create a class called NumberOfDays, Write a program that can print the number of days in a month

            Ex:
                number = 1;

            output:
                31 Days

            Hints:
                Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
                Months that has 30 days: 4, 6, 9, 11
                Month that has 28 days: 2
 */