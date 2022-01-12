package day05_Concetanation;

public class FullName {
    public static void main(String[] args) {


        String firstName = "Jimmy";
        String lastName = "King";
        int age = 45;
        String jobTitle = "Senior SDET";
        String companyName = "Apple Inc";
        double salary=1000000;


        String fullName = firstName + " " + lastName;


        //Full name of the person is_______
        System.out.println("Full name of the person is " + fullName);

        // is _____years old
        System.out.println(fullName + " is " + age + " years old ");

        //3 Concatenations
//FullName "is" JobTitle +", works at "+ CompanyName, and fullName salsry is

        System.out.println(fullName+" is "+jobTitle
                +", works at " + companyName + ", and " + fullName+ "'s salary is "+ salary);


    }
}
/*

Create a class called FullName.java
2. Declare the following variables:
1.firstName
2.lastName
3. Use concatenation to print the full address


 */