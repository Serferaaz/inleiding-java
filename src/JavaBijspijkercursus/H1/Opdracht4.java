package JavaBijspijkercursus.H1;

import java.awt.*;
import java.applet.*;

public class Opdracht4 extends Applet{
    double som;
    double getal1;
    double getal2;
    public void init(){
        getal1 = (7.5 * 6.5 - 4.5 * 3);
        getal2 = (47.5 * 5.5);
        som = getal1 / getal2;
    }
    public void paint(Graphics g){
        g.drawString("Het antwoord is " + som, 20, 10);
    }
}
