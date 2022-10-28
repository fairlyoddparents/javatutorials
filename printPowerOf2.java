import java.util.*;
import static java.lang.Math.*;

public class printPowerOf2{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the maximum power: ");
        int p = console.nextInt();

        for (int i=0; i<=p; i++){
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}
