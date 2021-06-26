import java.util.*;

public class scientific{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the number? ");
        double n = console.nextDouble();
        System.out.print("What's the exponent? ");
        int e = console.nextInt();
        int power = 10;

        for (int i=1; i<e; i++){
            power*=10;
        }
        for (int i=0; i>=e; i++){
            power/=10;
        }

        System.out.println("The result is " + n*power);
    }
}
