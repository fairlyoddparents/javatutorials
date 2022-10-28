public class MenInStair{
    final static int MEN=2;
    static int spaces=(MEN-1)*5;

    public static void main(String[] args){
        drawStair();

        //Base of the staircase
        for (int i=(MEN*6)+7-MEN; i>=1; i--){
            System.out.print("*");
        }
    }

    //draw stair with men
    public static void drawStair(){
        for (int i=1; i<=MEN; i++){
            printSpaces();
            drawMenHead();
            drawStep(i-1);
            printSpaces();
            System.out.print(" /|\\ *");
            drawStep(i);
            printSpaces();
            System.out.print(" / \\ *");
            drawStep(i);
            spaces-=5;
        }
    }

    //Print the man's head and the base of each step
    public static void drawMenHead(){
        System.out.print("  o  ");
        for (int j=6; j>0; j--){
            System.out.print("*");
        }
    }

    //Metod to print the stair steps' height
    public static void drawStep(int i){
        for (int j=i*5; j>0; j--){
            System.out.print(" ");
        }
        System.out.println("*");

    }

    //Metod to print the spaces on the left side
    public static void printSpaces(){
        for (int j=spaces; j>0; j--){
            System.out.print(" ");
        }
    }
}
