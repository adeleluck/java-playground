package adeleluck.github.com;

import adeleluck.github.com.sorting.BubbleSorter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        int length = scan.nextInt();
        ArrayList<Integer> array = new ArrayList<>(length);
        System.out.println("Введите элементы массива:");
        for(int i=0;i<length;i++){
            array.add(i, scan.nextInt());

        }
        System.out.println("Исходный массив: "+ array);
        BubbleSorter.Sort(array);
        System.out.println("Отсортированный массив: "+ array);
    }
}