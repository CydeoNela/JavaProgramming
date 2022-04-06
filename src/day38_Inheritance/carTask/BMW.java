package day38_Inheritance.carTask;

public class BMW extends Car {
    public BMW(String brand,String model,int year, double price,String color, int miles){
        super("BMW", model, year, price, color, miles);
    }
    public void breaksDown(){
        System.out.println(brand+" "+model+" breaks down");
    }
    @Override
    public void start(){
        System.out.println("Call mechanic if breaks down");
    }

}
