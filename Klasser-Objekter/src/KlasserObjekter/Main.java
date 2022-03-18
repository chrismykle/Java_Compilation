package KlasserObjekter;

class Bil{
    private String farge;

    public void settFarge(String fargen){
        farge = fargen;
    }
    public String hentFarge(){
        return farge;
    }
}

public class Main {
    public static void main(String[] args) {
        Bil nyBil = new Bil();
        nyBil.settFarge("blå");
        String bilFargen = nyBil.hentFarge();
        System.out.println("Fargen til bilen er "+bilFargen);
    }
}