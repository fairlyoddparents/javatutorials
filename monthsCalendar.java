import java.util.*;
import java.lang.Math.*;

public class monthsCalendar{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many days are in the month? ");
        int days = console.nextInt();
        System.out.print("When is the first Sunday? ");
        int sunday = console.nextInt();


        printDays();
        printBorders();
        printCaledar(days, sunday);
        printBorders();
    }

    //prints the borders
    public static void printBorders(){
        System.out.print("+");
        for (int i=0; i<7; i++){
            for (int j=0; j<6; j++){
                System.out.print("-");
            }
            System.out.print("+");
        }
        System.out.println("");
    }

    //prints the headings
    public static void printDays(){
        String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        for (int i=0; i<7; i++){
            System.out.print("  " + days[i] + "  ");
        }
        System.out.println("");
    }

    //Creates an array with all the days in the calendar including the empty gaps
    public static String[] daysInCalendar(int days, int sunday){
        int emptyBoxes = 8-sunday; //calculate the empty gaps on the left
        double rows = Math.ceil((days+emptyBoxes)/7.0); //calculate the number of rows in the calendar
        int emptyBoxesRight = ((int)rows)*7-days-emptyBoxes; //calculate the # of empty gaps to the right
        String[] listOfDays = new String[emptyBoxes+days+emptyBoxesRight]; //creates the empty array

        for (int i=0; i<emptyBoxes; i++){ //adds the empty gaps to the left
            listOfDays[i] = "";
        }
        for (int i=1; i<=days; i++){ // adds the days of the month
            listOfDays[emptyBoxes] = Integer.toString(i);
            emptyBoxes+=1;
        }

        for (int i=1; i<=emptyBoxesRight; i++){ // adds the empty gaps to the right
            listOfDays[emptyBoxes] = "";
            emptyBoxes+=1;
        }
        return listOfDays;
    }

    //uses the list in daysInCalendar() to print the calendar
    //uses the method padded() to pad the days before printing them
    public static void printCaledar(int days, int sunday){
        int n = 0; //this number will be used as the index when retrievin the numbers from the array
        String[] listOfDays = daysInCalendar(days, sunday);
        double rows = Math.ceil((days+8-sunday)/7.0);
        for (int i=0; i<rows; i++){
            System.out.print("|");
            for (int j=0; j<7; j++){
                System.out.print(padded(listOfDays[n], 4) + "  " + "|");
                n+=1;
            }
            System.out.println("");
        }
    }

    // Returns a string of the number n, left-padded
    // with spaces until it is at least the given width.
    public static String padded(String n, int width) {
        String s = "" + n;
        for (int i = s.length(); i < width; i++) {
            s = " " + s;
        }
        return s;
    }

}
