package h06;

import java.awt.*;
import java.applet.*;

public class Berekening extends Applet{
    double geld;
    double leerlingen;
    double uitkomst;

    public void init() {
        leerlingen = 4;
        geld = 113;
        uitkomst = geld / leerlingen;
    }

    public void paint(Graphics g) {
        g.drawString("Jan: " + uitkomst, 50, 50);
        g.drawString("Ali: " + uitkomst, 50, 70);
        g.drawString("Jeannette: " + uitkomst, 50, 90);
        g.drawString("Ik: " + uitkomst, 50, 110);
    }
}
