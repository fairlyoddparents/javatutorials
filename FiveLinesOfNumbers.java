public class FiveLinesOfNumbers{
    public static void main(String[] args){
        final int LINES=4;
        for (int k=0; k<LINES; k++){
            for (int i=9; i>=0; i--){
                for (int j=i; j>0; j--){
                    System.out.print(i);
                }
            }
            System.out.println("");
        }
    }
}
