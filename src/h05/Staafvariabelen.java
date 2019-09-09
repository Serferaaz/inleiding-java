package h05;

import java.awt.*;
import java.applet.*;

public class Staafvariabelen extends Applet{
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int breedte;
    int hoogte;
    int lijn;

    public void init() {
        breedte = 40;
        hoogte = 400;
        gewichtValerie = 40 *2;
        gewichtJeroen = 100 *2;
        gewichtHans = 80 *2;
        lijn = 400;

    }

    public void paint(Graphics g) {

        //linkerlijn
        g.drawLine(60, 200, 60, hoogte);
        //onderlijn
        g.drawLine(60, 400, 200, hoogte);
        //kg tekst
        g.drawString("Cijfers in KG", 0, 70);

        //Staaf Valerie
        g.drawString("Valerie", 65,420 );
        g.setColor(Color.pink);
        g.fillRect(61, lijn - gewichtValerie, breedte, 80);

        //Staaf Jeroen
        g.setColor(Color.black);
        g.drawString("Jeroen", 115, 420 );
        g.setColor(Color.green);
        g.fillRect(110,  lijn - gewichtJeroen, breedte, gewichtJeroen);

        //Staaf Hans
        g.setColor(Color.black);
        g.drawString("Hans", 170, 420);
        g.setColor(Color.yellow);
        g.fillRect(160, lijn - gewichtHans, breedte, 160);

        //Gewichten in kg
        g.setColor(Color.black);
        g.drawString("20 kg", 20, 364);
        g.drawString("40 kg", 20, 324);
        g.drawString("60 kg", 20, 284);
        g.drawString("80 kg", 20, 244);
        g.drawString("100 kg", 20, 204);

    }
}
