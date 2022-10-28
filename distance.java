import java.util.*;
import java.lang.Math.*;

public class distance{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's x1? ");
        int x1 = console.nextInt();
        System.out.print("What's y1? ");
        int y1 = console.nextInt();
        System.out.print("What's x2? ");
        int x2 = console.nextInt();
        System.out.print("What's y2? ");
        int y2 = console.nextInt();

        int a = x2-x1;
        int b = y2-y1;
        double distance = Math.sqrt(a*a+b*b);
        System.out.println("The distance is " + distance);
    }
}
