package innerclass.member_innerclass;

public class WeatherTest {
    public static void main(String []args){
        Weather weather = new Weather(42.8);
        Weather.Converter converter = weather.new Converter();
        converter.toFahrenheit();
        converter.toKelvin();
    }
}
