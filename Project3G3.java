import java.awt.*;

public class Project3G3{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(420, 300);
        Graphics g = panel.getGraphics();

        //drawCheckerboard(g, 0, 0, 100);
        drawGrid(g, 1, 5, 50, 0, 0);
        drawGrid(g, 10, 3, 120, 20, 70);
        drawGrid(g, 5, 4, 200, 160, 30);
    }

    //draws a 5x5 Checkerboard
    //whose side's length is determined by the variable side
    public static void drawCheckerboard(Graphics g, int n, int x, int y, int side){
        int squareSize = side/n;
        g.setColor(Color.GRAY);

        //draws odd rows
        for (int i=0; i<n; i+=2){
            for (int j=0; j<n; j+=2){
                g.fillRect(x+squareSize*j, y+squareSize*i, squareSize, squareSize);
            }
        }
        //draws even rows
        for (int i=0; i<n/2; i++){
            for (int j=0; j<n/2; j++){
                g.fillRect(x+squareSize+squareSize*j*2, y+squareSize+squareSize*i*2, squareSize, squareSize);
            }
        }

        //draws outer square
        g.setColor(Color.BLACK);
        g.drawRect(x, y, side, side);
    }

    //draws a grid of n number of checkerboards on each side
    //each checkerboard has a n2 number of squares per side
    public static void drawGrid(Graphics g, int n, int n2, int side, int x, int y){
        int boardSide = side/n;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                drawCheckerboard(g, n2, x+boardSide*j, y+boardSide*i, boardSide);
            }
        }
    }
}
