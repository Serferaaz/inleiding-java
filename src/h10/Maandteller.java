package h10;

import javax.swing.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Maandteller extends Applet {
    TextField tekstVakJaar;
    TextField tekstvak;
    Label jaarLabel;
    Label label;
    int maandgetal;
    String S;
    String tekst = "";
    String maandnaam = "";

    public void init() {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new MaandListener() );
        label = new Label("typ een maandnummer in: ");
        S = "";
        tekstVakJaar = new TextField("", 20);
        tekstVakJaar.addActionListener(new MaandListener() );

        jaarLabel = new Label("Typ een jaar in: ");
        add(label);
        add(tekstvak);
        add(jaarLabel);
        add(tekstVakJaar);
    }

    public void paint(Graphics g) {
        g.drawString(maandnaam, 50, 80);
        g.drawString(tekst, 50, 100);
    }

    class MaandListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int jaartal = Integer.parseInt(tekstVakJaar.getText());
            int februariDagen = 28;
            S = tekstvak.getText();
            maandgetal = Integer.parseInt(S);
            tekstvak.setText("");
            tekstVakJaar.setText("");
            switch (maandgetal) {
                case 1:
                    maandnaam = "Januari";
                    tekst = "31 dagen";
                    break;
                case 2:
                    maandnaam = "Februari";
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) || jaartal % 400 == 0) {
                        februariDagen = 29;
                    }
                    tekst = februariDagen + " dagen";
                    break;
                case 3:
                    maandnaam = "Maart";
                    tekst = "31 dagen";
                    break;
                case 4:
                    maandnaam = "April";
                    tekst = "30 dagen";
                    break;
                case 5:
                    maandnaam = "Mei";
                    tekst = "31 dagen";
                    break;
                case 6:
                    maandnaam = "Juni";
                    tekst = "30 dagen";
                    break;
                case 7:
                    maandnaam = "Juli";
                    tekst = "31 dagen";
                    break;
                case 8:
                    maandnaam = "Augustus";
                    tekst = "31 dagen";
                    break;
                case 9:
                    maandnaam = "September";
                    tekst = "30 dagen";
                    break;
                case 10:
                    maandnaam = "Oktober";
                    tekst = "31 dagen";
                    break;
                case 11:
                    maandnaam = "November";
                    tekst = "30 dagen";
                    break;
                case 12:
                    maandnaam = "December";
                    tekst = "31 dagen";
                    break;
            }
            repaint();
        }
    }
}
