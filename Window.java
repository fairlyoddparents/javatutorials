public class Window{
    public static void main(String[] args){
        final int HEIGHT=3;
        final int WIDTH=3;

        for (int k=HEIGHT; k>0; k--){
            for (int i=WIDTH; i>0; i--){
                System.out.print("+===");
            }
            System.out.print("+");
            System.out.println("");
            for (int j=3; j>0; j--){
                for (int i=WIDTH+1; i>0; i--){
                System.out.print("|   ");
                }
                System.out.println("");
            }
        }
        for (int i=WIDTH; i>0; i--){
            System.out.print("+===");
        }
        System.out.print("+");
    }
}
