import java.util.Scanner;

public class FizzBuzz {
  public static void main(final String [] args) {
    System.out.println("Ingrese un número entero positivo:");

    final Scanner scanner =  new Scanner(System.in);
    final int number = scanner.nextInt();

    if (number % 3 == 0 && number % 5 == 0) {
      System.out.println("FizzBuzz");
    }
    else if (number % 3 == 0){
      System.out.println("Fizz");
    }
    else if (number % 5 == 0){
      System.out.println("Buzz");
    }
    else {
      System.out.println(number);
    }
  }
}


