import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размерность массива: ");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int value = 1; // Начальное значение
        int row = 0; // Текущая строка
        int col = 0; // Текущий столбец
        int direction = 1; // Направление движения (1 - вправо, 2 - вниз, 3 - влево, 4 - вверх)

        for (int i = 0; i < n * n; i++) {
            array[row][col] = value++;

            // Изменение направления движения при достижении границы массива или встрече с уже заполненной ячейкой
            if ((direction == 1 && (col == n - 1 || array[row][col + 1] != 0))
                    || (direction == 2 && (row == n - 1 || array[row + 1][col] != 0))
                    || (direction == 3 && (col == 0 || array[row][col - 1] != 0))
                    || (direction == 4 && (row == 0 || array[row - 1][col] != 0))) {
                direction = (direction % 4) + 1;
            }

            // Изменение текущей позиции в зависимости от направления движения
            if (direction == 1) {
                col++;
            } else if (direction == 2) {
                row++;
            } else if (direction == 3) {
                col--;
            } else if (direction == 4) {
                row--;
            }
        }

        // Вывод массива на экран с соблюдением ширины столбцов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%-4d", array[i][j]);
            }
            System.out.println();
        }
    }
}
