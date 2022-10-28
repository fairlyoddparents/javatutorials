public class FortyCharacters{
    public static void main(String[] args){
        for (int i=1; i<=40; i++){
            System.out.print("-");
        }
        System.out.println("");
        for (int i=1; i<=10; i++){
            System.out.print("_-^-");
        }
        System.out.println("");
        for (int i=1; i<=2; i++){
            for (int j=1; j<=9; j++){
                System.out.print(j + "" + j);
            }
            for (int j=0; j<=1; j++){
                System.out.print(0);
            }
        }
        System.out.println("");
        for (int i=1; i<=40; i++){
            System.out.print("-");
        }
    }
}
