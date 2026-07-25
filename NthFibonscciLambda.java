import java.util.stream.Stream;

public class NthFibonacciLambda {
    public static void main(String[] args) {
        int n = 5; 
        int nthFib = Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                           .limit(n)              
                           .map(f -> f[0])        
                           .reduce((first, second) -> second) // Get the last element
                           .orElse(0);

        System.out.println(n + "th Fibonacci number: " + nthFib);
    }
}
