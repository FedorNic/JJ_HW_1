package Code.Junior.Home_work.HW_1;

import java.util.Random;

public class Employee {
    private final String name;
    private final int age;
    private final String department;
    private double salary;
    Data data = new Data();

    public String newRandomName() {
        Random r = new Random();
        int x = r.nextInt(1673);
        return data.names[x];
    }

    public int newRandomAge() {
        Random r = new Random();
        return r.nextInt(75)+18;
    }

    public double newRandomSalary() {
        Random r = new Random();
        return Math.ceil(r.nextDouble(150000)+5000);
    }

    public String newRandomDepartment() {
        Random r = new Random();
        int x = r.nextInt(60);
        return data.department[x];
    }

    public Employee() {
        this.name = newRandomName();
        this.age = newRandomAge();
        this.salary = newRandomSalary();
        this.department = newRandomDepartment();
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Имя = " + name +
                ", Возраст = " + age +
                ", Зарплата = " + salary +
                "\n";
    }
}