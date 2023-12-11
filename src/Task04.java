import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        int[] array = new int[100];
        int[] resultArray = new int[100];
        int index = 0;

        // Заполнение массива случайными числами от -300 до 555
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (555 - (-300) + 1) + (-300));
        }

        // Копирование элементов больше 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                resultArray[index] = array[i];
                index++;
            }
        }

        // Копирование элементов равных 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                resultArray[index] = array[i];
                index++;
            }
        }

        // Копирование элементов меньше 0
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                resultArray[index] = array[i];
                index++;
            }
        }

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Вывод результирующего массива
        System.out.println("Результирующий массив:");
        System.out.println(Arrays.toString(resultArray));
    }
}
