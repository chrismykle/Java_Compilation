package bank1;

public class Konto {
    private String personnummer;
    private String navn;
    private double salod;

    public Konto(String personnummer, String navn, double salod) {
        this.personnummer = personnummer;
        this.navn = navn;
        this.salod = salod;
    }

    public String getPersonnummer() {
        return personnummer;
    }

    public void setPersonnummer(String personnummer) {
        this.personnummer = personnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public double getSalod() {
        return salod;
    }

    public void setSalod(double salod) {
        this.salod = salod;
    }
}
