public class EggStop{
    public static void main(String[] args){
        top();
        bottom();
        bottom();
        stars();
        top();
        System.out.println("|   STOP   |");
        bottom();
        top();
        stars();
    }
    public static void top(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
    public static void stars(){
        System.out.println(" +-------+");
    }
}
