import java.security.SecureRandom;

public class Terning1 {
    public static void main(String[] args) {
        int antallKast = 60_000_000;
        int terning1 = 0;
        int terning2 = 0;
        int terning3 = 0;
        int terning4 = 0;
        int terning5 = 0;
        int terning6 = 0;
        int kast;
        SecureRandom tilfeldigTall = new SecureRandom();
        for (int i=0;i<antallKast;i++){
            kast = tilfeldigTall.nextInt(6);
            kast++;
            switch (kast) {
                case 1:
                    terning1++;
                    break;
                case 2:
                    terning2++;
                    break;
                case 3:
                    terning3++;
                    break;
                case 4:
                    terning4++;
                    break;
                case 5:
                    terning5++;
                    break;
                default:
                    terning6++;
                    break;
            }
        }
        String utStreng = "";
        utStreng += "Antall 1'ere er : "+terning1+"\n";
        utStreng += "Antall 2'ere er : "+terning2+"\n";
        utStreng += "Antall 3'ere er : "+terning3+"\n";
        utStreng += "Antall 4'ere er : "+terning4+"\n";
        utStreng += "Antall 5'ere er : "+terning5+"\n";
        utStreng += "Antall 6'ere er : "+terning6+"\n";
        System.out.println(utStreng);
    }
}