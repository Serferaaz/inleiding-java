package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Rekenmachine extends Applet{

    TextField tekstvak1;
    TextField tekstvak2;
    Button plusknop;
    Button minknop;
    Button deelknop;
    Button keerknop;
    double getal1;
    double getal2;
    double uitkomst;
    String invoer1;
    String invoer2;


    public void init() {
        tekstvak1 = new TextField("", 10);
        tekstvak2 = new TextField("", 10);
        add(tekstvak1);
        add(tekstvak2);

        plusknop = new Button("+");
        plusknop.addActionListener(new PlusknopListener() );
        minknop = new Button("-");
        minknop.addActionListener(new MinknopListener() );
        deelknop = new Button("/");
        deelknop.addActionListener(new DeelknopListener() );
        keerknop = new Button("*");
        keerknop.addActionListener(new KeerknopListener() );
        add(plusknop);
        add(minknop);
        add(deelknop);
        add(keerknop);

        getal1 = 0.0;
        getal2 = 0.0;
        uitkomst = getal1 + getal2;

        invoer1 = "";
        invoer2 = "";
    }

    public void paint(Graphics g) {


        }

    class PlusknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer1 = tekstvak1.getText();
            getal1 = Double.parseDouble(invoer1);
            invoer2 = tekstvak2.getText();
            getal2 = Double.parseDouble(invoer2);
            uitkomst = getal1 + getal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }

    class MinknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer1 = tekstvak1.getText();
            getal1 = Double.parseDouble(invoer1);
            invoer2 = tekstvak2.getText();
            getal2 = Double.parseDouble(invoer2);
            uitkomst = getal1 - getal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();

        }
    }

    class DeelknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer1 = tekstvak1.getText();
            getal1 = Double.parseDouble(invoer1);
            invoer2 = tekstvak2.getText();
            getal2 = Double.parseDouble(invoer2);
            uitkomst = getal1 / getal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }
//nothing//
    class KeerknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            invoer1 = tekstvak1.getText();
            getal1 = Double.parseDouble(invoer1);
            invoer2 = tekstvak2.getText();
            getal2 = Double.parseDouble(invoer2);
            uitkomst = getal1 * getal2;
            tekstvak1.setText("" + uitkomst);
            tekstvak2.setText("");
            repaint();
        }
    }
}
