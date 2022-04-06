package practiceFromBegining.day06_Primitive_Type_Casting;

public class ArithmeticOperators {
    public static void main(String[] args) {

        System.out.println("12"+1);//121

        System.out.println(10+20);//30 Addition
        System.out.println(100-50);//50 Substraction
        System.out.println(10*6);//60 Multiplication
        System.out.println(10/3);//33
        System.out.println(10.0/4);//2.5
        System.out.println(10d/4);//2.5

        int a=100;
        double b=a/6;//16
        System.out.println(b);

        double c=a/6;
        System.out.println(c);
        /*
    +: Addition
    -: Subtract
    *: Multiplication
    /: Division
            integer / integer ====> integer
            decimal / integer ====> decimal
            integer / decimal ====> decimal
            decimal / decimal ====> decimal
            in math:
                10/4 = 2.5
                100/3 = 33.333....
            in java:
                10/4 = 2
                10.0/4 = 2.5
                100/3 = 33
    %: Remainder
 */
    }
}
