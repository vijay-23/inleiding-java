package Challenge1;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class staafdiagram extends Applet {

    //DECLARATIE.
    int gewichtValerie;
    int gewichtJeroen;
    int gewichtHans;
    int hoogteXas;
    int getal1;
    int getal2;
    int getal3;
    TextField textField1;
    TextField textField2;
    TextField textField3;
    Button toon;
    Label valerie;
    Label jeroen;
    Label hans;


    public void init() {
        //INITIALISATIE.
        gewichtValerie = 0;
        gewichtJeroen = 0;
        gewichtHans = 0;
        hoogteXas = 0;

        toon = new Button("toon");
        toon.addActionListener(new toonListener());
        valerie = new Label("Valerie");
        jeroen = new Label("Jeroen");
        hans = new Label("Hans");
        textField1 = new TextField("", 30);
        textField2 = new TextField("", 30);
        textField3 = new TextField("", 30);
        add(valerie);
        add(textField1);
        add(jeroen);
        add(textField2);
        add(hans);
        add(textField3);
        add(toon);

    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(60,30,60,hoogteXas);
        g.drawLine(60,hoogteXas,300,hoogteXas);


        //Gegevens van staven
        g.setColor(Color.red);
        //g.fillRect(61, gewichtValerie, 75, 30);
        g.fillRect(61, hoogteXas - 2* gewichtValerie, 75,2*gewichtValerie);

        g.setColor(Color.blue);
        //g.fillRect(136,gewichtJeroen,75,175);
        g.fillRect(136, hoogteXas - 2* gewichtJeroen, 75,2* gewichtJeroen);

        g.setColor(Color.orange);
        //g.fillRect(211,gewichtHans,75,140);
        g.fillRect(211, hoogteXas - 2* gewichtHans, 75, 2* gewichtHans);

        g.setColor(Color.black);
        g.drawString("Valerie", 76,262);

        g.setColor(Color.black);
        g.drawString("Jeroen",156,262);

        g.setColor(Color.black);
        g.drawString("Hans",231,262);

        g.setColor(Color.black);
        g.drawString("0",50,255);
        g.drawString("20",42,215);
        g.drawString("40", 42, 175);
        g.drawString("60",42,135);
        g.drawString("80",42,95);
        g.drawString("100",36,55);
    }

    class toonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal1 = Integer.valueOf(textField1.getText());
            getal2 = Integer.valueOf(textField2.getText());
            getal3 = Integer.valueOf(textField3.getText());
            repaint();
        }
    }
}