public class Project2Unit2{
    public static void main(String[] args){
        System.out.println("*------*");

        for (int i=2; i>0; i--){
            int spaces=2;
            int innerSpaces=0;
            for (int j=0; j<3; j++){
                System.out.print("|");
                System.out.print(" ".repeat(spaces));
                System.out.print("^");
                System.out.print(" ".repeat(innerSpaces));
                System.out.print("^");
                System.out.print(" ".repeat(spaces));
                System.out.print("|");
                System.out.println("");
                spaces-=1;
                innerSpaces+=2;
            }
        }
        System.out.println("*------*");

        for (int i=2; i>0; i--){
            int innerSpaces=4;
            int spaces=0;
            for (int j=0; j<3; j++){
                System.out.print("|");
                System.out.print(" ".repeat(spaces));
                System.out.print("v");
                System.out.print(" ".repeat(innerSpaces));
                System.out.print("v");
                System.out.print(" ".repeat(spaces));
                System.out.print("|");
                System.out.println("");
                spaces+=1;
                innerSpaces-=2;
            }
        }
        System.out.println("*------*");
    }
}
