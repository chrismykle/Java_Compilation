package Variabler2;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Main {

    public static void main(String[] args) {
	// write your code here
    String innFornavn = showInputDialog("Skriv inn fornavn:");
    String innEtternavn = showInputDialog("Skriv inn etternavn:");
    String innAlder = showInputDialog("Skriv inn alder:");
    String innAdresse = showInputDialog("Skriv inn adresse:");
    String innPoststed = showInputDialog("Skriv inn poststed:");
    String innPostnr = showInputDialog("Skriv inn postnummer");
    showInputDialog(null,"Fullt navn: "+innFornavn+" "+innEtternavn);

    String ut = "Navn: "+innFornavn+" "+innEtternavn+"\n"+"Alder: "+innAlder+"\n"+"Adresse: "+innAdresse+"\n"+"Poststed: "+innPoststed+"\n"+"Postnummer: "+innPostnr;
    System.out.println(ut);


    }
}
