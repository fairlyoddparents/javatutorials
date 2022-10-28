import java.util.*;

//this program calculates the grade of a given student
//the expected input is a single line containing all the info:
//e.g. Maria 5 72 91 84 89 78
//where the first element is the name, the second is the number of scores
//followed by that many integer scores
public class GPA{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String[] info = getStudentsInfo(console);
        double grade = calculateGrade(info);
        printResults(info, grade);
    }

    public static String[] getStudentsInfo(Scanner console){
        System.out.print("Enter a student record: ");
        String info = console.nextLine();
        return info.trim().split(" ");
    }

    public static double calculateGrade(String[] info){
        double sum = 0.0;
        for (int i=2; i<info.length; i++){
            sum += Integer.valueOf(info[i]);
        }
        double grade = sum/(info.length-2);
        return grade;
    }

    public static void printResults(String[] info, double grade){
        System.out.printf("%s's grade is %.2f", info[0], grade);
    }
}
