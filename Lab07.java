import java.applet.*;
import java.awt.*;


public class Lab07 extends Applet {
    public void paint(Graphics g) {

        //draw mountains
        Mountain.drawMountains(g);
        Mountain.drawGrass(g);
        Mountain.drawSnowPatches(g);
        Mountain.drawSnow(g);

        //draw trees
        Tree.drawGrass(g);
        Tree.drawStem(g);
        Tree.drawLeaves(g);

        //draw Pond
        Pond.drawPond(g);
        Pond.drawLilyPads(g);


    }

}