import java.text.DecimalFormat;

public class Person {
    private String navn;
    private String adresse;
    private String tlfnr;

    public Person(String navn, String adresse, String tlfnr){
        this.navn = navn;
        this.adresse = adresse;
        this.tlfnr = tlfnr;
    }

    private static double beregnAlder(double fodtselsAr){
        double alder = 2021 - fodtselsAr;
        return alder;
    }

    public static void main(String[] args) {
        Person nyPerson = new Person("Jonar Halburg","Bugesvei 23","45145214");
        Person nyPerson1 = new Person("Sigve Halburg", "Bugesvei 23","32145621");
        double fodtselsAr = 1997;
        double fodtselsAr1 = 1996;
        double alder = beregnAlder(fodtselsAr);
        double alder1 = beregnAlder(fodtselsAr1);
        DecimalFormat df2 = new DecimalFormat(".#");
        System.out.println("Alderen til "+nyPerson.navn+" er "+df2.format(alder)+". "+nyPerson.navn+" bor i "+nyPerson.adresse+" og har tlf nummeret "+nyPerson.tlfnr);
        System.out.println("Alderen til "+nyPerson1.navn+" er "+df2.format(alder1)+". "+nyPerson1.navn+" bor i "+nyPerson1.adresse+" og har tlf nummeret "+nyPerson1.tlfnr);
    }
}
