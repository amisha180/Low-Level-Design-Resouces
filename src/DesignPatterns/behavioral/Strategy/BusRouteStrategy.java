package DesignPatterns.behavioral.Strategy;

public class BusRouteStrategy implements RouteStrategy{
    @Override
    public String buildRoute(String startpoint,String endpoint){
        return "Treavelling by bus from : "+startpoint+" to "+endpoint;
    }
}
