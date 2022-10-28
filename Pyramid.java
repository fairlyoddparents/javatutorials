public class Pyramid {
    public static void main (String[] args){
        int j=2;
        for (int i=5; i<=9; i+=2){
            System.out.println(" ".repeat(j) + "*".repeat(i));
            j-=1;
        }
    }
}
