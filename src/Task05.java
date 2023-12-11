import java.util.Arrays;

public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[20];
        int maxCount = 0;
        int currentCount = 0;
        int startIndex = 0;
        int endIndex = 0;

        // Заполнение массива случайными числами от -10 до 20
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (20 - (-10) + 1) + (-10));
        }

        // Поиск максимального количества подряд идущих положительных элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    endIndex = i;
                    startIndex = endIndex - maxCount + 1;
                }
            } else {
                currentCount = 0;
            }
        }

        // Вывод исходного массива
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));

        // Вывод найденного фрагмента
        System.out.println("Найденный фрагмент:");
        for (int i = startIndex; i <= endIndex; i++) {
            System.out.print(array[i] + " ");
        }
    }
}