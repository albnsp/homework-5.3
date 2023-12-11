import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        // Заполнение массива случайными числами
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }

        // Вывод массива на экран в виде таблицы
        System.out.println("Массив:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Поиск наименьшего и наибольшего элементов массива
        int min = array[0][0];
        int max = array[0][0];
        int minRow = 0;
        int minCol = 0;
        int maxRow = 0;
        int maxCol = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minRow = i;
                    minCol = j;
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        // Вывод наименьшего и наибольшего элементов массива
        System.out.println("Наименьший элемент: " + min + " (индексы: [" + minRow + "][" + minCol + "])");
        System.out.println("Наибольший элемент: " + max + " (индексы: [" + maxRow + "][" + maxCol + "])");
        System.out.println("Время выполнения поиска: " + executionTime + " мс");
    }
}