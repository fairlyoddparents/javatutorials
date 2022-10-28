public class HourglassFigure2{
    public static void main(String[] args){
        separator();
        upperPart();
        System.out.println("     ||     ");
        lowerPart();
        separator();
    }

    public static void separator(){
        System.out.print("|");
        for (int i=10; i>0; i--){
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void upperPart(){
        int spaces=1;

        for (int i=4; i>0; i--){
            System.out.print(" ".repeat(spaces));
            System.out.print("\\");
            System.out.print(":".repeat(i*2));
            System.out.print("/");
            System.out.println(" ".repeat(spaces));
            spaces+=1;
        }
    }

    public static void lowerPart(){
        int dots=2;

        for (int i=4; i>0; i--){
            System.out.print(" ".repeat(i));
            System.out.print("/");
            System.out.print(":".repeat(dots));
            System.out.print("\\");
            System.out.println(" ".repeat(i));
            dots+=2; 
        }
    }
}
