package DesignPatterns.behavioral.Observer;

public class WeatherDisplay implements Observer {
    private String name;

    public WeatherDisplay(String name) {
        this.name = name;
    }
    @Override
    public void update(float temperature, float humidity ,float pressure){
        System.out.println(name + " received weather update: " +
                "Temperature = " + temperature +
                ", Humidity = " + humidity +
                ", Pressure = " + pressure);
    }
}
