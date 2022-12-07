import java.awt.*;
import java.applet.*;

public class Pond {

    public static void drawLilyPads(Graphics g) {
        g.setColor(new Color(9,113,35));
        g.fillOval(525,275,25,25);
        g.fillOval(575,300,25,25);
        g.fillOval(567,305,25,25);
        g.fillOval(530,305,25,25);
        g.fillOval(565,280,25,25);
        g.fillOval(545,270,25,25);
        g.fillOval(545,290,25,25);
        g.fillOval(610,300,25,25);
        g.fillOval(620,280,25,25);
    }
    public static void drawPond(Graphics g) {
        g.setColor(new Color (13,36,242));
        g.fillOval(500,250,150,100);
    }

}
