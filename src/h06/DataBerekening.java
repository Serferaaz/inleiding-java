package h06;

import java.awt.*;
import java.applet.*;

public class DataBerekening extends Applet {

    int seconden;
    int uren;
    int dagen;
    int jaren;
    int uitkomst;
    int uitkomst2;
    int uitkomst3;

    public void init() {
        seconden = 60;
        uren = 60;
        dagen = 24;
        uitkomst = seconden * 60;
        uitkomst2 = uitkomst * 24;
        uitkomst3 = uitkomst2 * 365;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in een uur:  " + uitkomst, 50, 50);
        g.drawString("Seconden in een dag:      " + uitkomst2, 50, 70);
        g.drawString("Seconden in een jaar:     " + uitkomst3, 50, 90);

    }
}
