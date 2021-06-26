import java.util.*;
import java.lang.Math.*;

public class sphereVolume{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the radius? ");
        double r = console.nextDouble();

        double v = (4*Math.PI*r*r*r)/3;
        System.out.println("The volume is " + v);
    }
}
