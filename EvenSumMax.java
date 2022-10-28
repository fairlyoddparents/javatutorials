import java.util.*;

public class EvenSumMax{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int n = getHowManyNumbers(console);
        int[] numbers = getValues(console, n);
        int even_sum = sumEvenNumbers(numbers);
        int max = getMaxNumber(numbers);
        printResults(even_sum, max);
    }

    public static int getHowManyNumbers(Scanner console){
        System.out.print("How many integers? ");
        int n = console.nextInt();
        return n;
    }

    public static int[] getValues(Scanner console, int n){
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            System.out.printf("Integer %d: ", i+1);
            numbers[i] = console.nextInt();
        }
        return numbers;
    }

    public static int sumEvenNumbers(int[] numbers){
        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]%2 == 0){
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int getMaxNumber(int[] numbers){
        int max = numbers[0];
        for (int i=1; i<numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }
        return max;
    }

    public static void printResults(int sum, int max){
        System.out.printf("Even sum = %d%nEven max = %d", sum, max);
    }
}
