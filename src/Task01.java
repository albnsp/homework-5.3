public class Task01 {
    public static void main(String[] args) {
        int[] array = new int[10]; // Создаем массив из 10 элементов

        // Заполняем массив квадратами соответствующих индексов
        for (int i = 0; i < array.length; i++) {
            array[i] = i * i;
        }

        // Выводим результат на экран
        for (int i = 0; i < array.length; i++) {
            System.out.println("Элемент с индексом " + i + ": " + array[i]);
        }
    }
}
