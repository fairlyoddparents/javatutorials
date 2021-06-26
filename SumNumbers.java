import java.util.*;

public class SumNumbers{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Low number: ");
        int n1 = console.nextInt();
        System.out.print("High number: ");
        int n2 = console.nextInt();
        /*int sum = 0;
        for (int i=n1; i<=n2; i++){
            sum +=i;
        }
        System.out.println("sum = " + sum);*/
        System.out.println("sum = " + (n1+n2)*(n2/2.0));
    }
}
