import java.util.*;

public class DayOfTheWeek{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();
        int[] date = getDate(console);
        determineDay(date);
    }

    public static void introduction(){
        System.out.println("This program tells you on what day a certain date falls.");
        System.out.println("Choose a date.");
    }

    //gets the date in a format year, month, day - the month written in number
    public static int[] getDate(Scanner console){
        int[] date = new int[3];
        System.out.print("What's the year you have in mind? ");
        date[0] = console.nextInt();
        System.out.print("What's the month? ");
        date[1] = console.nextInt();
        System.out.print("What's the day? ");
        date[2] = console.nextInt();
        return date;
    }

    public static void determineDay(int[] date){
        String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int referent = (date[0]/400)*400; //the calendar repeats every 400 years
        referent += 1; // it starts on a Monday e.g. 1601
        int previous_days = determinePreviousDays(date[0], referent);
        previous_days += daysInTargetYear(date);
        int day = previous_days%7;
        System.out.printf("%d-%d-%d is a %s", date[0], date[1], date[2], week[day]);

    }

    public static int determinePreviousDays(int year, int referent){
        int num_years = year - referent;
        int days_in_previous_years = 0;

        for (int i=1; i<=num_years/100; i++){
            days_in_previous_years += (366*24 + 265*76);
        }

        days_in_previous_years += ((num_years%100)/4)*366;
        days_in_previous_years += ((num_years%100 - (num_years%100)/4)*365);

        return days_in_previous_years;
    }

    public static int daysInTargetYear(int[] date){
        int year = date[0];
        int month = date[1];
        int day = date[2];
        int[] days_in_months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        days_in_months[1] += addDayIfLeapYear(year); // if yes, +1 day to February

        //add the days months of all previous months
        //if date is May 27th, add January, February, March, April
        int days_in_target_year = 0;
        for (int i=0; i<month-1; i++){
            days_in_target_year += days_in_months[i];
        }

        //add the number of days of that month
        //if date is May 27th, add 27
        days_in_target_year += day;
        return days_in_target_year;
    }

    public static int addDayIfLeapYear(int year){
        if (year % 4 == 0){
            if ((year % 100 !=0) || (year % 400 == 0)){
                return 1;
            } else {
                return 0;
            }
        } else {
            return 0;
        }
    }


}
