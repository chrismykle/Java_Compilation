package Oppgaver;

import java.util.ArrayList;

class Person{
    private String navn;
    private String personnummer;
    private int alder;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }


    public Person(String navn, String personnummer, int alder) {
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    public String toString() {
        return navn +
                personnummer +
                alder;
    }
}
/*
    <Skriv en toString() metode>*/

class Pasient extends Person{
    private String diagnose;

    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

/* <Skriv en konstruktør>
    <Skriv en toString() metode>*/
}
class Lege extends Person{

    public Pasient[] pasientliste = new Pasient[100];

    public Lege(String navn, String personnummer, int alder, Pasient[] pasientliste) {
        super(navn, personnummer, alder);
        this.pasientliste = pasientliste;
    }




/*
    <Opprett et pasient-array med 100 plasser>
     <Opprett en konstruktør>
     <Skriv en toString() metode>*/
}
public class Main {
        public static void main(String[] args) {

            Pasient[1] = new Pasient();
            Pasient[1].setNavn("Pål");
            Pasient[1].setPersonnummer("14321678");



            /*

            <Opprett to pasienter med deres egne diagnoser>

            <Opprett en lege>
            <Legg de to pasientene inn i legens pasient-array>

            <Skriv ut alle dataene på System.out.print ved hjelp av lege-objektet>*/
        }
}