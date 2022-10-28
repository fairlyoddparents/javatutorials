import java.util.*;

public class inputBirthday{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("On what day of the month were you born? ");
        int dd = console.nextInt();
        System.out.print("What's the name of the month in which you were born? ");
        String mon = console.next();
        System.out.print("During what year were you born?" );
        int yy = console.nextInt();

        System.out.print("You were born on " + mon + " " + dd + ", " + yy + ". You're mighty old!");
    }
}
