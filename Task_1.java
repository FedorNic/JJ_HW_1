package Code.Junior.Home_work.HW_1;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * 1. Создать список из 1_000 рандомных чисел от 1 до 1_000_000
 * 1.1 Найти максимальное
 * 1.2 Все числа, большие, чем 500_000, умножить на 5, отнять от них 150 и просуммировать
 * 1.3 Найти количество чисел, квадрат которых меньше, чем 100_000
 */
public class Task_1 {
    private List<Integer> numbers;

    /**
     * Метод, создающий список из 1000 чисел (от 1 до 1_000_000)
     */
    public void randomNumbers() {
        numbers = Stream.generate(() -> ThreadLocalRandom.current().nextInt(1000000)).limit(1000).toList();
        System.out.println("Составлен список из 1000 чисел (от 1 до 1_000_000)");
    }

    /**
     * Метод, находящий в списке максимальное число и печатающий его в консоль
     */
    public void findMaxNumber() {
        int maxNumber = numbers.stream().max(Integer::compare).get();
        System.out.println("Максимальное число в списке: " + maxNumber);
    }

    /**
     * Метод, суммирующий числа из списка по условию и печатающий его в консоль
     */
    public void sumByCondition() {
        int sumNumbers = numbers.stream()
                .filter(x -> x > 500000)
                .map(x -> (x * 5) - 150)
                .reduce(0, Integer::sum);
        System.out.println("Сумма чисел по условию: " + sumNumbers);
    }

    /**
     * Метод, находящий количество чисел, квадрат которых меньше 100_000
     */
    public void findNumbersByCondition() {
        long quantity = numbers.stream().map(x -> Math.pow(x, 2)).filter((x) -> x < 100000).count();
        System.out.println("Количество чисел, квадрат которых меньше 100_000: " + quantity);
    }
}