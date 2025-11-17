import java.util.Random;
import java.util.Scanner;

public class Task5AscendingDescending {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Заполняем массив случайными значениями (от 0 до 100)
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(101);
        }

        System.out.println("Сгенерированный массив:");
        printArray(arr);

        System.out.println("Выберите тип проверки:");
        System.out.println("1 - проверить на возрастание");
        System.out.println("2 - проверить на убывание");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        boolean result;
        if (choice == 1) {
            result = isAscending(arr);
            if (result) {
                System.out.println("Массив является возрастающим (каждый следующий элемент >= предыдущего).");
            } else {
                System.out.println("Массив НЕ является возрастающим.");
            }
        } else if (choice == 2) {
            result = isDescending(arr);
            if (result) {
                System.out.println("Массив является убывающим (каждый следующий элемент <= предыдущего).");
            } else {
                System.out.println("Массив НЕ является убывающим.");
            }
        } else {
            System.out.println("Неверный выбор.");
        }

        scanner.close();
    }

    private static boolean isAscending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static boolean isDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
