package DesignPatterns.behavioral.Strategy;

public class Navigator {
    RouteStrategy routeStrategy;
    public Navigator(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }
    public String buildRoute(String startPoint, String endPoint){
        return routeStrategy.buildRoute(startPoint,endPoint);
    }
}
