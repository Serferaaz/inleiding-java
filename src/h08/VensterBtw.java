package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class VensterBtw extends Applet{
    TextField tekstvak;
    Button knop;
    Label label;
    String s;
    double bedrag;
    double btw;

    public void init() {
        tekstvak = new TextField("", 30);
        label = new Label("met 21 btw:");
        knop = new Button("Ok");
        knop.addActionListener( new Listener());
        tekstvak.addActionListener(new Listener());
        add(tekstvak);
        add(label);
        add(knop);
        btw = 1.21;

    }
    public void paint(Graphics g) {
        g.drawString("" + bedrag*btw, 50, 80);


    }

    class Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String s = tekstvak.getText();
            bedrag = Double.parseDouble( s );
            repaint();
        }
    }

}
