import java.awt.*;

public class FourFaces{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();

        //draw 5 faces adjacent to each other
        for (int i=0; i<5; i++){
            drawFace(g, 10+(100*i), 30);
        }
    }

    //draw a face
    public static void drawFace(Graphics g, int x, int y){
        g.setColor(Color.BLACK);
        g.drawOval(x, y, 100, 100); //face outline

        g.setColor(Color.BLUE);
        g.fillOval(x+20, y+30, 20, 20); //eyes
        g.fillOval(x+60, y+30, 20, 20);

        g.setColor(Color.RED);
        g.drawLine(x+30, y+70, x+70, y+70); //mouth
    }
}
