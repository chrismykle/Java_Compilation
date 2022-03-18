package oslomet.webprog;

public class Kunde {
    private int KId;
    private int PId;
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String postnr;
    private String telefonnr;
    private String epost;
    private String Volum;
    private String Vekt;

    public Kunde(int KId, int PId, String fornavn, String etternavn, String adresse, String postnr, String telefonnr, String epost, String volum, String vekt) {
        this.KId = KId;
        this.PId = PId;
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.postnr = postnr;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.Volum = volum;
        this.Vekt = vekt;
    }

    public Kunde() {
    }

    public int getKId() {
        return KId;
    }

    public void setKId(int KId) {
        this.KId = KId;
    }

    public int getPId() {
        return PId;
    }

    public void setPId(int PId) {
        this.PId = PId;
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

    public String getPostnr() {
        return postnr;
    }

    public void setPostnr(String postnr) {
        this.postnr = postnr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getEpost() {
        return epost;
    }

    public void setEpost(String epost) {
        this.epost = epost;
    }

    public String getVolum() {
        return Volum;
    }

    public void setVolum(String volum) {
        Volum = volum;
    }

    public String getVekt() {
        return Vekt;
    }

    public void setVekt(String vekt) {
        Vekt = vekt;
    }
}
