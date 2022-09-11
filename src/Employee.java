public class Employee {
    private static int counter = 9;
    private Integer id;
    private String name;
    private String lastName;
    private String middleName;
    private int department;
    private int salary;

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;


    }

    public Employee(String name, String lastname, String middleName, int department, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;

    }
}
