package com.github.adeleluck.algorithms.sorting;

import java.util.ArrayList;

/**
 * Класс с реализацией сортировки пузырьком.
 **/
public class BubbleSorter {
    /**
     * Метод сортирует массив in-place методом пузырька.
     * @param arr массив, который надо отсортировать.
     */
    public static void Sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int k = arr.get(j + 1);
                    arr.set(j + 1, arr.get(j));
                    arr.set(j, k);
                }
            }
        }
    }
}
