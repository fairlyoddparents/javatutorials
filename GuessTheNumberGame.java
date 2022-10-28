import java.util.*;

public class GuessTheNumberGame{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();
        int x = generateNumber();
        playGuessingTheNumber(x, console);
    }

    public static void introduction(){
        System.out.print("In this game, we are going to think of a number ");
        System.out.println("between 0 and 100 and you have to guess it.");
        System.out.printf("Ready to play? %n%n");
    }

    public static int generateNumber(){
        Random rand = new Random();
        return rand.nextInt(101);
    }

    public static void playGuessingTheNumber(int x, Scanner console){
        System.out.println("We have generated a number between 0 and 100.");
        System.out.printf("The number is %d.%n", x);
        System.out.print("What's the number? ");
        int guess = console.nextInt();
        giveClues(guess, x);
        int numberOfGuesses = 1;

        while (guess != x){
            System.out.print("What's the number? ");
            guess = console.nextInt();
            giveClues(guess, x);
            numberOfGuesses += 1;
        }
        System.out.printf("You did it. The number is %d and it only took you %d attempts!", x, numberOfGuesses);

    }

    public static void giveClues(int guess, int x){
        if (guess < x){
            System.out.println("Our number is higher than that.");
        } else {
            System.out.println("Our number is lower than that.");
        }
    }
}
