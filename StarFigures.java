public class StarFigures{
    public static void main(String[] args){
        across();
        star();
        across();
        star();
        across();
        down();
        across();
        star();
    }
    public static void across(){
        System.out.println("*****");
        System.out.println("*****");
    }
    public static void star(){
        System.out.println(" * *");
        System.out.println("  *");
        System.out.println(" * *");
    }
    public static void down(){
        System.out.println("  *");
        System.out.println("  *");
        System.out.println("  *");
    }
}
