import java.util.*;

public class RepeatMyPhrase{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's your phrase? ");
        String p = console.nextLine();
        System.out.print("How many times should I repeat it? ");
        int n = console.nextInt();

        for (int i=0; i<n; i++){
            System.out.println(p);
        }
    }
}
