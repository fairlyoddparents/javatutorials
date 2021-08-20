import java.util.*;

public class XoFigure{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int size = getSize(console);
        drawTop(size);
        drawCenter(size); //only used when size is odd
        drawBottom(size);
    }

    public static int getSize(Scanner console){
        System.out.print("Write a number to determine the size of the figure: ");
        int size = console.nextInt();
        return size;
    }

    public static void drawTop(int size){
        for (int line=1; line<=size/2; line++){
            for (int i=1; i<=(line-1); i++){
                System.out.print("o");
            }
            System.out.print("X");
            for (int i=1; i<=(size-2*line); i++){
                System.out.print("o");
            }
            System.out.print("X");
            for (int i=1; i<=(line-1); i++){
                System.out.print("o");
            }
            System.out.println();
        }
    }

    //draw the center line of odd number size figures
    public static void drawCenter(int size){
        for (int line=1; line<=size%2; line++){
            for (int i=1; i<=size/2; i++){
                System.out.print("o");
            }
            System.out.print("X");
            for (int i=1; i<=size/2; i++){
                System.out.print("o");
            }
            System.out.println();
        }
    }

    public static void drawBottom(int size){
        for (int line=1; line<=size/2; line++){
            for (int i=1; i<=(size/2-line); i++){
                System.out.print("o");
            }
            System.out.print("X");
            for (int i=1; i<=(size%2)+((line-1)*2); i++){
                System.out.print("o");
            }
            System.out.print("X");
            for (int i=1; i<=(size/2-line); i++){
                System.out.print("o");
            }
            System.out.println();
        }
    }
}
