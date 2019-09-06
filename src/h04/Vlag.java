package h04;

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet{

    public void init() {
        setSize(500, 500);
    }

    public void paint(Graphics g) {
        //Stok van de vlag
        g.drawRect(40, 40, 20, 400);

        //Vlag
        //Boven
        g.setColor(Color.red);
        g.fillRect(60, 60, 200, 50);

        //Midden
        g.setColor(Color.black);
        g.drawRect(60, 110, 200, 50);
        //Beneden
        g.setColor(Color.blue);
        g.fillRect(60, 160, 200, 50);


    }
}
