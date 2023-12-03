package Code.Junior.Home_work.HW_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 2. Создать класс Employee (Сотрудник) с полями: String name, int age, double salary, String department
 * 2.1 Создать список из 10-20 сотрудников
 * 2.2 Вывести список всех различных отделов (department) по списку сотрудников
 * 2.3 Всем сотрудникам, чья зарплата меньше 10_000, повысить зарплату на 20%
 * 2.4 * Из списка сотрудников с помощью стрима создать Map<String, List<Employee>> с отделами и сотрудниками внутри отдела
 * 2.5 * Из списка сотрудников с помощью стрима создать Map<String, Double> с отделами и средней зарплатой внутри отдела
 */
public class Task_2 {
    private final List<Employee> employees = new ArrayList<>();

    /**
     * Метод добавления сотрудников
     */
    public void addEmployee() {
        for (int i = 1; i < 20; i++) {
            employees.add(new Employee());
        }
    }

    /**
     * Метод вывода отделов по списку сотрудников
     */
    public void getVariousDepartments() {
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }

    /**
     * Метод повышения з/п сотрудников с маленькой зарплатой
     */
    public void salaryIncrease() {
        employees.stream().filter(it -> it.getSalary() < 10000).forEach(it -> it.setSalary(it.getSalary() * 1.2));
        employees.stream().filter(it -> it.getSalary() < 10000).forEach(System.out::println);
    }

    /**
     * Метод формирования списка сотрудников по департаментам
     */
    public void getMapEmployee() {
        Map<String, List<Employee>> mapEmployee =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        mapEmployee.forEach((k, v) -> System.out.println(k + "\n------" + "\nСотрудники: \n" + v.toString()
                .replace("[", "").replace("]", "")));
    }

    /**
     * Метод расчета средней зарплаты по отделу
     */
    public void getMapSalary() {
        Map<String, Double> mapSalary =
                employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        mapSalary.forEach((k, v) -> System.out.println(k + " - " + v + " р."));
    }
}