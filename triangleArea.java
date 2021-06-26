import java.util.*;
import java.lang.Math.*;

public class triangleArea{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the lenght of the first side? ");
        double a = console.nextDouble();
        System.out.print("What's the lenght of the second side? ");
        double b = console.nextDouble();
        System.out.print("What's the lenght of the third side? ");
        double c = console.nextDouble();

        double s = (a+b+c)/2;
        double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.print("The area is " + area);
    }
}
