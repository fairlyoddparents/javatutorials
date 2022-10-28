import java.util.*;

public class MinAndMaxNumbers{
    public static void main (String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = getNumbers(console);
        determineMinMax(list);
    }

    public static void introduction(){
        System.out.print("This program prompts the user to enter a number ");
        System.out.println("until the number -1 is entered. ");
        System.out.print("Then it prints the minimum and maximun numbers ");
        System.out.println("the user entered.");
    }

    public static ArrayList<Integer> getNumbers(Scanner console){
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.print("Type a number (or -1 to stop): ");
        int n = console.nextInt();
        while (n != -1){
            list.add(n);
            System.out.print("Type a number (or -1 to stop): ");
            n = console.nextInt();
        }
        return list;
    }

    public static void determineMinMax(ArrayList<Integer> list){
        Collections.sort(list);
        System.out.printf("The smallest number you entered is %d.%n", list.get(0));
        System.out.printf("The largest number you entered is %d.%n", list.get(list.size()-1));
    }
}
