package adeleluck.github.com.sorting;

/**
 * Класс с реализацией сортировки пузырьком.
 **/
public class BubbleSorter {
    /**
     * Метод сортирует массив in-place методом пузырька.
     * @param arr массив, который надо отсортировать.
     */
    public static void Sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int k = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = k;
                }
            }
        }
    }
}
