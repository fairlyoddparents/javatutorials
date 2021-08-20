import java.util.*;

public class StartsWithCapitalLetter{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    introduction();
    String text = getText(console);
    boolean capital_letter = startsWithCapitalLetter(text.charAt(0));
    printResults(capital_letter);
  }

  public static void introduction(){
    System.out.print("This program will determine whether a text ");
    System.out.println("starts with a capital letter");
  }

  public static String getText(Scanner console){
    System.out.print("Write your text: ");
    String text = console.next();
    return text;
  }

  public static boolean startsWithCapitalLetter(char first_letter){
    return Character.isUpperCase(first_letter);
  }

  public static void printResults(boolean capital_letter){
    if (capital_letter == true){
      System.out.println("The text starts with a capital letter.");
    } else {
      System.out.println("The text doesn't start with a capital letter");
    }
  }
}
