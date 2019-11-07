package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H10Opdracht4 extends Applet {
    TextField tekstvak;
    int maand;
    int dagen;
    int jaartal;
    String maandnaam;
    String dingetje;
    Label label;
    TextField tekstvak2;
    String tekst2;

    public void init() {
        tekstvak2 = new TextField(4);
        tekstvak2.addActionListener(new TextListener());
        tekstvak = new TextField(10);
        tekstvak.addActionListener(new TextListener());
        label = new Label("Vul het jaartal en maandnummer in:");
        add(label);
        add(tekstvak2);
        add(tekstvak);
        tekst2 = "";
    }

    public void paint(Graphics g) {
        g.drawString(" De maand "+ maandnaam +" van het jaar " + jaartal +" heeft "+ dagen + " dagen." ,40,80);
        g.drawString(tekst2, 70, 100 );
    }

    class TextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            maand = Integer.valueOf(tekstvak.getText());
            switch (maand){
                case 1:
                    maandnaam = "januari";
                    dagen = 31;
                    break;
                case 2:

                    dingetje = tekstvak2.getText();
                    jaartal = Integer.parseInt(dingetje);
                    if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                            jaartal % 400 == 0) {
                        maandnaam = "februari";
                        dagen = 29;
                    } else {
                        maandnaam = "februari";
                        dagen = 28;
                    }
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