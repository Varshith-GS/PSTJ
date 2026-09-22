import java.util.HashMap;

class UndergroundSystem {

    static class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    static class Route {
        int totalTime;
        int count;

        Route(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    HashMap<Integer, CheckIn> checkInMap;
    HashMap<String, Route> routeMap;

    public UndergroundSystem() {
        checkInMap = new HashMap<>();
        routeMap = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        checkInMap.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn checkIn = checkInMap.get(id);

        String route = checkIn.station + "->" + stationName;

        int travelTime = t - checkIn.time;

        if (routeMap.containsKey(route)) {
            Route r = routeMap.get(route);
            r.totalTime += travelTime;
            r.count++;
        } else {
            routeMap.put(route, new Route(travelTime, 1));
        }

        checkInMap.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "->" + endStation;

        Route r = routeMap.get(route);

        return (double) r.totalTime / r.count;
    }
}
