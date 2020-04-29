package JavaBijspijkercursus.H1;

import java.awt.*;
import java.applet.*;

public class Opdracht5 extends Applet{
    int antwoord;

    public void init() {
        antwoord = 1+2+3+4+5+6+7+8+9+10;
    }
    public void paint(Graphics g) {
        g.drawString("" + antwoord, 20, 20);
    }
}
