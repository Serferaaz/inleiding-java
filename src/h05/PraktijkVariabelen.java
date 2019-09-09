package h05;

import java.awt.*;
import java.applet.*;

public class PraktijkVariabelen extends Applet{

    //declaratie
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie
        opvulkleur = Color.magenta;
        lijnkleur = Color.black;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        //Lijn
        g.drawLine(100, 80, 300, 80);

        //Rechthoek
        g.drawRect(100, 100, breedte, hoogte);

        //Afgeronde rechthoek
        g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);

        //Gevulde rechthoek
        g.setColor(opvulkleur);
        g.fillRect(315, 100, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(315, 100, breedte, hoogte);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(315, 225, breedte, hoogte);

        //Taartpunt met ovaal
        g.setColor(Color.black);
        g.drawOval(530, 100, breedte, hoogte);
        g.setColor(opvulkleur);
        g.fillArc(530, 100, breedte, hoogte, 0, 45);

        //Cirkel
        g.setColor(Color.black);
        g.drawOval(575, 225, hoogte, hoogte);
    }
}
