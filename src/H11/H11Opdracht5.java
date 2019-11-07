package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 5;
        int x = 5;
        int width = 20;
        int height = 20;

        for (teller = 0; teller < 5; teller++) {
            g.drawRect(x,y,width,width);

            y += height;
            x += width;
        }
    }
}