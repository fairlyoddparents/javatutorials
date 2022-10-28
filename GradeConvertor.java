import java.util.*;

public class GradeConvertor{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();
        double grade_percentage = getGrade(console);
        String grade_point = convertGrade(grade_percentage);
        printResults(grade_point);
    }

    public static void introduction(){
        System.out.println("This program converts a percentage into the grade point scale.");
    }

    public static double getGrade(Scanner console){
        System.out.print("What's the grade percentage? ");
        double grade_percentage = console.nextDouble();
        return grade_percentage;
    }

    public static String convertGrade(double grade_percentage){
        if (grade_percentage <= 100.0 && grade_percentage >= 0.0){
            if (grade_percentage >= 94.0){
                return "4.0";
            } else if (grade_percentage >= 90.0){
                return "3.7";
            } else if (grade_percentage >= 87.0){
                return "3.3";
            } else if (grade_percentage >= 83.0){
                return "3.0";
            } else if (grade_percentage >= 80.0){
                return "2.7";
            } else if (grade_percentage >= 77.0){
                return "2.3";
            } else if (grade_percentage >= 73.0){
                return "2.0";
            } else if (grade_percentage >= 70.0){
                return "1.7";
            } else if (grade_percentage >= 67.0){
                return "1.3";
            } else if (grade_percentage >= 60.0){
                return "1.0";
            } else {
                return "0.0";
            }
        } else {
            return grade_percentage + ". This is an invalid value.";
        }
    }

    public static void printResults(String grade_point){
        System.out.println("The corresponding grade is " + grade_point + ".");
    }
}
