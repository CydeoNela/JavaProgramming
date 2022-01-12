package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {


        int num1=+25;
        int num2=-25;
        System.out.println(num1<0);
        System.out.println(num2<0);


        System.out.println("--------------------------------");

        int a=5;
        ++a;//pre increment:increases the value by 1 right away
        System.out.println(a);


        System.out.println("-----------------");

        int b=100;
        System.out.println(b++);//post increment: pospone increasing,
        // first passes correct value before increaseing by 1
        //current value 100
        //increase value in next step//101
        System.out.println(b);


        System.out.println("------------------------------------------------");
        int x =200;
        System.out.println(--x);//



        int z=45;
        System.out.println(++z);//pre increment, increase value by 1 immediatelly, right away z=46
        System.out.println(z++);//post increment, increase value by 1 in second step, z=46
        System.out.println(z++);//47


        


    }




}
