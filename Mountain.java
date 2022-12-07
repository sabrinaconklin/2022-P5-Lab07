import java.awt.*;
import java.applet.*;

public class Mountain {

    public static void drawMountains(Graphics g) {
        //draw first mountain
        g.setColor((new Color(129, 49, 1)));
        Polygon mnt = new Polygon();
        mnt.addPoint(300, 325);
        mnt.addPoint(350, 175);
        mnt.addPoint(430, 325);
        g.fillPolygon(mnt);

            //draw second mountain
        Polygon mnt2 = new Polygon();
        mnt2.addPoint(750,175);
        mnt2.addPoint(875,325);
        mnt2.addPoint(675,325);
        g.fillPolygon(mnt2);
        //draw third mountain
       Polygon mnt3 = new Polygon();
        mnt3.addPoint(400,550);
        mnt3.addPoint(525,350);
        mnt3.addPoint(625,550);
        g.fillPolygon(mnt3);

    }

    public static void drawGrass(Graphics g) {
        g.setColor(new Color(9,113,35));
        g.drawLine(297,325,433,325);
        g.drawLine(742,325,877,325);
        g.drawLine(395,551,630,551);
    }

    public static void drawSnow(Graphics g) {

    }
    public static void drawSnowPatches(Graphics g) {

    }

}