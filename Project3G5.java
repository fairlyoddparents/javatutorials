import java.awt.*;

//draws the otpical illusion called the "Cafe Wall"
public class Project3G5{
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(650, 400);
        panel.setBackground(Color.GRAY);
        Graphics g = panel.getGraphics();

        drawGrid(g, 0, 0, 1, 8, 15, 0);
        drawGrid(g, 20, 40, 1, 10, 25, 0);
        drawGrid(g, 10, 100, 8, 8, 20, 0);
        drawGrid(g, 300, 30, 4, 4, 30, 30);
        drawGrid(g, 200, 190, 6, 6, 25, 12);
        drawGrid(g, 430, 170, 10, 10, 15, 8);
    }

    //draws grids of rows
    public static void drawGrid(Graphics g, int x, int y, int rows, int n, int side, int shift){
        //draws the odd rows starting at x, y location
        for (int i = 0; i < rows; i += 2){
            drawRows(g, x, y + side * i + 1 * i, n, side);
        }

        //draws the even rows with a shift
        for (int i = 1; i < rows; i += 2){
            drawRows(g, x + shift, y + side * i + 1 * i, n, side);
        }
    }

    //draws individual rows
    public static void drawRows(Graphics g, int x, int y, int n, int side){
        //draws black squares
        g.setColor(Color.BLACK);
        for (int i = 0; i < n; i += 2){
            g.fillRect(x+side*i, y, side, side);
        }

        //draws grey crosses inside the black squares
        g.setColor(Color.GRAY);
        for (int i = 0; i < n; i += 2){
            //draws a line from the top left corner to the bottom right corner
            g.drawLine(x+side*i, y, x+side+side*i, y+side);

            //draws a line from the bottom left corner to the top right corner
            g.drawLine(x+side*i, y+side, x+side+side*i, y);
        }

        //draws white squares
        g.setColor(Color.WHITE);
        for (int i = 0; i < (n / 2) * 2; i += 2){
            g.fillRect(x+side+side*i, y, side, side);
        }
    }
}
