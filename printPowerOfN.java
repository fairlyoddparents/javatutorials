import java.util.*;

public class printPowerOfN{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's your number? ");
        int n1 = console.nextInt();
        System.out.print("What's the exponent? ");
        int p = console.nextInt();

        int result=1*1;
        for(int i=0; i<=p; i++){
            System.out.print(result + " ");
            result*=n1;
        }
    }
}
