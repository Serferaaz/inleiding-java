package JavaBijspijkercursus.H1;

import java.awt.*;
import java.applet.*;

public class Opdracht6 extends Applet{
    double antwoord;
    double getal1;
    double getal2;

    public void init() {
        getal1 = 4;
        getal2 = (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        antwoord = getal1 * getal2;
    }
    public void paint(Graphics g) {
        g.drawString("" + antwoord, 20, 20);
    }
}
