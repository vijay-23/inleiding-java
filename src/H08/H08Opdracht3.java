package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08Opdracht3 extends Applet {

    TextField tekstvak;
    Button knop;
    Button knop2;
    Label label;

    double bedragonafgerond;
    double bedragx10;
    int bedragint;
    double bedrag;

    public void init() {
        label = new Label("Vul het gewenste bedrag in:");
        add(label);
        tekstvak = new TextField("", 30);

        knop = new Button("bereken");
        knop2 = new Button("reset");
        knop2.addActionListener(new H08Opdracht3.ResetButtonListener());
        knop.addActionListener(new H08Opdracht3.KnopListener());
        add(tekstvak);
        add(knop);
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("" + bedrag, 50, 100);
    }

    public void repaint() {
        super.repaint();
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bedragonafgerond = Double.valueOf(tekstvak.getText());

            bedragonafgerond = bedragonafgerond * 1.21;

            bedragx10 = bedragonafgerond * 10;
            bedragint = (int) bedragx10;
            bedrag = (double) bedragint / 10;
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            tekstvak.setText("");
            bedrag = 0;
            repaint();
        }
    }
}