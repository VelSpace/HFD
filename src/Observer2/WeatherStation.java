package Observer2;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay cDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(1, 2, 3f);
        weatherData.setMeasurements(4, 5, 6f);
        weatherData.setMeasurements(7, 8, 9f);
    }
}
