import java.util.Scanner;

public class Task2PolygonCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество углов n: ");
        int n = scanner.nextInt();

        double[] angles = new double[n];
        double sum = 0.0;

        System.out.println("Введите углы многоугольника (в градусах):");
        for (int i = 0; i < n; i++) {
            System.out.print("Угол " + (i + 1) + ": ");
            angles[i] = scanner.nextDouble();
            sum += angles[i];
        }

        double expectedSum = 180.0 * (n - 2);
        double eps = 1e-6; // допускаем маленькую погрешность

        System.out.println("Сумма введённых углов: " + sum);
        System.out.println("Ожидаемая сумма по формуле 180 * (n - 2) = " + expectedSum);

        if (Math.abs(sum - expectedSum) < eps) {
            System.out.println("Такой многоугольник МОЖЕТ существовать.");
        } else {
            System.out.println("Такой многоугольник НЕ может существовать.");
        }

        scanner.close();
    }
}
