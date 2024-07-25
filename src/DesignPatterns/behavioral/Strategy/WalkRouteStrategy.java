package DesignPatterns.behavioral.Strategy;

public class WalkRouteStrategy implements RouteStrategy {
    @Override
    public String buildRoute(String startpoint,String endpoint){
        return "Treavelling by walking from : "+startpoint+" to "+endpoint;
    }
}
