package h04;

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        g.setColor(Color.black);
        //Rechthoek
        g.fillRect(90, 90, 70, 120);
        //De paal
        g.fillRect(115, 180, 20, 180);
        //Rood licht
        g.setColor(Color.red);
        g.fillOval(110, 100, 30, 30);
        //Oranje licht
        g.setColor(Color.orange);
        g.fillOval(110, 135, 30, 30);
        //Groen licht
        g.setColor(Color.green);
        g.fillOval(110, 170, 30, 30);

    }
}
