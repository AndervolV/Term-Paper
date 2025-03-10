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

        System.out.println(employees[0]);
        System.out.println(employees[1]);
        System.out.println(employees[2]);
        System.out.println(employees[3]);
        System.out.println(employees[4]);
        System.out.println(employees[5]);
        System.out.println(employees[6]);
        System.out.println(employees[7]);
        System.out.println(employees[8]);
        System.out.println(employees[9]);

        int salaryFound = 0;
        for (int i = 0; i < employees.length; i++) {
            salaryFound = employees[i].getSalary() + salaryFound;
        }
        System.out.println("Сумма затрат на ЗП в месяц " + salaryFound + " руб.");

        int minimumSalary = employees[0].getSalary();
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < minimumSalary) {
                minimumSalary = employees[i].getSalary();
            }
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() == minimumSalary) {
                System.out.println("Сотрудник с минимальной оплатой труда: " + employees[i].getFullName() + " " + employees[i].getSalary() + " руб.");
            }
        }
        int maximumSalary = -1;
        for (int j = 0; j < employees.length; j++) {
            if (employees[j].getSalary() > maximumSalary) {
                maximumSalary = employees[j].getSalary();
            }
        }
        for (int j = 0; j < employees.length; j++) {
            if (employees[j].getSalary() == maximumSalary) {
                System.out.println("Сотрудник с максимальной оплатой труда: " + employees[j].getFullName() + " " + employees[j].getSalary() + " руб.");
            }
        }
        System.out.println("Средняя заработная  плата " + employees.length + " сотрудников составляет " + salaryFound / employees.length + " руб.");

        printAllFullNames();

    }





    public static void printAllEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static void printAllFullNames() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

}


