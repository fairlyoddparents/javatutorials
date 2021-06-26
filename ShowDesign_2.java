import java.awt.*;

public class ShowDesign_2{
    public static void main(String[] args){
        final int width = 800;
        final int height = 500;
        DrawingPanel panel = new DrawingPanel(width, height);
        Graphics g = panel.getGraphics();

        drawConcentricRects(g, width, height);
    }

    public static void drawConcentricRects(Graphics g, int width, int height){
        int x = width/10;
        int y = height/10;
        int xside = 8*x;
        int yside = 8*y;
        for (int i=0; i<4; i++){
            g.drawRect(x+i*x, y+i*y, xside-i*2*x, yside-i*2*y);
        }
    }
}
