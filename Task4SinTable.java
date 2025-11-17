public class Task4SinTable {
    public static void main(String[] args) {
        int countInRow = 10;
        int count = 0;

        for (int degree = 0; degree <= 90; degree++) {
            double radians = Math.toRadians(degree);
            double sinValue = Math.sin(radians);

            // Пример вывода: "sin( 30°) = 0.5000"
            System.out.printf("sin(%3d°) = %.4f  ", degree, sinValue);
            count++;

            if (count == countInRow) {
                System.out.println();
                count = 0;
            }
        }

        if (count != 0) {
            System.out.println();
        }
    }
}
