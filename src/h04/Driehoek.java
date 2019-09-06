package h04;


import java.awt.*;
import java.applet.*;

public class Driehoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        //linkerlijn
        g.drawLine(100, 175, 160, 50);
        //onderlijn
        g.drawLine(100, 175, 220, 175);
        //rechterlijn
        g.drawLine(220, 175,160, 50);

    }
}