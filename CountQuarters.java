import java.util.*;

public class CountQuarters{

    public static void main(String[] args){
        int cents = 1278
        calculateQuarters(cents);
    }

    public static void calculateQuarters(int cents){
        int dollars = cents / 100;
        cents = cents % 100;
        int quarters = cents / 25;
        System.out.println("dollars: " + dollars);
        System.out.println("quarters: " + quarters);
        System.out.println("cents: " + cents);
    }
}
