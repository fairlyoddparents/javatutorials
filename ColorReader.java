import java.util.*;

//A program that reads the first letter of a collor and prints the longer equivalent
public class ColorReader{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    introduction();
    String letter = getLetter(console).toLowerCase().trim();
    String color = determineColor(letter);
    printResults(color);
  }

  //Prints an explanation of what the program does
  public static void introduction(){
    System.out.print("This program reads the first letter of ");
    System.out.println("a color and prints its full name.");
  }

  //asks the user to provide the first letter of a color
  public static String getLetter(Scanner console){
    System.out.print("Write the first letter of the color you want: ");
    String letter = console.next();
    return letter;
  }

  //determines the full color using the letter provided by the user
  public static String determineColor(String letter){
    if (letter.length()==1){
      if (letter.contentEquals("g")){
        return "Green";
      } else if (letter.contentEquals("b")) {
        return "Blue";
      } else if (letter.contentEquals("r")){
        return "Red";
      } else {
        return "an unknown color";
      }
    } else {
      return "an unknown color: " + letter;
    }
  }

  //tells the name of the color he chose
  public static void printResults(String color){
    System.out.printf("You have chosen %s.", color);
  }
}
