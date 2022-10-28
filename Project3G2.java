import java.awt.*;

public class Project3G2{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(200, 200);
        Graphics g = panel.getGraphics();
        Color BROWN = new Color(128,0,0);

        //draws individual square in the grid
        eyesStamp(g, Color.BLUE, 20, 20);
        eyesStamp(g, Color.GREEN, 120, 70);
        eyesStamp(g, BROWN, 70, 120);
        squareStamp(g, Color.GREEN, 70, 20);
        squareStamp(g, BROWN, 20, 70);
        squareStamp(g, Color.BLUE, 120, 120);
        letterStamp(g, BROWN, 120, 20);
        letterStamp(g, Color.BLUE, 70, 70);
        letterStamp(g, Color.GREEN, 20, 120);
    }

    public static void eyesStamp(Graphics g, Color color, int x, int y){
        //draw outer square
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 50);

        //draw the eye corners
        g.drawOval(x+5, y+5, 13, 40);
        g.drawOval(x+30, y+5, 13, 40);

        //draw the eyeballs
        g.setColor(color);
        g.fillOval(x+5, y+25, 13, 15);
        g.fillOval(x+30, y+25, 13, 15);
    }

    public static void squareStamp(Graphics g, Color color, int x, int y){
        g.setColor(color);
        //draw rectangles on the right
        for (int i=0; i<5; i++){
            g.drawRect(x+i*5, y+i*5, 5, 45-i*10);
        }

        //draw rectangles on the right
        for (int i=0; i<5; i++){
            g.drawRect(x+45-i*5, y+5+i*5, 5, 45-i*10);
        }

        //draw rectangles on the top
        for (int i=0; i<5; i++){
            g.drawRect(x+5+i*5, y+i*5, 45-i*10, 5);
        }

        //draw rectangles on the bottom
        for (int i=0; i<5; i++){
            g.drawRect(x+i*5, y+45-i*5, 45-i*10, 5);
        }

        //draw outer square
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 50);
    }

    public static void letterStamp(Graphics g, Color color, int x, int y){
        //draw outer square
        g.setColor(Color.BLACK);
        g.drawRect(x, y, 50, 50);

        //draw text 
        g.setColor(color);
        g.drawString("I", x+25, y+10);
        g.drawString("Love", x+14, y+25);
        g.drawString("Java", x+14, y+40);
    }
}
