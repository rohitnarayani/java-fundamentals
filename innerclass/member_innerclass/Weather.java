package innerclass.member_innerclass;

public class Weather {
    private double temperatureInCelcius;
    
    Weather(double temp){
        this.temperatureInCelcius = temp;
    }

    class Converter{
        public void toFahrenheit(){
            double f = (temperatureInCelcius * 9/5) + 32;
            System.out.println("Fahrenheit: "+f);
        }

        public void toKelvin(){
            double k = temperatureInCelcius + 273.5;
            System.out.println("Kelvin: "+k);
        }
    }
}
