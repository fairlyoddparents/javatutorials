public class SlashFigure{
    public static void main(String[] args){
        final int HEIGHT=4;
        final int WIDTH=((HEIGHT-1)*4)+2;
        int EXCLAMATION_SIGN = WIDTH;
        int SLASHES=0;

        for (int i=HEIGHT; i>0; i--){
            for (int j=(SLASHES); j>0; j--){
                System.out.print("\\");
            }
            for (int j=EXCLAMATION_SIGN; j>0; j--){
                System.out.print("!");
            }
            for (int j=(SLASHES); j>0; j--){
                System.out.print("/");
            }
            
            System.out.println("");
            EXCLAMATION_SIGN-=4;
            SLASHES+=2;
        }
    }
}
