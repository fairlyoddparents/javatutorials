import java.lang.Math.*;
import java.util.*;

//prints the largest number of a set of 3 numbers
public class largestAbsVal2{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the first number? ");
        int n1 = console.nextInt();
        System.out.print("What's the second number? ");
        int n2 = console.nextInt();
        System.out.print("What's the third number? ");
        int n3 = console.nextInt();

        int largest = Math.max(Math.abs(n1), Math.max(Math.abs(n2), Math.abs(n3)));
        System.out.println("The largest number is " + largest);
    }
}
