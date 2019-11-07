package h04;

import java.awt.*;
import java.applet.*;

public class h04Opdracht2 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(100,100, 175, 25);
        g.drawLine(250, 100, 175, 25);
        g.drawRect(100,100,150,100);
        g.drawRect(160,160,25,40);
        g.drawRect(115,160,30,30);
        g.drawRect(205,160,30,30);
        g.fillOval(180,180,5,5);
    }
}