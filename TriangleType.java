//this program determines whether three sides make a triangle
//then determines the type of triangle they form
import java.util.*;

public class TriangleType{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int[] sides = getSides(console);
        boolean triangle = isTriangle(sides[0], sides[1], sides[2]);
        String type = triangleType(triangle, sides[0], sides[1], sides[2]);
        printResults(type);
    }

    public static void introduction(){
        System.out.print("this program determines whether three sides make a triangle");
        System.out.println("then determines the type of triangle they form");
    }

    public static int[] getSides(Scanner console){
        int[] sides = new int[3];
        System.out.print("Length of side a: ");
        sides[0] = console.nextInt();
        System.out.print("Lenght of side b: ");
        sides[1] = console.nextInt();
        System.out.print("Lenght of side c: ");
        sides[2] = console.nextInt();
        return sides;
    }

    public static boolean isTriangle(int a, int b, int c){
        if ((a+b>c) && (a+c>b) && (b+c>a)){
            return true;
        } else {
            return false;
        }
    }

    public static String triangleType(boolean triangle, int a, int b, int c){
        if (triangle){
            if ((a == b) && (a == c)){
                return "an Equilateral triangle";
            } else if ((a == b) || (a == c) || (b == c)){
                return "an Isosceles triangle";
            } else {
                return "a Scalene triangle";
            }
        } else {
            return "not a triangle";
        }
    }

    public static void printResults(String type){
        System.out.printf("This is %s.", type);
    }
}
