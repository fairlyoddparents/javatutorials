public class DollarFigure_2{
    public static void main(String[] args){
        final int HEIGHT=7;
        int edges=0;

        for (int i=HEIGHT; i>0; i--){
            for (int j=edges; j>0; j--){
                System.out.print("*");
            }
            for (int j=i; j>0; j--){
                System.out.print("$");
            }
            for (int j=i*2; j>0; j--){
                System.out.print("*");
            }
            for (int j=i; j>0; j--){
                System.out.print("$");
            }
            for (int j=edges; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
            edges+=2;
        }
    }
}
