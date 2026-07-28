import java.util.*;
import java.util.stream.*;

public class SalaryTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of employees
        int N = sc.nextInt();

        // Read salaries into a list
        List<Integer> salaries = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            salaries.add(sc.nextInt());
        }

        // Transform salaries by increasing 10% using streams
        List<Integer> updatedSalaries = salaries.stream()
                .map(salary -> (int)(salary * 1.1)) // increase by 10%
                .collect(Collectors.toList());

        // Print updated salaries
        updatedSalaries.forEach(sal -> System.out.print(sal + " "));
    }
}
