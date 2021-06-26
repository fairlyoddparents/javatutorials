import java.util.*;

public class vertical{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the text? ");
        String s = console.nextLine();
        char[] c = s.toCharArray();

        for (int i=0; i<s.length(); i++){
            System.out.println(c[i]);
        }
    }
}
