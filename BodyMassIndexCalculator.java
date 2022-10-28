
//this program computes the body mass index (BMI)  for two people
import java.util.*;

public class BodyMassIndexCalculator{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        double bmi_person1 = getBMI(console);
        double bmi_person2 = getBMI(console);
        reportResults(bmi_person1);
        reportResults(bmi_person2);
    }

    //prints statements explaining what the program does
    public static void introduction(){
        System.out.println("This program reads data for two");
        System.out.println("people and computes their body");
        System.out.println("mass index and weight status.");
    }

    //gets the info from the user and calls method to calculate BMI
    public static double getBMI(Scanner console){
      System.out.println("");
      System.out.println("Enter the person's information:");
      System.out.print("height (in inches)? ");
      double height = console.nextDouble()*1.00;
      System.out.print("weight (in pounds)? ");
      double weight = console.nextDouble()*1.00;

      return calculateBMI(height, weight);
    }

    //calculates BMI value
    public static double calculateBMI(double height, double weight){
        double bodyMassIndex = weight / (height*height) * 703;
        return bodyMassIndex;
    }

    //reports the results for a single person
    public static void reportResults(double bodyMassIndex){
        System.out.println("");
        System.out.printf("Person's body mass index = %.1f", bodyMassIndex);

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
