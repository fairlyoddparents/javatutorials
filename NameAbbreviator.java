import java.util.*;

public class NameAbbreviator{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);
    introduction();
    String name = getName(console);
    abbreviate(name);
  }

  public static void introduction(){
    System.out.println("This program abbreviates a given name.");
  }

  public static String getName(Scanner console){
    System.out.print("Write a name: ");
    String name = console.nextLine();
    return name;
  }

  public static void abbreviate(String fullname){
    String[] names = fullname.split(" ");
    System.out.printf("This name is abbreviated to %s, %c.%n", names[1], names[0].charAt(0));
  }
}
