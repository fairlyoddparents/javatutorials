import java.util.*;
import java.lang.Math.*;

public class cylinderSurfaceArea{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the radius? ");
        double r = console.nextDouble();
        System.out.print("What's the height? ");
        double h = console.nextDouble();

        double rec_area = 2*r*Math.PI*h;
        double cir_area = 2*r*r*Math.PI;
        double surf_area = cir_area + rec_area;
        System.out.println("The surface area is " + surf_area);
    }

}
