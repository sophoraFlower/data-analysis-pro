import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args) {
        // fill the staff array with three Employee objects
        var staff = new EmployeeB[3];

        staff[0] = new EmployeeB("Harry", 40000);
        staff[1] = new EmployeeB(60000);
        staff[2] = new EmployeeB();

        // print out information about all Employee objects
        for (EmployeeB e : staff)
            System.out.println("name=" + e.getName() + ",id=" + e.getId() + ",salary="
                    + e.getSalary());
    }
}

class EmployeeB {
    private static int nextId;

    private int id;
    private String name = ""; // instance field initialization
    private double salary;

    // static initialization block
    static {
        var generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialization block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors
    public EmployeeB(String n, double s) {
        name = n;
        salary = s;
    }

    public EmployeeB(double s) {
        // calls the Employee(String, double) constructor
        this("Employee #" + nextId, s);
    }

    // the default constructor
    public EmployeeB() {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initialized in initialization block
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}