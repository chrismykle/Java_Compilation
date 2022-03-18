package Variabler2;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String innTall1 = JOptionPane.showInputDialog("Skriv inn ett desimaltall:");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn ett desimaltall til:");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn et siste desimaltall");
        double tall1;
        try {
            tall1 = Double.parseDouble(innTall1);
        }
        catch (Exception e){
            tall1 = 0;
            System.out.println("Failed to type a number");
            JOptionPane.showMessageDialog(null,"Type a number");
        }
        double tall2;
        try {
            tall2 = Double.parseDouble(innTall2);
        }
        catch (Exception e){
            tall2 = 0;
            System.out.println("Failed to type a number");
            JOptionPane.showMessageDialog(null,"Type a number");
        }
        double tall3;
        try {
            tall3 = Double.parseDouble(innTall3);
        }
        catch (Exception e) {
            tall3 = 0;
            System.out.println("Failed to type number");
            JOptionPane.showMessageDialog(null, "Type a number");
        }
        double sum = tall1 + tall2 + tall3;
        double gjennomsnitt = sum / 3;

        // Sum:
        // int tall1 = Integer.parseInt(innStreng1);
        // int tall2 = Integer.parseInt(innStreng2);
        // int sum = tall1 + tall2;

        System.out.println("Gjennomsnittet av de tre tallene er "+gjennomsnitt);
        JOptionPane.showMessageDialog(null, "Gjennomsnittet er = "+gjennomsnitt);
    }
}
