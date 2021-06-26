import java.awt.*;

public class ShowDesign{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 200);
        Graphics g = panel.getGraphics();

        drawConcentricRects(g, 160);
    }

    public static void drawConcentricRects(Graphics g, int side){
        for (int i=0; i<4; i++){
            g.drawRect(20+i*20, 20+i*20, side-40*i, side-40*i);
        }

    }
}
