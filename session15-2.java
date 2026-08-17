import java.util.*;

class Student {

    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }
}

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            students.add(new Student(id, name, cgpa));
        }

        students.sort((a, b) -> {

            int cgpaCompare = Double.compare(b.getCgpa(), a.getCgpa());

            if (cgpaCompare != 0) {
                return cgpaCompare;
            }

            int nameCompare = a.getName().compareTo(b.getName());

            if (nameCompare != 0) {
                return nameCompare;
            }

            return Integer.compare(a.getId(), b.getId());
        });

        for (Student student : students) {
            System.out.println(student.getName());
        }

        sc.close();
    }
}
