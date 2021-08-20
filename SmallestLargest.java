import java.util.*;
import java.lang.*;

//this programs determines the largest number and the smallest number
//in n numbers provided by the user
public class SmallestLargest{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = getHowManyNumbers(console);
        int[] numbers = getValues(console, n);
        determineLargest(numbers);
        determineSmallest(numbers);
    }

    public static int getHowManyNumbers(Scanner console){
        System.out.print("How many numbers do you wnat to enter? ");
        int n = console.nextInt();
        return n;
    }

    public static int[] getValues(Scanner console, int n){
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Number %d: ", i+1);
            numbers[i] = console.nextInt();
        }
        return numbers;
    }

    public static void determineLargest(int[] numbers){
        int max = numbers[0];
        for (int i=1; i<numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }
        System.out.printf("Largest = %d%n", max);
    }

    public static void determineSmallest(int[] numbers){
        int min = numbers[0];
        for (int i=1; i<numbers.length; i++){
            min = Math.min(min, numbers[i]);
        }
        System.out.printf("Smallest = %d", min);
    }
}
