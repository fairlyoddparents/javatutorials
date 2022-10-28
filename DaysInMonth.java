//this program tells you how many days a given month has

public class DaysInMonth{
    public static void main(String[] args){
        int month = 12;
        int numOfDays = calculateDays(month);
        System.out.printf("Month %d has %d days.", month, numOfDays);
    }

    public static int calculateDays(int month){
        if (month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        } else if (month == 2) {
            return 28;
        } else {
            return 31;
        }
    }
}
