package Code.Junior.Home_work.HW_1;

/**
 * 1. Создать список из 1_000 рандомных чисел от 1 до 1_000_000
 * 1.1 Найти максимальное
 * 1.2 Все числа, большие, чем 500_000, умножить на 5, отнять от них 150 и просуммировать
 * 1.3 Найти количество чисел, квадрат которых меньше, чем 100_000
 *
 * 2. Создать класс Employee (Сотрудник) с полями: String name, int age, double salary, String department
 * 2.1 Создать список из 10-20 сотрудников
 * 2.2 Вывести список всех различных отделов (department) по списку сотрудников
 * 2.3 Всем сотрудникам, чья зарплата меньше 10_000, повысить зарплату на 20%
 * 2.4 * Из списка сотрудников с помощью стрима создать Map<String, List<Employee>> с отделами и сотрудниками внутри отдела
 * 2.5 * Из списка сотрудников с помощью стрима создать Map<String, Double> с отделами и средней зарплатой внутри отдела
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------");
        System.out.println("Task 1");
        Task_1 task1 = new Task_1();
        task1.randomNumbers();
        task1.findMaxNumber();
        task1.sumByCondition();
        task1.findNumbersByCondition();

        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("Task 2");

        Task_2 task2 = new Task_2();
        task2.addEmployee();
        System.out.println("Список сотрудников в департаментах:");
        System.out.println("---------------------------------");
        task2.getVariousDepartments();
        System.out.println("---------------------------------");
        task2.salaryIncrease();
        System.out.println("---------------------------------");
        System.out.println();
        task2.getMapEmployee();
        System.out.println("---------------------------------");
        System.out.println("Средняя зарплата по отделам");
        System.out.println("---------------------------------");
        task2.getMapSalary();
    }
}