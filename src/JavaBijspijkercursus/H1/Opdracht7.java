package JavaBijspijkercursus.H1;

import java.awt.*;
import java.applet.*;

public class Opdracht7 extends Applet{
    double breedte;
    double lengte;
    double oppervlakte;
    double omtrek;

    public void init() {
        lengte = 5.3;
        breedte = 8.6;
        oppervlakte = lengte * breedte;
        omtrek = 2 * (lengte + breedte);
    }
    public void paint(Graphics g) {
        g.drawString("Het oppervlakte is " + oppervlakte, 20, 20);
        g.drawString("De omtrek is " + omtrek, 20, 35);
    }
}
