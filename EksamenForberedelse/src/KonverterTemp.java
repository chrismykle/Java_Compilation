


class KonverterTemperatur{
    public static double tilCelsius(double innFahrenheit){
        return (innFahrenheit - 32) / 1.8;
    }
    public static double tilFahrenheiht(double innCelcius){
        return innCelcius * 1.8 + 32;
    }
}

public class KonverterTemp {
    public static void main (String [] args){
        double celisus = 28.6;
        System.out.println(celisus+" C blir "+
                KonverterTemperatur.tilFahrenheiht(celisus)+" F");
        double fahrenheit = 100.5;
        System.out.println(fahrenheit+" F blir "+
                KonverterTemperatur.tilCelsius(fahrenheit)+" C");
    }


}
