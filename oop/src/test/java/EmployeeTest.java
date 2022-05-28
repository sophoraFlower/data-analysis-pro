import java.time.LocalDate;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("张三",15000d, 2020, 10, 01, "员工");
        staff[1] = new Employee("李四",10000d, 2020, 10, 01, "主管");
        staff[2] = new Employee("王五",12000d, 2020, 10, 01, "老板");

        for (Employee e: staff
             ) {
            System.out.println("name=" + e.getName()
            + ",salary=" + e.getSalary()
            + ",hireDay=" + e.getHireDay()
            + ",position=" + e.getPosition());
        }

        var harry = new Employee("harry",12000d, 2020, 10, 01, "项目经理");
        System.out.println(harry.getClass());  // class Employee
        LocalDate d = harry.getHireDay();
        System.out.println(d);

        int n = Employee.getNextId();
        System.out.println(n);
    }
}
