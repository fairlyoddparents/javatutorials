import java.util.*;

public class BillCalculator{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);

    introduction();
    int num = getNumOfPeople(console);
    for (int i=0; i<num; i++){
      String name = getName(console);
      double amount = getSpending(console, name);
      printResults(name, amount);
    }
  }

  public static void introduction(){
    System.out.print("This program calculate the number of bills ");
    System.out.print("someone will need in relation to the amount ");
    System.out.print("of money they are planning to spend.");
    System.out.println();
  }

  public static int getNumOfPeople(Scanner console){
    System.out.print("Let's first determine how many people want to ");
    System.out.print("know the number of bills they are going to be ");
    System.out.print("using in this occasion.");
    System.out.println();
    System.out.print("Write the number of people who want to calculate their bills: ");
    int num = console.nextInt();
    return num;
  }

  public static String getName(Scanner console){
    System.out.print("Write your name: ");
    String name = console.next();
    return name;
  }

  public static double getSpending(Scanner console, String name){
    System.out.printf("How much will %s will be spending?", name);
    double amount = console.nextDouble();
    System.out.println();
    return amount;
  }

  public static int calculateBills(String name, double amount){
    int numBills = (int) (amount / 20.0);
    if (numBills * 20.0 < amount) {
      numBills++;
    }
    return numBills;
  }

  public static void printResults(String name, double amount){
    int numBills = calculateBills(name, amount);
    System.out.printf("%s needs %d bills. %n%n", name, numBills);
  }
}
