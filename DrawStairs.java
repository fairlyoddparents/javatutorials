import java.awt.*;

public class DrawStairs{
    public static void main(String[] args){
        int n = 10;
        int width = 10;
        int height = 10;

        DrawingPanel panel = new DrawingPanel(10+width*n, 10+height*n);
        Graphics g = panel.getGraphics();

        //drawStairCase(g, 5, 5, n, width, height);
        drawReverseStairCase(g, 5, 5, n, width, height, 10); 
    }

    public static void drawStairCase(Graphics g, int x, int y, int n, int width, int height){
        for (int i=0; i<n; i++){
            g.drawRect(x, y+height*i, width+width*i, height);
        }
    }

    public static void drawReverseStairCase(Graphics g, int x, int y, int n, int width, int height, int xOffset){
        for (int i=0; i<n; i++){
            g.drawRect(x+xOffset*i, y+height*i, width*n-i*width, height);
        }
    }
}
