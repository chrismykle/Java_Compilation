public class ArrayParameterMetode {


        private static int[] liste = {1,2,3,4,5};

        private static void skrivArray(int[] innListe){
            innListe[0]=200;
            for (int tall : innListe){
                System.out.print(tall+" ");
            }
        }

        public static void main(String[] args) {
            liste[1]=300;
            for (int tall : liste){
                System.out.print(tall+" ");
            }
            System.out.println();
            skrivArray(liste);
            System.out.println();
            for (int tall : liste){
                System.out.print(tall+" ");
            }
        }

    }

