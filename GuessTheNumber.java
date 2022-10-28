import java.util.*;

public class GuessTheNumber{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        guessTheNumber(console);
    }

    public static void introduction(){
        System.out.println("This program has you, the user, choose a number");
        System.out.println("between 1 and 100. Then I, the computer, will try");
        System.out.println("my best to guess it.");
    }

    public static void guessTheNumber(Scanner console){
        Random rand = new Random();
        List<Integer> hints = new ArrayList<Integer>(); 
        int[] min = {0};
        int[] max = {100};

        int[] n = {rand.nextInt(max[0] + 1)}; 
        int[] attempts = {1};

        System.out.printf("Is it %d? (y/n) ", n[0]);
        String[] answer = {console.next()};
        
        while (answer[0].startsWith("y") != true){
            attempts[0] += 1;

            System.out.printf("is the number you thought higher or lower than %d? ", n[0]);
            answer[0] = console.next();

            if (answer[0].startsWith("hig") == true){
                min[0] = n[0];
            } else if (answer[0].startsWith("low") == true){
                max[0] = n[0];
            }

            n[0] = rand.nextInt(max[0]-min[0]) + min[0];
            System.out.printf("Is it %d? (y/n) ", n[0]);
            answer[0] = console.next();

            System.out.printf("Answer is: %s.%n", answer[0]); 
            
        }
        System.out.printf("Your number is %d and it took me %d attempts.", n[0], attempts[0]);
    }
}
