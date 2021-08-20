//this program determines the season for a given date
//the program assumes that the user will input a valid date

import java.util.*;

public class Season{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int month = getMonth(console);
        int day = getDay(console);
        String season = determineSeason(month, day);
        System.out.printf("the %d of %d is in %s.", day, month, season);
    }

    public static int getMonth(Scanner console){
        System.out.print("Write a month: ");
        int month = console.nextInt();
        return month;
    }

    public static int getDay(Scanner console){
        System.out.print("Write a day: ");
        int day = console.nextInt();
        return day;
    }

    public static String determineSeason(int month, int day){
        if ((month == 12 && day >= 16) || (month == 3 && day <= 15) || (month < 3)){
            return "winter";
        } else if ((month == 3 && day >= 16) || (month < 6) || (month == 6 && day <=15)){
            return "spring";
        } else if ((month == 6 && day >= 16) || (month < 9) || (month == 9 && day <= 15)){
            return "summer";
        } else {
            return "fall";
        }
    }
}
