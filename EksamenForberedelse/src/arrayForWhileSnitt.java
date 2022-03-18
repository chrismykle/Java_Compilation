

// 2020 KONT Oppgave 1 a-b-c

public class arrayForWhileSnitt {
    public static void main(String[] args){
        int [] liste = {1,3,6,2,7,10,23,6,3,6};
        for (int tall:liste) {
            System.out.print(tall+" ");
        }
        System.out.println();
        for(int i=liste.length-1; i>=0; i--){
            System.out.print(liste[i]+" ");
        }
        int sum=0;
        int teller = 0;
        while (teller <liste.length){
            sum+=liste[teller];
            teller++;
        }
        double snitt = (double)sum/teller;
        System.out.println();
        System.out.println("Snittet er "+snitt);
    }

}

