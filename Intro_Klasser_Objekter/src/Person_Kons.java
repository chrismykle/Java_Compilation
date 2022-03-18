import javax.swing.*;
import java.awt.*;

public class Person_Kons {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person_Kons(String fornavn, String etternavn, String adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public void skrivUt(){
        String ut = "Navn : "+fornavn+" "+etternavn+"\n"+
                "Adresse : "+adresse+"\n"+
                "Telefonnummer : "+telefonnr;
        JOptionPane.showMessageDialog(null,ut);
    }

    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String etternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String adresse = JOptionPane.showInputDialog("Skriv inn adressen");
        String telefonnr = JOptionPane.showInputDialog("Skriv inn telefonnummeret");
        Person_Kons nyPerson = new Person_Kons(fornavn,etternavn,adresse,telefonnr);
        nyPerson.skrivUt();

    }


}
