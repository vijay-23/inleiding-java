package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H08PraktijkOpdracht extends Applet {

        TextField tekstvak1;
        TextField tekstvak2;

        Button plus;
        Button delen;
        Button min;
        Button keer;
        Button knop5;
        Label label;
        double invoer1, invoer2;

        double antwoord;
        double input1;
        double input2;

        public void init() {


            tekstvak1 = new TextField("", 5);
            tekstvak2 = new TextField("", 5);
            plus = new Button("+");
            min = new Button("-");
            delen = new Button("/");
            keer = new Button("*");
            knop5 = new Button("reset");
            knop5.addActionListener(new ResetButtonListener());
            keer.addActionListener(new keerListener());
            delen.addActionListener(new delenListener());
            min.addActionListener(new minListener());
            plus.addActionListener(new plusListener());


            add(tekstvak1);
            add(tekstvak2);
            add(plus);
            add(min);
            add(delen);
            add(keer);
            add(knop5);


        }
    public void paint(Graphics g) {

        }


        class plusListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {

                input1 = Double.valueOf(tekstvak1.getText());
                input2 = Double.valueOf(tekstvak2.getText());

                antwoord = input1 + input2;

                tekstvak1.setText("" + antwoord);
                tekstvak2.setText("");

                repaint();
            }
        }

        class minListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                input1 = Double.valueOf(tekstvak1.getText());
                input2 = Double.valueOf(tekstvak2.getText());

                antwoord = input1 - input2;

                tekstvak1.setText("" + antwoord);
                tekstvak2.setText("");
                repaint();
            }
        }


        class delenListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                input1 = Double.valueOf(tekstvak1.getText());
                input2 = Double.valueOf(tekstvak2.getText());

                antwoord = input1 / input2;

                tekstvak1.setText("" + antwoord);
                tekstvak2.setText("");

                repaint();
            }
        }


        class keerListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                input1 = Double.valueOf(tekstvak1.getText());
                input2 = Double.valueOf(tekstvak2.getText());

                antwoord = input1 * input2;

                tekstvak1.setText("" + antwoord);
                tekstvak2.setText("");



                repaint();
            }
        }


        class ResetButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                input1= 0;
                input2= 0;

                antwoord = 0;

                tekstvak1.setText("");
                tekstvak2.setText(" ");


                repaint();
            }
        }
    }
