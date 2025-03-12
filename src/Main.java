public class Main {
    public static Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        employees[0] = new Employee("Казимир Несторович Фандорин", 1, 200000);
        employees[1] = new Employee("Рузвельт Франклин Делано", 2, 300000);
        employees[2] = new Employee("Петр Алексеевич Романов", 2, 300000);
        employees[3] = new Employee("Николаевич Александрович Романов", 2, 300000);
        employees[4] = new Employee("Николаевич Александрович Романов", 2, 300000);
        employees[5] = new Employee("Олух Распутин Романовых", 3, 50000);
        employees[6] = new Employee("Василиса Прекрасная Карамзина", 4, 50000);
        employees[7] = new Employee("Андрей Олегович Злобин", 3, 50000);
        employees[8] = new Employee("Лидия Федосеева Шукшина", 5, 50000);
        employees[9] = new Employee("Федор Иванович Шаляпин", 5, 50000);

        printAllEmployees();
        System.out.println("Сумма затрат на ЗП в месяц: " + calculateTotalSalary() + " руб.");
        findEmployeeWithMinSalary();
        findEmployeeWithMaxSalary();
        System.out.println("Средняя зарплата: " + calculateAverageSalary() + " руб.");
        printAllFullNames();
    }
    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }
    public static int calculateTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
            }
        }
        return totalSalary;
    }
    public static void findEmployeeWithMinSalary() {
        int minimumSalary = Integer.MAX_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < minimumSalary) {
                minimumSalary = employee.getSalary();
            }
        }
        System.out.println("Сотрудники с минимальной зарплатой (" + minimumSalary + " руб.):");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() == minimumSalary) {
                System.out.println(employee.getFullName() + " " + employee.getSalary() + " руб.");
            }
        }
    }
    public static void findEmployeeWithMaxSalary() {
        int maximumSalary = Integer.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maximumSalary) {
                maximumSalary = employee.getSalary();
            }
        }
        System.out.println("Сотрудники с максимальной зарплатой (" + maximumSalary + " руб.):");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() == maximumSalary) {
                System.out.println(employee.getFullName() + " " + employee.getSalary() + " руб.");
            }
        }
    }
    public static double calculateAverageSalary() {
        int count = 0;
        int totalSalary = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                totalSalary += employee.getSalary();
                count++;
            }
        }
        return count > 0 ? (double) totalSalary / count : 0;
    }
    public static void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }
}


