package Kontrollstrukturer;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class If_Switch {
    public static void main(String[] args) {
        double resultat=0;
        double tall1 = Double.parseDouble(showInputDialog("Skriv inn tall 1:"));
        String regneart = showInputDialog(" + , - , * , / ");
        double tall2 = Double.parseDouble(showInputDialog("Skriv inn tall 2:"));
        switch(regneart){
            case "+":
                resultat = tall1 + tall2;
                break;
            case "-":
                resultat = tall1 - tall2;
                break;
            case "*":
                resultat = tall1 * tall2;
                break;
            case "/":
                resultat = tall1 / tall2;
                break;
            default:
                resultat = 0;
                break;
        }
        showMessageDialog(null, "Resultat av regnestykket ble: "+tall1+" "+regneart+" "+tall2+" = "+resultat);
      /*
       if(regneart.equals("+")){
           resultat = tall1 + tall2;
       }
       if(regneart.equals("-")){
           resultat = tall1 - tall2;
       }
       if(regneart.equals("*")){
           resultat = tall1 * tall2;
       }
       if(regneart.equals("/")){
           resultat = tall1 / tall2;
       }
       showMessageDialog(null, "Resultat av regnestykket ble: "+tall1+" "+regneart+" "+tall2+" = "+resultat);
     */
    }

}

