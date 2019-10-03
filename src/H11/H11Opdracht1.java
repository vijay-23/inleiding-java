package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht1 extends Applet {


    public void init( ) {}

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int y1 = 200;
        int x = 10;
        for (teller = 0; teller < 10; teller++) {
            x += 50;
            g.drawLine(x, y, x, y1);
            }
        }
    }
