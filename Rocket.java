public class Rocket{
    final static int SIZE=10;
    public static void main(String[] args){
        headOrTail();
        separator();
        body();
        headOrTail();
    }

    public static void headOrTail(){
        for  (int i=1; i<=5; i++){
            System.out.print(" ".repeat(6-i));
            System.out.print("/".repeat(i));
            System.out.print("**");
            System.out.print("\\".repeat(i));
            System.out.println("");
        }
    }

    //I need as many parts of body as indicated by SIZE-1
    public static void body(){
        for (int i=SIZE-2; i>0; i--){
            upperPart();
            lowerPart();
            separator();
        }
    }

    //I need as many separators as indicated by SIZE
    public static void separator(){
        System.out.print("+");
        for (int i=6; i>0; i--){
            System.out.print("=*");
        }
        System.out.println("+");
    }

    public static void upperPart(){
        for (int i=1; i<=3; i++){
            System.out.print("|");
            for (int k=2; k>0; k--){
                printDots(i);
                for (int j=i; j>0; j--){
                    System.out.print("/\\");
                }
                printDots(i);
            }
            System.out.println("|");
        }
    }

    public static void lowerPart(){
        for (int i=3; i>0; i--){
            System.out.print("|");
            for (int k=2; k>0; k--){
                printDots(i);
                for (int j=i; j>0; j--){
                    System.out.print("\\/");
                }
                printDots(i);
            }
            System.out.println("|");
        }
    }

    public static void printDots(int i){
        for (int j=3-i; j>0; j--){
            System.out.print(".");
        }
    }
}
