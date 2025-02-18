
package chapter10_assignment;

public class Employeetest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new SalaryEmployee("John", "Doe", new Date(5, 12, 1990), 800.00);
        employees[1] = new CommissionEmployee("Jane", "Doe", new Date(8, 28, 1995), 10000.00, 0.06);
        employees[2] = new PieceWorker("Bob", "Smith", new Date(10, 15, 1980), 0.50, 200);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Earnings: $" + employee.earnings());
            System.out.println();
        }
    }

}
