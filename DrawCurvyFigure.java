import java.awt.*;

//draws a square with lines going from the horizontal borders
//to the vertical borders every 10 pixels 
public class DrawCurvyFigure{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(250, 250);
        Graphics g = panel.getGraphics();

        g.drawRect(10, 30, 200, 200);
        drawTopLines(g);
        drawBottomLines(g);
    }

    public static void drawTopLines(Graphics g){
        for (int i=0; i<20; i++){
            g.drawLine(20+i*10, 30, 10, 230-i*10);
        }
    }

    public static void drawBottomLines(Graphics g){
        for(int i=0; i<20; i++){
            g.drawLine(200-i*10, 230, 210, 30+i*10);
        }
    }
}
