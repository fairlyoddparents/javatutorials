import java.util.*;

public class BlackjackCards{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    introduction();
    String[] values = getValues(console);
    String rank = determineRank(values[0]);
    String suit = determineSuit(values[1]);
    printResults(rank, suit);
  }

  public static void introduction(){
    System.out.print("This program tells you the full name of a card ");
    System.out.println("when you provide the abbreviation.");
  }

  public static String[] getValues(Scanner console){
    String[] values = new String[2];
    System.out.print("Write the rank: ");
    values[0] = console.next().toLowerCase().trim();
    System.out.print("Write the suit: ");
    values[1] = console.next().toLowerCase().trim();
    return values;
  }

  public static String determineRank(String abbreviation){
     if (abbreviation.equals("j")){
       return "Jack";
     } else if (abbreviation.equals("k")){
       return "King";
     } else if (abbreviation.equals("a")){
       return "Ace";
     } else if (abbreviation.equals("q")){
       return "Queen";
     } else if (abbreviation.equals("2")){
       return "Two";
     } else if (abbreviation.equals("3")){
       return "Three";
     } else if (abbreviation.equals("4")){
       return "Four";
     } else if (abbreviation.equals("5")){
       return "Five";
     } else if (abbreviation.equals("6")){
       return "Six";
     } else if (abbreviation.equals("7")){
       return "Seven";
     } else if (abbreviation.equals("8")){
       return "Eight";
     } else if (abbreviation.equals("9")){
       return "Nine";
     } else if (abbreviation.equals("10")){
       return "Ten";
     } else {
       return abbreviation;
     }
  }

  public static String determineSuit(String abbreviation){
    if (abbreviation.equals("c")){
      return "Clubs";
    } else if (abbreviation.equals("s")){
      return "Spades";
    } else if (abbreviation.equals("h")){
      return "Hearts";
    } else if (abbreviation.equals("d")){
      return "Diamonds";
    } else {
      return abbreviation;
    }
  }

  public static void printResults(String rank, String suit){
    System.out.println(rank + " of " + suit);
  }
}
