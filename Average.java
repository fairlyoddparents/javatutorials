import java.util.*;

//this program calculates the average of n given numbers
public class Average{
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        int[] numbers = getValues(console);
        int average = calculateAverage(numbers);
        printResults(average);
    }

    public static int[] getValues(Scanner console){
        System.out.print("How many numbers do you want to enter? ");
        int n = console.nextInt();
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Write number %d: ", i+1);
            numbers[i] = console.nextInt();
        }
        return numbers;
    }

    public static int calculateAverage(int[] numbers){
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        int average = sum/numbers.length;
        return average;
    }

    public static void printResults(int average){
        System.out.printf("The average is %d.", average);
    }
}
