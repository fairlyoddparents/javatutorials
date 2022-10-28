public class MyFibonacciNumbers{
    public static void main(String[] args){
        int j=0;
        int k=1;
        int x=0;
        for(int i=1; i<=12; i++){
            x=k;
            System.out.print(k + " ");
            k+=j;
            j=x;
        }
    }
}
