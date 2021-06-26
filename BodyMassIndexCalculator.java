import java.util.*;

public class BodyMassIndexCalculator{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        for (int i = 1; i <= 2; i++){
            System.out.println("");
            System.out.printf("Enter person #%d's information: %n", i);
            System.out.print("height (in inches)? ");
            double height = console.nextDouble()*1.00;
            System.out.print("weight (in pounds)? ");
            double weight = console.nextDouble()*1.00;

            calculateIndex(i, height, weight);
        }
    }

    //prints statements explaining what the program does
    public static void introduction(){
        System.out.println("This program reads data for two");
        System.out.println("people and computes their body");
        System.out.println("mass index and weight status.");
    }

    public static void calculateIndex(int i, double height, double weight){
        double bodyMassIndex = weight / (height*height) * 703;
        System.out.printf("Person #%d body mass index = %.1f", i, bodyMassIndex);
        if (bodyMassIndex <= 18.5){
            System.out.println(" wasted");
        } else if (bodyMassIndex <= 24.9){
            System.out.println(" normal");
        } else if (bodyMassIndex <= 29.9){
            System.out.println(" overweight");
        } else if (bodyMassIndex <= 39.9){
            System.out.println(" obese");
        } else {
            System.out.println(" extremely obese");
        }
    }
}
