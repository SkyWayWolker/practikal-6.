import java.util.Random;
import java.util.Scanner;

public class Task3FindAndReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        // Заполняем массив случайными значениями (от 0 до 50)
        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(51);
        }

        System.out.println("Исходный массив:");
        printArray(arr);

        System.out.print("Введите значение, которое нужно найти: ");
        int valueToFind = scanner.nextInt();

        System.out.print("Введите новое значение (на которое нужно заменить): ");
        int valueToReplace = scanner.nextInt();

        int replaceCount = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == valueToFind) {
                arr[i] = valueToReplace;
                replaceCount++;
            }
        }

        if (replaceCount == 0) {
            System.out.println("Значение " + valueToFind + " в массиве не найдено.");
        } else {
            System.out.println("Количество заменённых элементов: " + replaceCount);
        }

        System.out.println("Массив после замены:");
        printArray(arr);

        scanner.close();
    }

    private static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
