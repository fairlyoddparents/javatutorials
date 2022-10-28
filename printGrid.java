import java.util.*;

public class printGrid{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many rows? ");
        int row = console.nextInt();
        System.out.print("How many columns? ");
        int column = console.nextInt();

        //print a grid of integers from 1 to (rows*columns)
        for (int i=1; i<=4; i++){
            for (int j=i; j<=(row*column); j+=row){
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
