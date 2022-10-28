import java.util.*;

public class christmasTrees{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("How many segments will your tree have? ");
        int segment = console.nextInt();
        System.out.print("What's the height of the segments? ");
        int height = console.nextInt();

        drawTree(segment, height);
    }

    public static void drawTree(int segment, int height){
        int n = 2;
        for(int k=1; k<=segment*2; k+=2){
            int asterisks=k;
            for(int i=height; i>0; i--){
                for(int j=i+segment-n; j>0; j--){
                    System.out.print(" ");
                }
                for(int j=asterisks; j>0; j--){
                    System.out.print("*");
                }
                System.out.println("");
                asterisks+=2;
            }
            n+=1;
        }
        drawTrunk(segment, height);
    }

    public static void drawTrunk(int segment, int height){
        int asterisks = ((segment*2-1)+((height-1)*2));
        for(int i=2; i>0; i--){
            for (int j=asterisks/2; j>0; j--){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=(asterisks-7)/2; i>0; i--){
            System.out.print(" ");
        }
        for(int i=0; i<7; i++){
            System.out.print("*");
        }
    }
}
