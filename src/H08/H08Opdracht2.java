package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08Opdracht2 extends Applet {

    Button knop1;
    Button knop2;
    Button knop3;
    Button knop4;
    Button knop5;
    Label label;

    int mannen;
    int vrouwen;
    int mannelijkestudenten;
    int vrouwelijkestudenten;
    int totaalaantal;

    public void init() {

        knop1 = new Button("Mannen");
        knop2 = new Button("Vrouwen");
        knop3 = new Button("Mannelijke studenten");
        knop4 = new Button("Vrouwelijke studenten");
        knop5 = new Button("reset");
        knop5.addActionListener(new ResetButtonListener());
        knop4.addActionListener(new knop4Listener());
        knop3.addActionListener(new knop3Listener());
        knop2.addActionListener(new knop2Listener());
        knop1.addActionListener(new Knop1Listener());
        totaalaantal = mannelijkestudenten + vrouwelijkestudenten + mannen +vrouwen;


        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        add(knop5);

    }

    public void paint(Graphics g) {

        g.drawString("Totaal aantal = " + totaalaantal, 50, 270);
        g.drawString("Mannen = " + mannen, 50, 100);
        g.drawString("Vrouwen = " + vrouwen, 50, 130);
        g.drawString("Mannelijke studenten = " + mannelijkestudenten, 50, 160);
        g.drawString("Vrouwelijke studenten = " + vrouwelijkestudenten, 50, 190);


    }

    public void repaint() {
        super.repaint();
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            mannen++;
            totaalaantal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
            repaint();
        }
    }

    class knop2Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {

            vrouwen++;
            totaalaantal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
            repaint();
        }
    }


    class knop3Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            mannelijkestudenten++;
            totaalaantal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
            repaint();
        }
    }


    class knop4Listener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {


            vrouwelijkestudenten++;
            totaalaantal = mannelijkestudenten + vrouwelijkestudenten + mannen + vrouwen;
            repaint();
        }
    }


    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            mannelijkestudenten = 0;
            vrouwelijkestudenten = 0;
            mannen = 0;
            vrouwen = 0;
            totaalaantal = 0;
            repaint();
        }
    }
}
