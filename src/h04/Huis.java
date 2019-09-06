package h04;


import java.awt.*;
import java.applet.*;

public class Huis extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        //Driekhoek dak:
        //linkerlijn
        g.drawLine(50, 175, 160, 50);
        //onderlijn
        g.drawLine(50, 175, 265, 175);
        //rechterlijn
        g.drawLine(265, 175, 160, 50);

        //Vierkant huis:
        g.drawRect(50, 175, 215, 215);

        //Raam:
        g.drawRect(80,200, 50, 50);
        //Deur:
        g.drawRect(180, 280, 55, 110 );




    }

}
