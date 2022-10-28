import java.util.*;

public class printSquare{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's the smallest number? ");
        int n1 = console.nextInt();
        System.out.print("What's the largest number? ");
        int n2 = console.nextInt();


        int n3=n1;
        for (int i=n1; i<=n2; i++){
            //print the sequence up to seven
            for (int j=n3; j<=n2; j++){
                System.out.print(j);
            }

            //when not all the numbers are printed, restart printing at n1
            int n4=n1;
            for (int j=n1; j<n3; j++){
                System.out.print(n4);
                n4+=1;
            }

            //the next line will start in the next number 
            n3+=1;
            System.out.println("");
        }
    }
}
