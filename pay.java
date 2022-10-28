import java.util.*;

public class pay{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the salary? ");
        double s = console.nextDouble();
        System.out.print("What's the number of hours? ");
        int h = console.nextInt();
        double pay=s*h;

        //add the pay for overtime
        for (int i=9; i<=h; i++){
            pay+=(s/2);
        }
        
        System.out.print("The TA's salary is " + pay);
    }
}
