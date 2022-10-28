import java.util.*;
import java.lang.Math.*;

public class quadratic{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the value of a? ");
        int a = console.nextInt();
        System.out.print("What's the value of b? ");
        int b = console.nextInt();
        System.out.print("What's the value of c? ");
        int c = console.nextInt();

        //calculate the values of X
        double x = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double x2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.print("x=" + x + " or x=" + x2);
    }
}
