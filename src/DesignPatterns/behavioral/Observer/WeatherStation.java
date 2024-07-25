package DesignPatterns.behavioral.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Subject class
public class WeatherStation {
    List<Observer> list = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    public void addSubscriber(Observer observer){
        list.add(observer);
    }
    public void removeSubscriber(Observer observer){
        list.remove(observer);
    }
    public void updateWeather(float temperature,float humidity,float pressure){
        this.temperature=temperature;
        this.humidity=humidity;
        this.pressure=pressure;
        notifySubscribers();
    }
    private void notifySubscribers(){
        for (Observer ob : list){
            ob.update(temperature,humidity,pressure);
        }
    }


}
