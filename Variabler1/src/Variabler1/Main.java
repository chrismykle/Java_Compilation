package Variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {

        String navn,adresse;
        navn = "Christian Myklebust";
        adresse = "Professor Dahls gate 5";
        String postAdresse = "Oslo";
        String postNr = "0355";
        System.out.println("Navnet er "+navn);
        System.out.println("Adressen er "+adresse+" "+postNr+" "+postAdresse);

        String innNavn = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnummer");
        String innPostAdresse = showInputDialog("Skriv inn postadressen");
        showMessageDialog(null,innNavn+" har adressen "+innAdresse+" "+innPostAdresse);

        String ut = "Navnet: "+innNavn+"\n"+"Adresse: "+innAdresse+" "+innPostNr+" "+innPostAdresse;
        showInputDialog(null,ut);
    }
}

