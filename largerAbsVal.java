import java.lang.Math.*;
import java.util.*;

public class largerAbsVal{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's your first number? ");
        int n1 = console.nextInt();
        System.out.print("What's your second number? ");
        int n2 = console.nextInt();

        int n3 = Math.max(Math.abs(n1), Math.abs(n2));
        System.out.println("The largest absolute number is " + n3);
    }
}
