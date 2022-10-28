//this program evaluates whether a user-given number is even or odd
import java.util.*;

public class EvenOrOdd{
  public static void main (String[] args){
    introduction();
    Scanner console = new Scanner(System.in);
    int number = getNumber(console);
    reportResults(number);
  }

  public static void introduction(){
    System.out.println("This program will help you decide whether a number is even or odd.");
  }

  public static int getNumber(Scanner console){
    System.out.print("What's your number? ");
    int number = console.nextInt();
    return number;
  }

  public static boolean decideIfEven(int number){
    if (number%2 == 0){
      return true;
    } else {
      return false;
    }
  }

  public static void reportResults(int number){
    if (decideIfEven(number) == true){
      System.out.printf("\nThe number %d is an even number.", number);
    } else {
      System.out.printf("\nThe number %d is an odd number.", number);
    }
  }
}
