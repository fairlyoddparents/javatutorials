import java.util.*;

public class area{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the radius? ");
        int r = console.nextInt();

        double a = Math.PI*r*r;
        System.out.println("The area is " + a);
    }
}
