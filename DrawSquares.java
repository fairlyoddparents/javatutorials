import java.awt.*;

public class DrawSquares{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(400, 300);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        drawSquare(g, 50, 50, 20);
        drawSquare(g, 250, 10, 10);
        drawSquare(g, 180, 115, 36);
    }

    public static void drawSquare(Graphics g, int x, int y, int size){
        g.setColor(Color.RED);
        for (int i=0; i<5; i++){
            g.drawRect(x, y, size*5-i*size, size*5-i*size);
        }
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x+size*5, y+size*5);
    }
}
