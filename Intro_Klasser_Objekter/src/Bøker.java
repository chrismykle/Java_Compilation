import javax.swing.*;
import java.awt.*;

public class Bøker {

    public static class bokInfo{

        private String tittel;
        private String pris;
        private String forfatter;
        private String ISBN_nummer;

        public void setTittel(String tittelen){
            tittel = tittelen;
        }
                public String hentTittel(){
                    return tittel;
        }
        public void setPris(String prisen){
            pris = prisen;
        }
                public String hentPris(){
                    return pris;
        }
        public void setForfatter(String forfatteren){
            forfatter = forfatteren;
        }
                public String hentForfatter(){
                    return forfatter;
        }
        public void setISBN_nummer(String ISBN_nummeret){
            ISBN_nummer = ISBN_nummeret;
        }
                public String hentISBN(){
                    return ISBN_nummer;
        }
    }

    public static void main(String[] args){
        bokInfo nyBok = new bokInfo();
        //nyBok.setTittel("Jomsviking");
            String bokTittel = JOptionPane.showInputDialog("Skriv inn tittel på boken: ");
        //nyBok.setPris("99");
            String bokPris = JOptionPane.showInputDialog("Skriv inn pris på boken: ");
        //nyBok.setForfatter("Bull Hansen");
            String bokForfatter = JOptionPane.showInputDialog("Skriv inn navnet på forfatter av boken: ");
        //nyBok.setISBN_nummer("123456789");
            String bokISBN = JOptionPane.showInputDialog("Skriv inn ISBN nummeret: ");
        //System.out.println("Tittelen på boken er "+bokTittel+", og er skrevet av "+bokForfatter+". Den selges for "+bokPris+
        //        "kr og har ISBN nummeret: "+bokISBN);
        JOptionPane.showMessageDialog(null,"Tittelen på boken er "+bokTittel+", og er skrevet av "+bokForfatter+". Den selges for "+bokPris+
                "kr og har ISBN nummeret: "+bokISBN);
    }
}

