import javax.swing.*;


public class BmiInput {
    public static void main (String [] args){
        String innVekt = JOptionPane.showInputDialog("Skriv inn vekten din");
        String innHoyde =JOptionPane.showInputDialog("Skriv inn høyden din");
        double vekt = Double.parseDouble(innVekt);
        double hoyde = Double.parseDouble(innHoyde);
        if (vekt < 0){
            JOptionPane.showMessageDialog(null,"Skriv inn et positivt tall");
        }
        else if (hoyde < 0){
            JOptionPane.showMessageDialog(null,"Skriv inn et positivt tall");
        }
        else {
            double resultat = (vekt * 1.3) / (Math.pow(hoyde / 100, 2.5));
            JOptionPane.showMessageDialog(null,"BMIen din er: "+resultat);
        }
    }
}
