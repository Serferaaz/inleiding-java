package h04;

import java.awt.*;
import java.applet.*;
import java.net.CookieHandler;

public class Praktijkopdracht extends Applet{
    public void init() {
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(10, 20, 200, 20);
        g.drawString("Lijn", 100, 40);

        //Rechthoek
        g.drawRect(10, 50, 190, 80);
        g.drawString("Rechthoek", 80, 150);

        //Rechthoek met ovaal
        g.setColor(Color.magenta);
        g.fillRect(220, 50, 190, 80);
        g.setColor(Color.black);
        g.drawOval(220, 50, 190, 80);
        g.drawString("Gevulde rechthoek met ovaal", 230, 150);

        //Taartpunt met ovaal
        g.setColor(Color.magenta);
        g.fillArc(430,50,191, 80, 0, 45);
        g.setColor(Color.black);
        g.drawOval(430, 50, 190, 80);
        g.drawString("Taartpunt met ovaal eromheen", 440, 150);


        //Afgeronde rechthoek
        g.drawRoundRect(10,155, 190, 85, 30, 30);
        g.drawString("Afgeronde rechthoek", 50, 255);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(220, 155, 190, 90);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 270, 255);

        //Cirkel
        g.drawOval(480, 155, 85, 85);
        g.drawString("Cirkel", 505, 255);
    }
}
