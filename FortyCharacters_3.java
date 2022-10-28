public class FortyCharacters_3{
    public static void main(String[] args){
        final int WIDTH = 60;
        final int MAX_NUMBER = 4;

        for (int i=1; i<=WIDTH; i++){
            System.out.print("-");
        }
        System.out.println("");
        for (int i=1; i<=(WIDTH/4); i++){
            System.out.print("_-^-");
        }
        System.out.println("");
        for (int i=1; i<=(WIDTH/(MAX_NUMBER+1)); i++){
            for (int j=1; j<=MAX_NUMBER; j++){
                System.out.print(j);
            }
            for (int j=1; j<=1; j++){
                System.out.print(0);
            }
        }
        System.out.println("");
        for (int i=1; i<=WIDTH; i++){
            System.out.print("-");
        }
    }
}
