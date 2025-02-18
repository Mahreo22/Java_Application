
package chapter10_assignment;

public class TestPayroll_12 {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];

        employees[0] = new SalaryEmployee("Peter", "Laycon", new Date(5, 12, 1990), 800.00);
        employees[1] = new CommissionEmployee("Philip", "Dean", new Date(8, 28, 1995), 10000.00, 0.06);

        int currentMonth = 5; // May

        for (Employee employee : employees) {
            System.out.println(employee.toString());

            if (employee.getBirthDate().getMonth() == currentMonth) {
                System.out.println("Birthday bonus: $100.00");
            }

            System.out.println("Earnings: $" + employee.earnings());
            System.out.println();
        }
    }

}
