import java.awt.*;
import java.applet.*;

public class Tree {

    public static void drawGrass(Graphics g) {
        //first tree(left)
        g.drawLine(300,500,350,500);

        //second tree(right)
        g.drawLine(750,500,800,500);
    }

    public static void drawStem(Graphics g) {
       //first tree(left)
        g.drawLine(325,445,325,500);

        //second tree(right)
        g.drawLine(775,500,775,450);
    }

    public static void drawLeaves(Graphics g) {
        //first tree(left)

        g.setColor(new Color(9,113,35));
        g.drawLine(325,450,300,437);
        g.drawLine(325,450,345,437);
        g.drawLine(325,460,300,447);
        g.drawLine(325,460,345,447);
        g.drawLine(325,470,300,455);
        g.drawLine(325,470,345,455);
        g.drawLine(325,480,300,465);
        g.drawLine(325,480,345,465);
        g.drawLine(325,490,300,475);
        g.drawLine(325,490,345,475);
        g.drawLine(325,500,300,485);
        g.drawLine(325,500,345,485);

        //second tree(right
        g.drawLine(775,460,750,445);
        g.drawLine(775,460,795,445);
        g.drawLine(775,470,750,455);
        g.drawLine(775,470,795,455);
        g.drawLine(775,480,750,465);
        g.drawLine(775,480,795,465);
        g.drawLine(775,490,750,475);
        g.drawLine(775,490,795,475);
        g.drawLine(775,500,750,485);
        g.drawLine(775,500,795,485);
    }

}
