package h04;

import java.awt.*;
import java.applet.*;

public class h04Opdracht5 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.black);
        g.setColor(Color.yellow);
        g.fillArc(40, 40, 300, 150, 0, 360);
    }
}