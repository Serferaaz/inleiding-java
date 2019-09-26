package h10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Teller extends Applet{
    TextField maandvak;
    TextField jaarvak;
    Label label1;
    Label label2;
    String S;
    String maandnaam;
    String maanddagen;
    int maandgetal;
    int jaargetal;
    int februari;

    public void init() {
        maandvak = new TextField("", 20);
        maandvak.addActionListener( new MaandListener() );
        label1 = new Label("Typ een maandnummer in:");
        jaarvak = new TextField("", 20);
        jaarvak.addActionListener( new MaandListener() );
        label2 = new Label("Typ een Jaargetal in:");
        S = "";
        maandnaam = "";
        maanddagen = "";
        februari = 28;

        add(label1);
        add(maandvak);
        add(label2);
        add(jaarvak);

    }
    public void paint(Graphics g) {
        g.drawString("" + maandnaam, 50, 80);
        g.drawString("" + maanddagen , 50, 100);

    }

    class MaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            S = maandvak.getText();
            maandgetal = Integer.parseInt(S);
            maandvak.setText("");
            S = jaarvak.getText();
            jaargetal = Integer.parseInt(S);
            jaarvak.setText("");

            switch (maandgetal) {
                case 1:
                    maandnaam = "Januari";
                    maanddagen = "31 dagen";
                    break;
                case 2:
                    maandnaam = "Februari";
                    if ( (jaargetal % 4 == 0 && !( jaargetal % 100 == 0)) || jaargetal % 400 == 0) {
                    februari = 29;
                }
                    maanddagen = februari + " dagen";
                    break;
                case 3:
                    maandnaam = "Maart";
                    maanddagen = "31 dagen";
                    break;
                case 4:
                    maandnaam = "April";
                    maanddagen = "30 dagen";
                    break;
                case 5:
                    maandnaam = "Mei";
                    maanddagen = "31 dagen";
                case 6:
                    maandnaam = "Juni";
                    maanddagen = "30 dagen";
                    break;
                case 7:
                    maandnaam = "Juli";
                    maanddagen = "31 dagen";
                    break;
                case 8:
                    maandnaam = "Augustus";
                    maanddagen = "31 dagen";
                    break;
                case 9:
                    maandnaam = "September";
                    maanddagen = "30 dagen";
                    break;
                case 10:
                    maandnaam = "Oktober";
                    maanddagen = "31 dagen";
                    break;
                case 11:
                    maandnaam = "November";
                    maanddagen = "30 dagen";
                    break;
                case 12:
                    maandnaam = "December";
                    maanddagen = "31 dagen";
            }
            repaint();
        }
    }
}