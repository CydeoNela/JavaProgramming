package practiceFromBegining.day05_Concatination;

public class FullName {
    public static void main(String[] args) {
        String firstName="Daniela";
        String lastName="Mitrovic";
        int age=39;
        char gender='F';
        String company="IFG";
        String jobTItle="SDET";
        double yearOfEperience=4;
        int salary=100000;

        String fullName= firstName+ " "+ lastName;
        System.out.println("fullName = " + fullName);


        // Full name of the person is _______=
        System.out.println("Full name of the person is= "+ fullName);


        //___ is __ years old
        System.out.println(firstName+" " + lastName+" is "+age+" years old");

        //FullName is JobTitle, works at CompanyName, and FullName's salary is Salary
        System.out.println(fullName+ " is "+ jobTItle+
                " , works at "+ company+ ", and "+ fullName+"'s"+ " salary is "+salary);

    }
}
