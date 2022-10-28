public class printDesign{
    public static void main(String[] args){
        for (int i=1; i<=9; i+=2){
            for (int j=i; j<=9; j+=2){
                System.out.print("-");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            for (int j=i; j<=9; j+=2){
                System.out.print("-");
            }
            System.out.println("");
        }
    }
}
