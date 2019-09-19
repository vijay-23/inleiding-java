package H08;

import com.sun.org.glassfish.external.statistics.annotations.Reset;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H08Opdracht1 extends Applet {
    TextField tekstvak;
    Button knop;
    Button knop2;
    Label label;

    public void init() {
        label = new Label("type hier:");
        add(label);
        tekstvak = new TextField("", 30);

        knop = new Button("Ok");
        knop2 = new Button("reset");
        knop2.addActionListener(new ResetButtonListener());
        knop.addActionListener(new KnopListener());
        add(tekstvak);
        add(knop);
        add(knop2);


    }

    public void paint(Graphics g) {
        g.drawString("Type hier " + "en klik op Ok", 50, 60);
    }

    public void repaint() {
        super.repaint();
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("mooi man ");
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            repaint();
        }
    }
}
