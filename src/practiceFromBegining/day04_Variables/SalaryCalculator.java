package practiceFromBegining.day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //salary=weeklyHours*hourlyRate*numberOfWeeks
        int weeklyHours=40;
        int hourlyRate=15;
        int numberOfWeeks=100;
        int salary=weeklyHours*hourlyRate*numberOfWeeks;

        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("hourlyRate = " + hourlyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = " + salary);
    }
}
