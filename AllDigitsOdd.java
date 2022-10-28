import java.util.*;

public class AllDigitsOdd{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        String number = getNumber(console);
        allDigitsOdd(number);
    }

    public static void introduction(){
        System.out.print("This program returns true if a given number consists ");
        System.out.print("of entirely odd digits and false if any of its digits ");
        System.out.println("are even");
    }

    public static String getNumber(Scanner console){
        System.out.print("Write a number: ");
        String number = console.nextLine();
        return number;
    }

    public static Boolean allDigitsOdd(String number){
        Boolean result = true;
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) % 2 == 0){
                result = false;
            }
        }
        System.out.print(result);
        return result;
    }
}
