public class HourGlassFigure {
    public static void main (String[] args) {
        DrawLine();
        DrawCone();
        DrawInvertedCone();
        DrawLine();
    }

    public static void DrawLine(){
        System.out.println("+------+");
    }

    public static void DrawCone(){
        int j=0;
        for (int i=4; i>=0; i-=2) {
            System.out.println("|" + " ".repeat(j) + "\\"+ ".".repeat(i) + "/" + " ".repeat(j) + "|");
            j+=1;
        }
    }

    public static void DrawInvertedCone(){
        int j=0;
        for (int i=2; i>=0; i-=1){
            System.out.println("|" + " ".repeat(i) + "/"+ ".".repeat(j) + "\\" + " ".repeat(i) + "|");
            j+=2;
        }
    }
}
