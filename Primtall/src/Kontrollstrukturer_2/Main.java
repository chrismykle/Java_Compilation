package Kontrollstrukturer_2;

public class Main {

    public static void main(String[] args) {
        int n = 50;
        int i = 1;
        while(i <= n) {
            int c=0;
            for(int j=1;j<=i;j++) {
                if( i % j == 0) { // Modulus = 0, rest = 0
                    c++; // Sjekk neste teller
                }
            }
            if(c==2) {
                System.out.println(""+i);
            }
            i++;
        }
    }
}