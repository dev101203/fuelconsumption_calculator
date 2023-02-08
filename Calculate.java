import java.util.Scanner;

public class Calculate {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print(" Введите число: " + " ");
    int number = scanner.nextInt();
    
    int num = number % 2;
    boolean isEven = !(num> 0|| num < 0);
    System.out.println(isEven ? "even" : "odd");
    
    
  
  
  }
}

