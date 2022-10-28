import java.awt.*;

public class figureMickey{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(450, 150);
        Graphics g = panel.getGraphics();
        panel.setBackground(Color.YELLOW);

        drawMickey(g, 50, 25);
        drawMickey(g, 250, 45);
    }

    public static void drawMickey(Graphics g, int x, int y){
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 40, 40); //left eye
        g.fillOval(x+80, y, 40, 40); //right eye

        g.setColor(Color.RED);
        g.fillRect(x+20, y+20, 80, 80); //rectangle

        g.setColor(Color.BLACK);
        g.drawLine(x+20, y+60, x+100, y+60); //line
    }
}
