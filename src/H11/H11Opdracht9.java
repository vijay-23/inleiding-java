package H11;

import java.applet.Applet;
import java.awt.*;

public class H11Opdracht9 extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int x = 50;
        int y = 50;
        int width = 50;
        int height = 50;

        for (int column= 0; column < 8; column++) {
            g.drawRect(x,y,width,height);

            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.black);
                g.fillRect(x,y,width,height);
            } else {
                g.setColor(Color.white);

            }
            x += width;}

        //tweede rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 ||column == 4 || column == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //derde rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //vierde rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //vijfde rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //6de rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //7de rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.black);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.white);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
        //8ste rij//
        x = 50;
        y += height;

        for (int column=0; column < 8; column++) {
            if (column == 0 || column == 2 || column == 4 || column == 6) {
                g.setColor(Color.white);
                g.fillRect(x, y, width, height);
            } else {
                g.setColor(Color.black);
                g.fillRect(x,y,width,height);
            }
            x += width;
        }
    }
}
