public class Project8Unit2{
    static final int SIZE=8;

    public static void main(String[] args){
        boxTop();
        box();

    }

    public static void separator(){
        System.out.print("+");
        for (int i=SIZE*3; i>0; i--){
            System.out.print("-");
        }
        System.out.print("+");
    }

    public static void boxTop(){
        int spaces=SIZE-1;
        for (int j=SIZE; j>0; j--){
            System.out.print(" ");
        }
        separator();
        System.out.println("");
        for (int i=1; i<=SIZE; i++){
            for (int j=spaces; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("/");
            for (int j=(spaces*3)+2; j>0; j--){
                System.out.print(" ");
            }
            for (int j=i; j>0; j--){
                System.out.print("__/");
            }
            for (int j=i-1; j>0; j--){
                System.out.print("/");
            }
            System.out.println("");
            spaces-=1;
        }
    }

    public static void box(){
        int spaces=SIZE;
        separator();
        for (int i=SIZE; i>0; i--){
            System.out.print("/");
        }
        System.out.println("");
        for (int i=SIZE/2; i>0; i--){
            System.out.print("|");
            for (int j=(SIZE*3-22)/2; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("Building Java Programs");
            for (int j=(SIZE*3-22)/2; j>0; j--){
                System.out.print(" ");
            }
            System.out.print("|");
            for (int j=spaces; j>0; j--){
                System.out.print("/");
            }
            System.out.println("");
            spaces-=2;
        }
        separator();
    }
}
