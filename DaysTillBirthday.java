import java.util.*;

public class DaysTillBirthday{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        int[] today = today(console);
        int[] birthday_1 = getBirthday(console, "first");
        int[] birthday_2 = getBirthday(console, "second");

        int days_until_B1 = daysUntilBirthday(today, birthday_1);
        int days_until_B2 = daysUntilBirthday(today, birthday_2);

        String sooner_birthday = calculateSooner(birthday_1, days_until_B1, birthday_2, days_until_B2);

        printResults(birthday_1, days_until_B1, birthday_2, days_until_B2, sooner_birthday);
    }

    public static void introduction(){
        System.out.println("This program prompts the user for two birthday dates, ");
        System.out.print("and calculates the number of days remaining for each one. ");
        System.out.println("Then it tells the user which birthday is closer.");
    }

    public static int[] today(Scanner console){
        int[] today = new int[2];
        System.out.println("Todays is? ");
        System.out.print("Month: ");
        today[0] = console.nextInt();
        System.out.print("Day: ");
        today[1] = console.nextInt();
        System.out.println("");
        return today;
    }

    public static int[] getBirthday(Scanner console, String number){
        int[] birthday = new int[2];
        System.out.printf("What's the %s birthday?%n", number);
        System.out.print("Month: ");
        birthday[0] = console.nextInt();
        System.out.print("Day: ");
        birthday[1] = console.nextInt();
        System.out.println("");
        return birthday;
    }

    public static int daysUntilBirthday(int[] today, int[] birthday){
        int today_365 = convertTo365(today);
        int birthday_365 = convertTo365(birthday);

        if (birthday_365 > today_365){
            return birthday_365 - today_365;
        } else {
            return 365 - today_365 + birthday_365;
        }

    }

    public static int convertTo365(int[] date){
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int absolute_date = 0;
        for (int i = 0; i < date[0]-1; i++){
            absolute_date += months[i];
        }
        absolute_date += date[1];
        return absolute_date;
    }

    public static String calculateSooner(int[] birthday_1, int days_until_B1, int[] birthday_2, int days_until_B2){
        if (days_until_B1 < days_until_B2){
            return Integer.toString(birthday_1[0]) + "-" + Integer.toString(birthday_1[1]);
        } else {
            return Integer.toString(birthday_2[0]) + "-" + Integer.toString(birthday_2[1]);
        }
    }

    public static void printResults(int[] birthday_1, int days_until_B1, int[] birthday_2, int days_until_B2, String sooner_birthday){
        System.out.printf("There are %d days remaining until %d-%d%n", days_until_B1, birthday_1[0], birthday_1[1]);
        System.out.printf("There are %d days remaining until %d-%d%n", days_until_B2, birthday_2[0], birthday_2[1]);
        System.out.printf("The date %s is closer.", sooner_birthday);
    }
}
