import java.util.*;


//this program checks all the numbers from zero up to a certain number
//and prints all the perfect numbers found in between
public class GetPerfectNumbers{
    public static void main(String[] args){
        Scanner console = new Scanner (System.in);
        int max = getMaxNumber(console);
        ArrayList<Integer> perfect_numbers = determinePerfectNumbers(max);
        printResults(perfect_numbers, max);

    }

    //this method promps the user to input a number
    public static int getMaxNumber(Scanner console){
        System.out.print("We will show all the perfect numbers between ");
        System.out.println("zero and the number you provide. ");
        System.out.print("What is the number of your choice? ");
        int max = console.nextInt();
        return max;
    }

    //this method gets all the perfect numbers between 0 and the number provided by the user
    //it first calculates each number's factors and then adds them to determine if they are perfect
    //all perfect numbers are added to an ArrrayList
    public static ArrayList<Integer> determinePerfectNumbers(int max){
        ArrayList<Integer> perfect_numbers = new ArrayList<Integer>();
        for (int i=1; i<=max; i++){
            ArrayList<Integer> factors = getFactors(i);
            if (isPerfect(factors, i)){
                perfect_numbers.add(i);
            }
        }
        return perfect_numbers;
    }

    //this method determines all the factors of a single number
    public static ArrayList<Integer> getFactors(int n){
        ArrayList<Integer> factors = new ArrayList<Integer>();
        for (int i = 1; i<n; i++){
            if (n%i == 0){
                factors.add(i);
            }
        }
        return factors;
    }

    //this method uses the factors of a number to determine if it is perfect
    public static boolean isPerfect(ArrayList<Integer> factors, int n){
        double sum = factors.stream().mapToDouble(a->a).sum();
        if (sum == n){
            return true;
        } else {
            return false;
        }
    }

    //this method prints the results
    public static void printResults(ArrayList<Integer> perfect_numbers, int n){
        System.out.printf("Perfect numbers up to %d:%n", n);
        perfect_numbers.stream().forEach(System.out::println);
    }
}
