import java.lang.ref.Cleaner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] ledger = generateRandomArray();
        System.out.println(Arrays.toString(ledger));
        int sum = 0;
        for (int i = 0; i < ledger.length; i++) {
            sum = ledger[i] + sum;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] ledger = generateRandomArray();
        System.out.println(Arrays.toString(ledger));
        int maximumSpending = Integer.MIN_VALUE;
        int minimumWaste = Integer.MAX_VALUE;
        for (int i = 0; i < ledger.length; i++) {
            if (ledger[i] > maximumSpending) {
                maximumSpending = ledger[i];
            }
            if (ledger[i] < minimumWaste) {
                ;
                minimumWaste = ledger[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minimumWaste + " рублей. Максимальная сумма трат за день составила " + maximumSpending + " рублей");
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] ledger = generateRandomArray();
        System.out.println(Arrays.toString(ledger));
        int sum = 0;
        for (int i = 0; i < ledger.length; i++) {
            sum = ledger[i] + sum;
        }
        double averageSpending = sum / 30d;
        System.out.println("Средняя сумма трат за месяц составила " + averageSpending + " рублей");
    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}