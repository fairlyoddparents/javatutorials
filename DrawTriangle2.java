import java.awt.*;

public class DrawTriangle2{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(600, 200);
        panel.setBackground(Color.YELLOW);
        Graphics g = panel.getGraphics();

        drawFigure(g);
    }

    public static void drawFigure(Graphics g){
        g.setColor(Color.BLUE);

        //draw vertical lines
        g.drawLine(0, 0, 300, 200);
        g.drawLine(600,0, 300, 200);

        //draw 21 horizontal lines
        for (int i=0; i<20; i++){
            g.drawLine(0+15*i, 0+10*i, 600-15*i, 0+10*i);
        }

    }
}
