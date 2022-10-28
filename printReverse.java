import java.util.*;

public class printReverse{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the text? ");
        String s = console.nextLine();
        char[] c = s.toCharArray();

        for (int i=s.length()-1; i>=0; i--){
            System.out.print(c[i]);
        }
    }
}
