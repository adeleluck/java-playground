package adeleluck.github.com;

import adeleluck.github.com.sorting.BubbleSorter;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]array=new int[]{74, 35, 98, 4, 2, 53};
        System.out.println("Исходный массив: "+ Arrays.toString(array));
        BubbleSorter.Sort(array);
        System.out.println("Отсортированный массив: "+ Arrays.toString(array));
    }
}