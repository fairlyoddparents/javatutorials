import java.util.*;

public class printStrings{

    //prompts the user to indicate which text he wants to repeat
    //& how many times
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Write the text you wish to repeat: ");
        String text = console.next();
        System.out.println("");
        System.out.print("Write how many times you want it repeated: ");
        int number = console.nextInt();
        System.out.println("");

        printStrings(text, number);
    }

    //repeats a String a certain number of times
    public static void printStrings(String text, int number){
        for (int i=0; i<number; i++){
            System.out.print(text + " ");
        }
        System.out.println("");
    }
}
