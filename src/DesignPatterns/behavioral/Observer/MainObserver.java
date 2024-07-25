package DesignPatterns.behavioral.Observer;

import javax.security.auth.Subject;

public class MainObserver {
    public static void main(String[] args) {
        WeatherStation weatherstation = new WeatherStation();
        WeatherDisplay currdisplay = new WeatherDisplay("current ");
        WeatherDisplay forecastdisplay = new WeatherDisplay("forecast ");

        weatherstation.addSubscriber(currdisplay);
        weatherstation.addSubscriber(forecastdisplay);

        weatherstation.updateWeather(32.0f,67.8f,87.9f);
        weatherstation.updateWeather(23.0f,80.8f,46.9f);
    }
}
