package Observer2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private Observable weatherData;
    public CurrentConditionDisplay(Observable weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("Current conditions: "+ temperature + "F degrees ans "+humidity+"% humidity");
    }

    @Override
    public void update(Observable o, Object arg) {
        // TODO Auto-generated method stub
        if(o instanceof WeatherData){
            WeatherData obj = (WeatherData)o;
            this.temperature = obj.getTemperature();
            this.humidity = obj.getHumidity();
            display();
        }
    }
    
}

