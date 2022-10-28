import java.awt.*;
import java.lang.Math.*;
import java.util.*;

//disclaimer: most of this code was taken from  the tutorial with some modifications
//calculates and graphically displays  the trajectory of a projectile
//by prompting the user to provide:
//speed, angle, number of steps he wants to see displayed
public class Project3G4{
    public static void main(String[] args){
        //prompts the user to obtain the information
        introduction();
        Scanner console = new Scanner(System.in);
        System.out.print("What's the initial speed (meters/seconds)?");
        double speed = console.nextDouble();
        System.out.print("What's the angle?");
        double angle = Math.toRadians(console.nextDouble());
        System.out.print("How many steps do you want to see displayed?");
        int steps = console.nextInt();

        //Calculates and draws the path of the projectile
        DrawingPanel panel = new DrawingPanel(420, 220);
        Graphics g = panel.getGraphics();
        drawPath(g, speed, angle, steps);
    }

    public static void drawPath(Graphics g, double speed, double angle, int steps){
        //calculates path
        final double ACCELERATION = -9.81;
        double xVelocity = speed * Math.cos(angle);
        double yVelocity = speed * Math.sin(angle);
        double totalTime = -2.0 * yVelocity / ACCELERATION;

        double timeIncrement = totalTime / steps;
        double xIncrement = xVelocity * timeIncrement;

        int x = 0;
        int y = 0;
        double t = 0.0;

        for (int i=0; i<=steps; i++){
            //draws path
            g.fillOval(x, (-1)*y+100, 3, 3);

            t += timeIncrement;
            x += Math.round(xIncrement);
            y = (int) Math.round(displacement(yVelocity, t, ACCELERATION));
        }
    }

    //returns the vertical displacement for a body given
    //its initial velocity v, elapsed time t, and accelaration a
    public static double displacement(double v, double t, double a){
        return v * t + 0.5 * a * t * t;
    }

    //the statemets that we'll use to explain the program to the user
    public static void introduction(){
        System.out.println("We are going to help you calculate the trajectory of a projectile");
        System.out.println("Then, when we have it, we will display it graphically so you can see the trajectory");
        System.out.println("Ready?");
    }

}
