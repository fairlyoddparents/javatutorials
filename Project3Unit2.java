public class Project3Unit2{
    public static void main(String[] args){
        separator();
        upperPart();
        lowerPart();
        separator();
        lowerPart();
        upperPart();
        separator();
    }

    public static void separator(){
        System.out.print("+");
        for (int i=9; i>0; i--){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void upperPart(){
        int slashes = 0;

        for (int i=4; i>0; i--){
            System.out.print("|");
            System.out.print(" ".repeat(i));
            for (int j=slashes; j>0; j--){
                System.out.print("/");
            }
            System.out.print("*");
            for (int j=slashes; j>0; j--){
                System.out.print("\\");
            }
            System.out.print(" ".repeat(i));
            System.out.println("|");
            slashes+=1;
        }
    }

    public static void lowerPart(){
        int spaces = 1;

        for (int i=3; i>=0; i--){
            System.out.print("|");
            System.out.print(" ".repeat(spaces));
            for (int j=i; j>0; j--){
                System.out.print("\\");
            }
            System.out.print("*");
            for (int j=i; j>0; j--){
                System.out.print("/");
            }
            System.out.print(" ".repeat(spaces));
            System.out.println("|");
            spaces+=1;
        }
    }
}
