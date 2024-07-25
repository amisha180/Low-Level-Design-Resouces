package DesignPatterns.behavioral.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        String startingpoint = "Marathalli";
        String endpoint = "Aecs Layout";

        RouteStrategy strategy ;
        Navigator navigator = new Navigator(new BusRouteStrategy());
        System.out.println(navigator.buildRoute(startingpoint,endpoint));

        navigator.setRouteStrategy(new BikeRouteStrategy());
        System.out.println(navigator.buildRoute(startingpoint,endpoint));

        navigator.setRouteStrategy(new WalkRouteStrategy());
        System.out.println(navigator.buildRoute(startingpoint, endpoint));

    }
}
