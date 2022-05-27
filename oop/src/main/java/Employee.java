import java.time.LocalDate;
import java.util.Objects;

public class Employee {

    private String name;
    private double salary;
    private LocalDate hireDay;
    private final String position;

    public Employee(String n, double s, int year, int month, int day, String position) {
        this.position = position;
        Objects.requireNonNull(n, "The name cannot be null");
        this.name = n;
        this.salary = s;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getPosition() {
        return position;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
