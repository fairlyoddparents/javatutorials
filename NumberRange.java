//this program accepts two integers and retunrs the sequence of numbers that
//are between them

public class NumberRange{
    public static void main(String[] args){
        int n1 = 2;
        int n2 = 7;
        String sequence = range(n1, n2);
        System.out.printf("The numbers between %d and %d are %s.", n1, n2, sequence);
    }

    public static String range(int n1, int n2){
        String sequence = "";
        if (n1 < n2){
            for (int i=n1; i<=n2; i++){
                sequence += " " + i;
            }
        } else {
            for (int i=n1; i>=n2; i--){
                sequence += " " + i;
            }
        }
        return sequence;
    }
}
