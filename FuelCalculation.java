import java.util.Scanner;
public class FuelCalculation {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Сколько км мы ездили? ");
    double  miles = scanner.nextDouble();
  
    System.out.println("На какую сумму залили бензин?");
    double  fuel = scanner.nextDouble();
  
    System.out.println("Цена бензина?");
    double  costOfFuel= scanner.nextDouble();
    
    double  fuelConsumption =  miles/fuel;
    System.out.println("На каждый километр потребляет:" +fuelConsumption);
    
    double priceForEveryMile = miles *costOfFuel/100;
    
    System.out.println("На каждый километр потребляет " + priceForEveryMile + " сом " + " или " + priceForEveryMile * 100 + " сом на 100 км ");
    
    
    
    
    
    
    
    
    
    
  }
}
