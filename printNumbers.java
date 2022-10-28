import java.util.*;

public class printNumbers{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("What's your number? ");
        int n = console.nextInt();

        for (int i=1; i<=n; i++){
            System.out.print("[" + i + "] ");
        }
    }
}
