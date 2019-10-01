package H10;


import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10Opdracht5 extends Applet {

    double gemiddelde;
    double input1;
    double input2;
    double input3;
    double input4;
    double input5;

    String state;
    TextField tekstvakA;
    TextField tekstvakB;
    TextField tekstvakC;
    TextField tekstvakD;
    TextField tekstvakE;
    Button bereken;
    Button reset;

    public void init() {
        tekstvakA = new TextField(4);
        tekstvakB = new TextField(4);
        tekstvakC = new TextField(4);
        tekstvakD = new TextField(4);
        tekstvakE = new TextField(4);

        add(tekstvakA);
        add(tekstvakB);
        add(tekstvakC);
        add(tekstvakD);
        add(tekstvakE);

        bereken = new Button("bereken");
        bereken.addActionListener(new ButtonListener());
        reset = new Button("reset");
        reset.addActionListener(new ButtonListener());
        add(bereken);
        add(reset);
    }

    public void paint(Graphics g) {
        g.drawString("Het gemiddelde is: " + gemiddelde + " dus de leerling is " + state, 50, 50);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = Double.valueOf(tekstvakA.getText());
            input2 = Double.valueOf(tekstvakB.getText());
            input3 = Double.valueOf(tekstvakC.getText());
            input4 = Double.valueOf(tekstvakD.getText());
            input5 = Double.valueOf(tekstvakE.getText());
            gemiddelde = (input1 + input2 + input3 + input4 + input5) / 5;

            if (gemiddelde > 5.5) {
                state = "Geslaagd";
            }
            else {
                state = "Gezakt";
            }
            repaint();
        }
    }

    class ResetButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input1 = 0;
            input2 = 0;
            input3 = 0;
            input4 = 0;
            input5 = 0;
            gemiddelde = 0;
           repaint();
        }
    }
}