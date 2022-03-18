package bank1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Konto sparekonto = new Konto("12345678901", "Per Hansen", 1000);
        Konto lonnskonto = new Konto("12345678901", "Per Hansen", 0);
        sparekonto.setSalod(2000);
        lonnskonto.setSalod(1000);
        System.out.println("Sparekontoen tilhører "+sparekonto.getNavn());
        System.out.println("Saloden til denne er nå "+sparekonto.getSalod()+" kr");
        System.out.println("Saldoen til lonnskontoen er nå "+lonnskonto.getSalod()+" kr");
    }
}
