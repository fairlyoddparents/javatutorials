import java.util.*;
import java.lang.Math.*;

public class lastDigit{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the number? ");
        int n = console.nextInt();
        int digit = Math.abs(n%10);
        System.out.print("The last digit of your number is " + digit);
    }
}
