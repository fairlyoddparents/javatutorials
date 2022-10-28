public class InvertedTriangle {
    public static void main (String[] args) {
        int j=4;
        for (int i=1; i<=9; i+=2) {
            System.out.println(" ".repeat(j) + "*".repeat(i));
            j-=1;
        }
    }
}
