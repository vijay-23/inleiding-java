package Challenge1;

import java.applet.Applet;
import java.awt.*;

public class Kunstwerk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(20,40,60,40);
        g.drawLine(60,30,60,190);
        g.drawLine(60,60,200,60);
        g.drawLine(180,60,180,190);
        g.drawLine(20,190,200,190);
        g.drawLine(120,190,120,215);
        g.setColor(Color.black);
        g.fillRect(20,190,25,25);
        g.setColor(Color.decode("#ffee82"));
        g.fillRect(45,191,75,25);
        g.setColor(Color.decode("#e8e8e8"));
        g.fillRect(121,191,80,25);
        g.setColor(Color.blue);
        g.fillRect(181,61,20,129);
        g.setColor(Color.red);
        g.fillRect(20,25,40,15);
        g.setColor(Color.decode("#e8e8e8"));
        g.fillRect(20,41,40,149);

    }
}
