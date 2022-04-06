package practiceFromBegining.day07;

public class UnaryOperators {
    public static void main(String[] args) {
        int num=+25;
        int num2=-25;
        System.out.println(num<0);
        System.out.println(num2<0);

        int a=5;
        ++a;
        System.out.println(a);
        --a;
        System.out.println(a);
        int b=100;

        System.out.println(b++);
        int c=200;
        c++;
        System.out.println(c);

        int x=200;
        System.out.println(--x);

        int y=200;
        System.out.println(y--);
        System.out.println(y);

        int z=45;
        System.out.println(++z);//46
        System.out.println(z++);//46
        System.out.println(z);//47

        int q=30;
        System.out.println(--q);//29
        System.out.println(q--);//29
        System.out.println(q);//28

    }
}
