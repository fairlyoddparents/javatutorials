import java.awt.*;

public class Project3G1{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(400, 400);
        panel.setBackground(Color.CYAN);
        Graphics g = panel.getGraphics();

        drawGrid(g, 1, 5, 0, 0, 100);
        drawGrid(g, 5, 4, 10, 120, 24);
        drawGrid(g, 6, 5, 150, 20, 40);
        drawGrid(g, 3, 3, 130, 275, 36);
    }

    public static void drawGrid(Graphics g, int colRow, int n, int x, int y, int size){
        //draws a grid with colRow number of columns and rows with the figure
        for (int j=0; j<colRow; j++){
            for (int i=0; i<colRow; i++){
                drawFigure(g, n, x+i*size, y+j*size, size);
            }
        }
    }

    public static void drawFigure(Graphics g, int n, int x, int y, int size){
        //draw a rectangle
        g.setColor(Color.GREEN);
        g.fillRect(x, y, size, size);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, size, size);

        drawConCircles(g, n, x, y, size);

        //draw two lines in the center of the sides of the square
        drawLines(g, x, y, size);
    }

    public static void drawConCircles(Graphics g, int n, int x, int y, int size){
        int space = size/n; //difference in size
        int space2 = space/2; //difference in coordinates

        //draw n number of circles
        //one circle inside the other
        for (int i=0; i<n; i++){
            g.setColor(Color.YELLOW);
            g.fillOval(x+i*space2, y+i*space2, size-i*space, size-i*space);
            g.setColor(Color.BLACK);
            g.drawOval(x+i*space2, y+i*space2, size-i*space, size-i*space);
        }
    }


    public static void drawLines(Graphics g,int x, int y, int size){
        int center = size/2;
        //draw two lines in the center of the sides of the square
        g.setColor(Color.BLACK);
        g.drawLine(x, y+center, x+size, y+center);
        g.drawLine(x+center, y, x+center, y+size);
    }
}
