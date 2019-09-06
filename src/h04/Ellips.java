package h04;

import java.awt.*;
import java.applet.*;

public class Ellips extends Applet{
    public void init() {

    }
    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(90, 90, 120, 70, 90, 360);
    }
}
