//this program returns the sum of the sum of the first n terms of the sequence
//Σi=(1*n)+1i

public class FractionSum{
    public static void main(String[] args){
        int n = 19;
        double sum = sum(n);
        System.out.printf("The result is %f", sum);
    }

    public static double sum(int n){
        double sum = n;
        for (int i = 1; i<=n; i++){
            sum += Double.parseDouble("1" + Integer.toString(i));
        }
        return sum;
    }
}
