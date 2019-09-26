package h10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Bijhouder extends Applet {
    boolean firstinput;
    TextField tekstvak;
    Label label;
    double maximum;
    double minimum;
    double input;
    String tekst;

    public void init() {
        tekstvak = new TextField("", 10);
        tekstvak.addActionListener(new TekstListener());
        label = new Label("typ een getal");
        tekst = "";
        maximum = 0;
        minimum = 0;
        add(label);
        add(tekstvak);
        firstinput = true;

    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste getal is: " + maximum, 50, 70);
        g.drawString("Het laagste getal is: " + minimum, 50, 90);

    }

    class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekst = tekstvak.getText();
            input = Double.parseDouble(tekst);
            if (firstinput) {
                firstinput = false;
                maximum = input;
                minimum = input;
                repaint();
            } else if (input > maximum) {
                maximum = input;
                repaint();
            } else if (input < minimum) {
                minimum = input;
                repaint();
            }
        }
    }
}