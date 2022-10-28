import java.util.*;

public class LongestName{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = getHowManyNames(console);
        String[] names = getNames(console, n);
        longestName(names);
    }

    public static int getHowManyNames(Scanner console){
        System.out.print("How many names do you want to enter? ");
        int n = console.nextInt();
        return n;
    }

    public static String[] getNames(Scanner console, int n){
        String[] names = new String[n];
        for (int i=0; i<n; i++){
            System.out.printf("Name #%d: ", i+1);
            names[i] = console.next();
        }
        return names;
    }

    public static void longestName(String[] names){
        String longest = names[0];
        for (int i=0; i<names.length; i++){
            if (longest.length() < names[i].length()){
                longest = names[i];
            }
        }
        System.out.printf("The longest name is %s.", longest);
    }
}
