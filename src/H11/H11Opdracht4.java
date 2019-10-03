package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht4 extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int resultaat;
        int keer=3;
        int nummer1=1;
        int teller;
        int y = 0;


        for (teller = 0; teller <= 10; teller++) {
            y+= 20;
            resultaat = (nummer1*keer)*teller;
            g.drawString("" + resultaat, 50, y );

        }
    }
}
