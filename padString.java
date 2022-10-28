import java.util.*;


public class padString{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the text? ");
        String s = console.nextLine();
        System.out.print("What's the desired lenght? ");
        int n = console.nextInt();
        System.out.print("Write the character you want to use to pad the text: ");
        String c = console.next();

        System.out.print(s);
        for (int i=s.length(); i<n; i++){
            System.out.print(c);
        }
    }
}
