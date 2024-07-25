package DesignPatterns.behavioral.Strategy;

public class BikeRouteStrategy implements RouteStrategy{
    @Override
    public String buildRoute(String startpoint,String endpoint){
        return "Treavelling by bike from : "+startpoint+" to "+endpoint;
    }
}
