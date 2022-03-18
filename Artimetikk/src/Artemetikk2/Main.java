package Artemetikk2;


import javax.swing.*;

public class Main {
    public static void main(String [] args) {

        String innNavn = JOptionPane.showInputDialog("Skriv inn navnet ditt: ");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen din: ");

        int tall1;
        try {
            tall1 = Integer.parseInt(innAlder);
        }
        catch (Exception e){
            tall1 = 0;
            JOptionPane.showMessageDialog(null, "Type your age");
        }
        int sum = tall1;
        int fodt = 2020 - sum;
        int pensjon = fodt + 67;
        JOptionPane.showMessageDialog(null,innNavn+" er  "+sum+" år. Personen er født i "+fodt+". I "+pensjon+" er personen "+67+" år og vil være pensjonist.");


    }
}
