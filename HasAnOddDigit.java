import java.util.*;

public class HasAnOddDigit{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        String n = getNumber(console);
        hasAnOddDigit(n);
    }

    public static void introduction(){
        System.out.print("Reads a number and returns true if the number has ");
        System.out.print("at least one odd digit and false if not of its ");
        System.out.println("digits are odd");
    }

    public static String getNumber(Scanner console){
        System.out.print("Write your number: ");
        String n = console.nextLine();
        return n;
    }

    public static boolean hasAnOddDigit(String n){
        boolean result = false;
        for (int i = 0; i < n.length(); i++){
            if ((n.charAt(i) + 0) % 2 != 0){
                result = true;
            }
        }
        System.out.printf("The number you enter has at least one odd digit: %b.%n", result);
        return result;
    }
}
