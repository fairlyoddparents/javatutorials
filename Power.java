//this program returns a raised base given a number and a exponent

public class Power{
    public static void main(String[] args){
        int n = 3;
        int exponent = 4;
        int raised_base = power(n, exponent);
        System.out.printf("%d to the power of %d is %d.", n, exponent, raised_base);
    }

    public static int power(int n, int exponent){
        int raised_base = 1;
        for (int i=1; i<=exponent; i++){
            raised_base *= n;
        }
        return raised_base;
    }
}
