import java.util.Random;

public class Task02 {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // Заполняем массив случайными числами от -10 до 30
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(41) - 10;
        }

        // Ищем первый отрицательный элемент и считаем сумму элементов после него
        int sum = 0;
        boolean negativeFound = false;
        for (int i = 0; i < array.length; i++) {
            if (negativeFound) {
                sum += array[i];
            } else if (array[i] < 0) {
                negativeFound = true;
            }
        }

        // Выводим массив и сумму
        System.out.println("Массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nСумма элементов после первого отрицательного элемента: " + sum);
    }
}
