package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10Opdracht3 extends Applet {

    TextField tekstvak;
    int maand;
    int dagen;
    String maandnaam;
    Label label;

    public void init() {
    tekstvak = new TextField(10);
    tekstvak.addActionListener(new TextListener());
    label = new Label("Type het maandnummer en druk op enter:");
    add(label);
    add(tekstvak);
    }

    public void paint(Graphics g) {
        g.drawString(" De maand "+ maandnaam +" heeft " + dagen + " dagen." ,40,100);
    }

    class TextListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            maand = Integer.valueOf(tekstvak.getText());
            switch (maand){
                case 1:
                    maandnaam = "januari";
                    dagen = 31;
                    break;
                case 2:
                    maandnaam = "februari";
                    dagen = 28;
                    break;
                case 3:
                    maandnaam = "maart";
                    dagen = 31;
                    break;
                case 4:
                    maandnaam = "april";
                    dagen = 30;
                    break;
                case 5:
                    maandnaam = "mei";
                    dagen = 31;
                    break;
                case 6:
                    maandnaam = "juni";
                    dagen = 30;
                    break;
                case 7:
                    maandnaam = "juli";
                    dagen = 31;
                    break;
                case 8:
                    maandnaam = "augustus";
                    dagen = 31;
                    break;
                case 9:
                    maandnaam = "september";
                    dagen = 30;
                    break;
                case 10:
                    maandnaam = "oktober";
                    dagen = 31;
                    break;
                case 11:
                    maandnaam = "november";
                    dagen = 30;
                    break;
                case 12:
                    maandnaam = "december";
                    dagen = 31;
                    break;
                default:
                    maandnaam = "0";
                    dagen = 0;
                    break;
            }
            repaint();
        }
    }
}