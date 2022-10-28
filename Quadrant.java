import java.util.*;

//this program determines the quadrant of a point provided by a user
public class Quadrant{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        double[] point = getValues(console);
        String location = determineQuadrant(point);
        printResults(location);
    }

    public static double[] getValues(Scanner console){
        double[] point = new double[2];
        System.out.print("What's the X value: ");
        point[0] = console.nextDouble();
        System.out.print("What's the Y value: ");
        point[1] = console.nextDouble();
        return point;
    }

    public static String determineQuadrant(double[] point){
        if (point[0]==0 && point[1]==0){
            return "the origin";
        } else if(point[0]>=0){
            if (point[1]>=0){
                return "quadrant 1";
            } else {
                return "quadrant 4";
            }
        } else {
            if (point[1]>=0){
                return "quadrant 2";
            } else {
                return "quadrant 3";
            }
        }
    }

    public static void printResults(String location){
        System.out.printf("The point you entered is in %s.", location);
    }
}
