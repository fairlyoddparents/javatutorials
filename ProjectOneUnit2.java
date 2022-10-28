public class ProjectOneUnit2{
    public static void main (String[] args){
        int spaces = 1;
        int backslash = 0;

        for (int i=6; i>=0; i--){
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            for (int j=spaces; j>0; j--){
                System.out.print(" ");
            }
            for (int j=i*2; j>0; j--){
                System.out.print("/");
            }
            for (int j=backslash; j>0; j--){
                System.out.print("\\");
            }
            for (int j=spaces; j>0; j--){
                System.out.print(" ");
            }
            for (int j=i; j>0; j--){
                System.out.print("*");
            }
            System.out.println("");
            spaces+=1;
            backslash+=2;
        }
    }
}
