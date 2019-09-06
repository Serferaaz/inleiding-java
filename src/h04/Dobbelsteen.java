package h04;

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet{

    public void init() {

    }

    public void paint(Graphics g) {
        //De vorm
        g.setColor(Color.red);
        g.fillRoundRect(80, 80, 80, 80, 30, 30);
        //De ogen
        g.setColor(Color.white);
        g.fillOval(93,90, 23, 23);
        g.fillOval(123, 90, 23, 23);
        g.fillOval(93, 125, 23, 23);
        g.fillOval(123, 125, 23, 23);

    }
}
