 package KlasserOgObjekter;

 import javax.swing.*;


 class Person {
     public String navn;
     public String adresse;
     public String telefonnr;
     public int fodt;

     public int beregnAlder (){
         return 2020-fodt;
         }

     public void skrivUt(int beregnAlder) {
         String ut = navn+" med adressen "+adresse+" med telefonnummeret "+telefonnr+" er "+beregnAlder+" år";
         JOptionPane.showMessageDialog(null,ut);
        }
 }


public class Oppgave1 {
    public static void main (String[] args){
    Person  person1 = new Person();
    person1.navn = "Ole Olsen";
    person1.adresse = "Osloveien 82";
    person1.telefonnr = "48 675 645";
    person1.fodt = 1997;
    int beregnAlder = person1.beregnAlder();
    person1.skrivUt(beregnAlder);
    }
}

