public class Lanterns{
    public static void main(String[] args){
        first();
        first();
        second();
        first();
        first();
        last();
    }
    public static void first() {
        System.out.println("    *****");
        System.out.println("  *********");
        System.out.println("*************");
    }
    public static void second(){
        System.out.println("* | | | | | *");
        System.out.println("*************");
    }
    public static void last(){
        System.out.println("    *****");
        System.out.println("* | | | | | *");
        System.out.println("* | | | | | *");
        System.out.println("    *****");
    }
}
