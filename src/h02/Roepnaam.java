package h02;

import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class Roepnaam extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);
    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Serferaaz!!", 150, 160 );

        g.setColor(Color.RED);
        g.drawString("Sheikh alibaks!!", 150, 170 );

/*

Wat is machinetaal?
Machinetaal is een taal waarin instructies geschreven zijn die de processor van een computer direct kan uitvoeren

Welke drie hulpmiddelen heb je nodig om te programmeren?
Een tekstverwerker, een compiler en een linker

Hoe herken je opdrachten in de broncode?
Alle opdrachten zitten tussen de accolades

Waartoe dienen de import-opdrachten?
Die halen de voorgedefinieerde codes op uit de klassenbibliotheek

Wat is een methode?
Een methode is een aantal opdrachten met een naam erboven
 */

    }
}
