

public class heltallsArray {
    public static void main(String[] args) {
        int[] Tall = {20, 34, -4, 4, 5, 11, -23};
            for (int tall : Tall) {
                System.out.print(tall + " ");
        }
        System.out.println();
        for(int i = Tall.length-1; i >= 0; i--){
            System.out.print(Tall[i]+" ");
        }
        System.out.println();
        int sum=0;
        int okerTall = 0;
        while (okerTall < Tall.length){
            sum += Tall[okerTall]; okerTall++;
        }
        System.out.println("Summen av tallene er "+sum);
        System.out.println();
        double gjennomSnitt = (double)sum/okerTall;
        System.out.println("Gjennomsnittet av tallene er "+gjennomSnitt);

        for(int tall : Tall){
            if (tall > 0 && tall < 21){
                System.out.print(tall + " ");
            }
        }
    }
}
