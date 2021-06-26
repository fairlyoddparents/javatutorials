import java.util.*;


public class TheNewGame{
    public static void main(String[] args){
        System.out.print("What is your name?");
        Scanner console = new Scanner(System.in);
        String n = console.nextLine();
        String[] name = n.split(" ");
        cheers(name[0]);
        cheers(name[1]);
    }

    public static void cheers(String name) {
        System.out.println(name + " " + name + ", " + "bo-B" + name.substring(1, name.length()));
        System.out.println("Banana-fana fo-F" + name.substring(1, name.length()));
        System.out.println("Fee-fi-mo-M" + name.substring(1, name.length()));
        System.out.println(name.toUpperCase() + "!");
    }
}
