package KlasserOgObjekter;

import javax.swing.*;

class Bøker {
    String tittel;
    double innPris;
    String forfatter;
    String IBSN_nummer;

    void skrivUt() {
    String ut =tittel+" er skrevet av "+forfatter+", og blir gitt ut for "+innPris+" kr. IBSN-nummeret er "+IBSN_nummer+".";

    JOptionPane.showMessageDialog(null, ut);
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        Bøker   bok1 = new Bøker();
        String tittel = JOptionPane.showInputDialog("Skriv inn tittelen på boken: ");
        String innPris = JOptionPane.showInputDialog("Skriv in prisen på boken: ");
        String forfatter = JOptionPane.showInputDialog("Skriv inn navnet på forfatteren: ");
        String IBSN_nummer = JOptionPane.showInputDialog("Skriv inn IBSN nummeret: ");
        double pris = Double.parseDouble(innPris);
        bok1.tittel = tittel;
        bok1.innPris = pris;
        bok1.forfatter = forfatter;
        bok1.IBSN_nummer = IBSN_nummer;
        bok1.skrivUt();

    }
}
