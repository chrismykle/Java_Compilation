package KlasserOgObjekter;

class Kalkulator {
    public static double addere(double tall1, double tall2) {
        double sum = tall1 + tall2;
        return sum;

    }
    public static double subtrahere(double tall1, double tall2) {
        double sum = tall1 - tall2;
        return sum;

    }
    public static double multiplisere(double tall1, double tall2) {
        double sum = tall1 * tall2;
        return sum;

    }
    public static double dividere(double tall1, double tall2) {
        double sum = tall1 / tall2;
        return sum;

    }
}


public class Regnestykke {
    public static void  main (String [] args) {
        System.out.println("2+2 er "+Kalkulator.addere(2,2));
        System.out.println("2-2 er "+Kalkulator.subtrahere(2,2));
        System.out.println("2*2 er "+Kalkulator.multiplisere(2,2));
        System.out.println("2/2 er "+Kalkulator.dividere(2,2));
    }

}

