import java.util.*;

public class processName{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Please enter your full name: ");
        String name = console.nextLine();
        String[] n = name.split(" ");

        System.out.println("Your name in reverse order is " + n[1] + ", " + n[0]);
    }
}
