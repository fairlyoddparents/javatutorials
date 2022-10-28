public class myOwnMaxMethod{
    public static void main (String[] args){
        System.out.println(max());
    }

    public static int max(int x, int y) {
        if (x > y){
            return x;
        } else {
            return y;
        }
    }
}
