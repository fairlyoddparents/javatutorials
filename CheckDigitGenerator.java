import java.util.*;

public class CheckDigitGenerator{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();
        int number = getNumber(console);
        int check_number = calculate7thDigit(number);
        printResults(check_number, number);
    }

    public static void introduction(){
        System.out.print("This program prompts the user for a six digit number. ");
        System.out.print("Then generates a check digit for that number ");
        System.out.print("using the formula 7th digit=(1*(1st digit)+2*(2nd digit)");
        System.out.print("+. . .+6*(6th digit))%10. A check digit will later help ");
        System.out.print("the user catch typing errors. When a user types in a student number, ");
        System.out.print("the user types all seven digits. If the number is typed incorrectly, ");
        System.out.println("the check digit will fail to match in 90% of the cases.");
        System.out.println("");
    }

    public static int getNumber(Scanner console){
        System.out.print("Write a six digit number: ");
        int number = console.nextInt();
        return number;
    }

    public static int calculate7thDigit(int n){
        int d1 = n/100000;
        int d2 = (n%100000)/10000;
        int d3 = (n%10000)/1000;
        int d4 = (n%1000)/100;
        int d5 = (n%100)/10;
        int d6 = (n%10);
        int d7 = ((1*d1)+(2*d2)+(3*d3)+(4*d4)+(5*d5)*(6*d6))%10;
        return d7;
    }

    public static void printResults(int d7, int n){
        System.out.printf("The check number for %d is %d.%n", n, d7);
    }
}
