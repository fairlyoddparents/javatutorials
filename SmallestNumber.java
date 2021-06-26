import java.util.*;

public class SmallestNumber{

    public static void main(String[] args){
        //prompt the user to introduce the three numbers
        Scanner console = new Scanner(System.in);
        System.out.print("Write the first number: ");
        int n1 = console.nextInt();
        System.out.println("");
        System.out.print("Write the second number: ");
        int n2 = console.nextInt();
        System.out.println("");
        System.out.print("Write the third number: ");
        int n3 = console.nextInt();
        System.out.println("");

        int smallest = calculateSmallest(n1, n2, n3);
        System.out.println("The smallest number is " + smallest);
    }

    //calculates and return the smallest number
    public static int calculateSmallest(int n1, int n2, int n3){
        return (Math.min(n1, Math.min(n2, n3)));
    }
}
