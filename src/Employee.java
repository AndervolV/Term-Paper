public class Employee {
    private String fullName;
    private int department, salary;
    private static int counter = 1;
    private final int id;

    public Employee(String fullName, int department, int salary) {
        this.id = counter;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        Employee otherEmployee = (Employee) other;
        return fullName.equals(otherEmployee.fullName) && department == otherEmployee.department;
    }

    @Override
    public int hashCode() {
        return 31 * fullName.hashCode() + department;
    }

    @Override
    public String toString() {
        return "id сотрудника " + counter++ + ". ФИО сотрудника: " + fullName + ", отдел № " + department + ". Оклад - " + salary + " руб.";

    }

    public static void printAllEmployees() {
        for (Employee employee : Main.employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

}
