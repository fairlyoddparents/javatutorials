public class DrawTriangle {
    public static void main (String[] args){
        int i=0;
        for (int j=9; j>=1; j-=2){
            System.out.print(" ".repeat(i) + "*".repeat(j));
            System.out.println("");
            i+=1;
        }
    }
}
