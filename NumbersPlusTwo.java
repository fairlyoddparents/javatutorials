public class NumbersPlusTwo{
    public static void main (String[] args){
        for (int i=21; i>1; i-=10){
            for (int j=1; j<=i; j+=2){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
