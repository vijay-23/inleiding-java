package h04;

import java.awt.*;
import java.applet.*;

public class h04Opdracht3 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.red);
        g.fillRect(40, 20, 150, 45);

        g.setColor(Color.white);
        g.fillRect(40,65,150,45);

        g.setColor(Color.blue);
        g.fillRect(40,110,150,45);

        g.drawRect(30,20,10,250);

    }
}