package H06;

import java.awt.*;
import java.applet.*;

public class H06Opdracht1 extends Applet {

    double Jan, Ali,Jeannette,Vijay,Totaalbedrag;

    public void init() {
        Jan = Totaalbedrag/4;
        Ali = Totaalbedrag/4;
        Jeannette = Totaalbedrag/4;
        Vijay = Totaalbedrag/4;

        Totaalbedrag = 113;
    }
    public void paint(Graphics g) {
        g.drawString("Totaalbedrag = " + Totaalbedrag, 30, 20);
        g.drawString("Jan = "+ Totaalbedrag/4,30,50);
        g.drawString("Ali = "+ Totaalbedrag/4,30,80);
        g.drawString("Jeannette = "+ Totaalbedrag/4,30,110);
        g.drawString("Vijay = "+ Totaalbedrag/4,30,140);
    }
}