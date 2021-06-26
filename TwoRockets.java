public class TwoRockets {
    public static void main(String[] args){
        arrows();
        separator();
        base();
        separator();
        letters();
        separator();
        base();
        separator();
        arrows();
    }
    public static void arrows(){
        System.out.println("   / \\     / \\");
        System.out.println("  /   \\   /   \\");
        System.out.println(" /     \\ /     \\");
    }
    public static void separator(){
        System.out.println("+------+ +------+");
    }
    public static void base(){
        System.out.println("|      | |      |");
        System.out.println("|      | |      |");
    }
    public static void letters(){
        System.out.println("|United| |United|");
        System.out.println("|United| |United|");
    }
}
