import java.util.*;

public class Compare2Students{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();

        double[] s1_scores = getScores(console, 1);
        double[] s2_scores = getScores(console, 2);

        double s1_average = calculateAverage(s1_scores);
        double s2_average = calculateAverage(s2_scores);

        int more_qualified_student = determineMoreQualified(s1_average, s2_average);
        printResults(more_qualified_student);
    }

    public static void introduction(){
        System.out.print("This program compares two college applicants ");
        System.out.print("based on their GPA, SAT, and ACT exam scores ");
        System.out.println("and reports which candidate is more qualified.");
        System.out.println("");
    }

    public static double[] getScores(Scanner console, int n){
        double[] scores = new double[3];
        scores[0] = getACTScore(console, n);
        scores[1] = getGPA(console, n);
        scores[2] = getSATScores(console, n);
        System.out.println("");
        return scores;
    }

    public static double getACTScore(Scanner console, int n){
        System.out.printf("What's the student %d's ACT score? ", n);
        double act = console.nextInt()*1.0;
        return act;
    }

    public static double getGPA(Scanner console, int n){
        System.out.printf("What's the student %d's GPA? ", n);
        double gpa = console.nextDouble()*1.0;
        return gpa;
    }

    public static double getSATScores(Scanner console, int n){
        System.out.printf("What's the student %d's SAT score? ", n);
        double sat = console.nextInt()*1.0;
        return sat;
    }

    //this program calculates the average of the three scores by
    //converting each first to a percentage using the maximum and minimum scores
    //of each test
    public static double calculateAverage(double[] scores){
        //ACT scores range from 1 to 36
        double act_percentage = scores[0]/0.36;

        //GPA ranges from 0 to 4
        double gpa_percentage = scores[1]/.04;

        //SAT ranges from 400 to 1600
        double sat_percentage = (scores[2]-400)/12.00;

        //let's create an average of the three percentages
        double average = (act_percentage+gpa_percentage+sat_percentage)/3.0;

        return average;
    }

    public static int determineMoreQualified(double s1_average, double s2_average){
        if (s1_average > s2_average){
            return 1;
        } else if (s1_average < s2_average){
            return 2;
        } else {
            return 0; //this means that both are equally qualified
        }
    }

    public static void printResults(int more_qualified_student){
        if (more_qualified_student > 0){
            System.out.printf("The more qualified student is student %d.%n", more_qualified_student);
        } else {
            System.out.println("Both students are equally qualified.");
        }
    }
}
