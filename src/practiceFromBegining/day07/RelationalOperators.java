package practiceFromBegining.day07;

public class RelationalOperators {
    public static void main(String[] args) {
        //<,>,>=,<=

        boolean result1=200>40;
        System.out.println("result1 = " + result1);

        boolean result2=300>=150;
        System.out.println("result2 = " + result2);

        boolean result3=100>=100;
        System.out.println("result3 = " + result3);

        boolean result4=300<=500;
        System.out.println("result4 = " + result4);

        int creditScore=745;
        boolean isEligibleForLoan=creditScore>=720;

        boolean result5=100<120;
        System.out.println("result5 = " + result5);

        boolean result6=200<180;
        System.out.println("result6 = " + result6);

         int score=90;
        boolean hasFialed=score<=59;
        System.out.println("hasFialed = " + hasFialed);

        boolean result=45<=60;
        System.out.println("result = " + result);

        int x=100;
        int y=200;
        boolean equal=x==y;
        System.out.println(equal);

        boolean result8="Muhtar"=="Good Guy";
        System.out.println("result8 = " + result8);

        boolean Aa="A"=="a";
        System.out.println("Aa = " + Aa);

        boolean result10="Java"=="Java";
        System.out.println("result10 = " + result10);

        boolean resultx=100 !=200.5;
        System.out.println("resultx = " + resultx);

        boolean resultxx="Java"!="Break";
        System.out.println("resultxx = " + resultxx);

        boolean resultss=300!=300;
        System.out.println("resultss = " + resultss);


    }
}
