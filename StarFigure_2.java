public class StarFigure_2{
    public static void main(String[] args){
        final int HEIGHT=3;
        int STARS=0;

        for (int j=HEIGHT; j>0; j--){
            int SLASHES=(j-1)*4;

            for (int i=SLASHES; i>0; i--){
                System.out.print("/");
            }
            for (int i=STARS; i>0; i--){
                System.out.print("*");
            }
            for (int i=SLASHES; i>0; i--){
                System.out.print("\\");
            }
            System.out.println("");
            STARS+=8;
        }
    }
}
