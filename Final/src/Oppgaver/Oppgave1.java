package Oppgaver;

import javax.swing.*;

class ConvertTemp{
    public static double toCelsius(double inFahrenheit){
        return (inFahrenheit - 32) / 1.8;
    }
    public static double toFahrenheit(double inCelsius){

        return (inCelsius - 32) / 1.8;
    }
}

public class Oppgave1 {
    public static void main (String [] args){
        String inChoice = JOptionPane.showInputDialog(null,"Choose what to convert FROM, with either 0 for fahrenheit, or 1 for Celsius:");
        int Fahrenheit = Integer.parseInt(inChoice);
        if(Fahrenheit == 0) {
                    String input = JOptionPane.showInputDialog("Type in temperature in fahrenheit: ");
                    double fahrenheit;
                    fahrenheit = Double.parseDouble(input);
                    String strDouble = String.format("%.2f", fahrenheit);
                    JOptionPane.showMessageDialog(null,strDouble + " F is " +
                    ConvertTemp.toCelsius(fahrenheit) + " C");
        }
        int Celsius = Integer.parseInt(inChoice);
        if(Celsius == 1) {
                    String input = JOptionPane.showInputDialog("Type in temperature in Celsius: ");
                    double celsius;
                    celsius = Double.parseDouble(input);
                    String strDouble = String.format("%.2f", celsius);
                    JOptionPane.showMessageDialog(null,strDouble + " C is " +
                    ConvertTemp.toFahrenheit(celsius) + " F");
        }
    }
}