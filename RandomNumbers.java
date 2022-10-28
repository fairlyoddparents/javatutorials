import java.util.*;

public class RandomNumbers{
    public static void main (String[] args){
        introduction();
        generateRandomNum();
    }

    public static void introduction(){
        System.out.println("This program generates random numbers between 0 ");
        System.out.println("and 1000 until a number above 900 is generated.");
    }

    public static void generateRandomNum(){
        int num = 0;
        Random rand = new Random();

        do {
            num = rand.nextInt(1001);
            System.out.printf("Random number: %d.%n", num);
        } while (num < 900);
    }
}
