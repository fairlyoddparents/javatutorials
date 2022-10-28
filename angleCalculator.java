import java.util.*;
import java.lang.*;

public class angleCalculator{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the lenght of side a: ");
        int a = console.nextInt();
        System.out.print("What's the lenght of side b: ");
        int b = console.nextInt();
        System.out.print("What's the lenght of side c: ");
        int c = console.nextInt();

        System.out.println("");
        System.out.println("Angle A is " + calculateAngleA(a, b, c));
        System.out.println("Angle B is " + calculateAngleB(a, b, c));
        System.out.println("Angle C is " + calculateAngleC(a, b, c));
    }

    public static double calculateAngleA(int a, int b, int c){
        double angleA = Math.toDegrees(Math.acos((b*b+c*c-a*a)/(2.0*b*c)));
        return twoDecimals(angleA);
    }

    public static double calculateAngleB(int a, int b, int c){
        double angleB = Math.toDegrees(Math.acos((c*c+a*a-b*b)/(2.0*c*a)));
        return twoDecimals(angleB);
    }

    public static double calculateAngleC(int a, int b, int c){
        double angleC = Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2.0*a*b)));
        return twoDecimals(angleC);
    }

    public static double twoDecimals(double angle){
        return ((double)((int)(angle*100)))/100;
    }
}
