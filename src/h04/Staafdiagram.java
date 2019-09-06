package h04;

import java.awt.*;
import java.applet.*;

public class Staafdiagram extends Applet{

    public void init() {
        setSize( 500, 500);
    }

    public void paint(Graphics g){
        //Linkerlijn
        g.drawLine(60, 80, 60, 400);
        //Onderlijn
        g.drawLine(60,400, 400, 400);

        //Staaf Valerie
        g.drawString("Valerie", 65,420 );
        g.setColor(Color.pink);
        g.fillRect(61, 320, 50, 80);

        //Staaf Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", 115, 420 );
        g.setColor(Color.green);
        g.fillRect(110, 205, 50, 195);

        //Staaf Hans
        g.setColor(Color.black);
        g.drawString("Hans", 170, 420);
        g.setColor(Color.yellow);
        g.fillRect(160, 240,50, 160);

        //Gewichten in kg
        g.setColor(Color.black);
        g.drawString("20 kg-", 25, 364);
        g.drawString("40 kg-", 25, 324);
        g.drawString("60 kg-", 25, 284);
        g.drawString("80 kg-", 25, 244);
        g.drawString("100 kg", 25, 204);

    }
}
