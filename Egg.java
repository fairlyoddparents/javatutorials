public class Egg{
    public static void main(String[] args){
        top();
        bottom();
        center();
        top();
        bottom();
        center();
        bottom();
        top();
        center();
        bottom();
    }
    public static void top(){
        System.out.println("  _______");
        System.out.println(" /       \\");
        System.out.println("/         \\");
    }
    public static void center(){
        System.out.println("-\"-'-\"-'-\"-");
    }
    public static void bottom(){
        System.out.println("\\         /");
        System.out.println(" \\_______/");
    }
}
