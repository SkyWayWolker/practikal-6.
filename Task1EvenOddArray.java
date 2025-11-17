import java.util.Random;
import java.util.Scanner;

public class Task1EvenOddArray {
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
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();

        int evenCount = 0;
        int oddCount = 0;

        for (int value : arr) {
            if (value % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Количество чётных: " + evenCount);
        System.out.println("Количество нечётных: " + oddCount);

        scanner.close();
    }
}
