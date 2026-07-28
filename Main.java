import java.util.*;
import java.util.stream.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        // Store sensor readings
        List<Map.Entry<String, Integer>> readings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String sensorId = sc.next();
            int temperature = sc.nextInt();
            readings.add(new AbstractMap.SimpleEntry<>(sensorId, temperature));
        }

        // Filter, Group, Average, Sort
        Map<String, Double> result = readings.stream()
                .filter(r -> r.getValue() > 50)
                .collect(Collectors.groupingBy(
                        Map.Entry::getKey,
                        Collectors.averagingInt(Map.Entry::getValue)
                ));

        result.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));

        sc.close();
    }
}