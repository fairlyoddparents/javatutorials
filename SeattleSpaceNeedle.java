public class SeattleSpaceNeedle{
    final static int SIZE=2;

    public static void main(String[] args){
        needle();
        dotTop();
        separator();
        arrowBottom();
        needle();
        cylinder();
        dotTop();
        separator();

    }
    public static void needle(){
        for (int j=SIZE; j>0; j--){
            for (int i=SIZE*3; i>0; i--){
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }

    public static void separator(){
        System.out.print("|");
        for (int i=SIZE*6; i>0; i--){
            System.out.print("\"");
        }
        System.out.println("|");
    }

    public static void dotTop(){
        int spaces=(SIZE-1)*3;
        for (int i=0; i<SIZE; i++){
            for (int j=spaces; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int j=i*3; j>0; j--){
                System.out.print(":");
            }
            System.out.print("||");
            for (int j=i*3; j>0; j--){
                System.out.print(":");
            }
            System.out.println("\\__");
            spaces-=3;
        }
    }

    public static void arrowBottom(){
        int arrows=SIZE+(SIZE-1)*2;
        for (int i=0; i<SIZE; i++){
            for (int j=i*2; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("\\_/");
            for (int j=arrows; j>0; j--){
                System.out.print("\\/");
            }
            System.out.println("\\_/");
            arrows-=2;
        }
    }

    public static void cylinder(){
        for (int j=SIZE*4; j>0; j--){
            for (int i=(SIZE-1)*3; i>0; i--){
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
}
