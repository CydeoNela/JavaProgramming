package day07_Operators;

public class RelationalOperators {
    public static void main(String[] args) {
        //>,>=,<,<=
        boolean result1=200>40;              //if 20 is >40 Iwant to assign
                                            //it will evaluated as T or F

        System.out.println(result1);

        System.out.println("-----------------------------------------------------------------");

        //>= has to conditions, > and =
        boolean result2=300>=150; //as long as one of them is T it will be T
        System.out.println(result2);

        boolean result3= 100>=100;// true

        System.out.println(result3);

        boolean result4=300>=500;// non of the condition matched, false


        //You are applying for loan and you need 720 credit score for loan.
        // Create condition(compare scorewith required score.
        int creditScore=745;

        boolean isEligibleForLoan=creditScore>=720;




    }






}
