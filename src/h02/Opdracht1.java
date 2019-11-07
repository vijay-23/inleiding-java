package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {

    // VARIABELEN DECLAREREN
    String voornaam;

    public void init() {

        // VARIABELEN INITIALISEREN

        voornaam = "Vijay";
        setSize(300,300);
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {

        // DINGEN IN BEELD BRENGEN
        g.setColor(Color.yellow);
        g.drawString(voornaam, 20,20);
    }
}
