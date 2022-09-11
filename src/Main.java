import java.util.Arrays;

public class Main {

static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

        Employee emp1 = new Employee("Василий", "Иванович", "Иванов", 1, 112001);
        Employee emp2 = new Employee("Андрей", "Иванович", "Иванов", 2, 112000);
        Employee emp3 = new Employee("Сергей", "Иванович", "Иванов", 3, 10200);

        employees[0] = emp1;
        employees[1] = emp2;
        employees[2] = emp3;
        Employee[] emp = Arrays.copyOf(employees, 11);

        Arrays.stream(emp).forEach(System.out::println);
        System.out.println(emp.length);
    }
    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeeWitMinSalary() {
        Employee result = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static Employee findEmployeeWitMaxSalary() {
        Employee result = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }
    public static float calculateAverageSalary() {
        float calculateTotalSalary = 0;
        return (calculateTotalSalary / (float) employees.length);
    }
    public static void printFullNames() {
        for (Employee employee : employees) {
            System.out.println(employee.getLastName());
        }
    }
}