package day38_Inheritance.carTask;

public class ParkingLot {
    public static void main(String[] args) {
        Toyota toyota1=new Toyota("Toyota","nnn",2000,1000000,"red",66666);
        Tesla tesla1=new Tesla("Tesla","bbbb",2000,1000000,"white",99999);
        BMW bmw=new BMW("Tesla","bbbb",2000,1000000,"white",99999);


        toyota1.start();
        tesla1.start();
        bmw.start();
    }
}
