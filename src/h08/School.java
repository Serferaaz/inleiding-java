package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class School extends Applet{
    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Label label;
    int mannen;
    int vrouwen;
    int pmannen;
    int pvrouwen;
    String S1 = "";
    String S2 = "";
    String S3 = "";
    String S4 = "";
    String Samen;


    public void init() {
        knop1 = new Button("Man");
        knop2 = new Button("Vrouw");
        knop3 = new Button("Jongen");
        knop4 = new Button("Meisje");
        label = new Label("Het totaal is: ");
        knop1.addActionListener( new ManListener() );
        knop2.addActionListener( new VrouwListener() );
        knop3.addActionListener(new PManListener() );
        knop4.addActionListener( new PVrouwListener() );
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        mannen = 0;
        vrouwen = 0;
        pmannen = 0;
        pvrouwen = 0;

    }

    public void paint(Graphics g) {
        g.drawString("Aantal mannen:    " + mannen, 80, 100);
        g.drawString("Aantal vrouwen:   " + vrouwen, 80, 120);
        g.drawString("Aantal jongens    "+ pmannen, 80, 140);
        g.drawString("Aantal meisjes    " + pvrouwen, 80, 160);
        g.drawString("Het totaal aantal is: " + (mannen + vrouwen + pmannen + pvrouwen), 80, 200);
    }

    class ManListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannen++;
            repaint();
        }
    }
    class VrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwen++;
            repaint();

        }
    }
    class PManListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
          pmannen++;
          repaint();
      }
    }
    class PVrouwListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            pvrouwen++;
            repaint();
        }
    }
}
