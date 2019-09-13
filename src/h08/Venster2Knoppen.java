package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Venster2Knoppen extends Applet{
    TextField tekstvak;
    Button knop;
    Button knop2;
    Label label;
    String s;

    public void init( ) {
        label = new Label("Wat is (2 + 2) - 1 = ");
        tekstvak = new TextField("", 30);
        knop = new Button("Ok");
        knop2 = new Button("Refresh");
        knop.addActionListener( new Knoplistener() );
        knop2.addActionListener( new Freshlistener() );
        add(label);
        add(tekstvak);
        s = "";
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("Type een hele lange tekst" + "in het tekstvakje" + " en klik op Ok" , 50, 100);
        g.drawString(s, 100, 120);

    }

    class Knoplistener implements ActionListener {
        public void actionPerformed( ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class Freshlistener  implements ActionListener {
        public void  actionPerformed( ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
