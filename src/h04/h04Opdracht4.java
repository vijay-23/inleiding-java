package h04;

import java.awt.*;
import java.applet.*;

public class h04Opdracht4 extends Applet {


    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(60,60,60,250);
        g.drawLine(60,250,300,250);

        g.setColor(Color.red);
        g.fillRect(61, 180, 75, 70);

        g.setColor(Color.blue);
        g.fillRect(136,75,75,175);

        g.setColor(Color.orange);
        g.fillRect(211,110,75,140);

        g.setColor(Color.black);
        g.drawString("Valerie", 76,262);

        g.setColor(Color.black);
        g.drawString("Jeroen",156,262);

        g.setColor(Color.black);
        g.drawString("Hans",231,262);

        g.setColor(Color.black);
        g.drawString("0",50,255);
        g.drawString("20",42,220);
        g.drawString("40", 42, 185);
        g.drawString("60",42,150);
        g.drawString("80",42,115);
        g.drawString("100",36,80);



    }
}
