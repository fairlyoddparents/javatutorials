public class FortyCharacters_2{
    public static void main(String[] args){
        for (int i=1; i<=60; i++){
            System.out.print("-");
        }
        System.out.println("");
        for (int i=1; i<=15; i++){
            System.out.print("_-^-");
        }
        System.out.println("");
        for (int i=1; i<=6; i++){
            for (int j=1; j<=9; j++){
                System.out.print(j);
            }
            for (int j=0; j<1; j++){
                System.out.print(0);
            }
        }
        System.out.println("");
        for (int i=1; i<=60; i++){
            System.out.print("-");
        }
    }
}
