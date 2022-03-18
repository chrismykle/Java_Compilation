package Variabler2;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        /*  Oppgave 1
            String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din");
            int Alder1 = Integer.parseInt(innAlder);
            int sum = Alder1;

            JOptionPane.showMessageDialog(null,"Din alder er "+sum+" år.");
        */
        /* Oppgave 2 og 3
            String innTall1 = JOptionPane.showInputDialog("Skriv inn ett desimaltall");
            String innTall2 = JOptionPane.showInputDialog("Skriv inn ett desimaltall til");
            String innTall3 = JOptionPane.showInputDialog("Skriv inn ett siste desimaltall");

            double tall1 = Double.parseDouble(innTall1);
            double tall2 = Double.parseDouble(innTall2);
            double tall3 = Double.parseDouble(innTall3);
            double sum = (tall1+tall2+tall3)/3;

            JOptionPane.showMessageDialog(null,"Gjennomsnittet av tallene er "+sum);
            System.out.println("Gjennomsnittet av tallene er "+sum);
        */
            String innTall1 = JOptionPane.showInputDialog("Skriv inn ett desimaltall");
            String innTall2 = JOptionPane.showInputDialog("Skriv inn ett desimaltall til");
            String innTall3 = JOptionPane.showInputDialog("Skriv inn ett siste desimaltall");

            double tall1;
            try{
                tall1 = Double.parseDouble(innTall1);
            }
                catch (Exception e) {
                    tall1 = 0;
                    System.out.println(false);
                }
            double tall2;
            try{
               tall2 = Double.parseDouble(innTall2);
            }
                catch (Exception e) {
                    tall2 = 0;
                    System.out.println(false);
                }
            double tall3;
            try{
            tall3 = Double.parseDouble(innTall3);
            }
                catch (Exception e) {
                    tall3 = 0;
                    System.out.println(false);
                }
            double sum = (tall1+tall2+tall3)/3;

            JOptionPane.showMessageDialog(null,"Gjennomsnittet av tallene er "+sum);
            System.out.println("Gjennomsnittet av tallene er "+sum);
    }
}
