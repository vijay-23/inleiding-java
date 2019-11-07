package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht3 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int nummer1=0;
        int nummer2=1;
        int nummer3=1;
        int teller;
        int y = 0;

        for (teller = 0; teller < 30; teller++) {
            y+= 20;
            g.drawString("" + nummer1, 50, y );

            nummer1 = nummer2;
            nummer2 = nummer3;
            nummer3 = nummer1 + nummer2;
        }
    }
}