package com.github.adeleluck.algorithms;

import com.github.adeleluck.algorithms.search.BinarySearch;
import com.github.adeleluck.algorithms.sorting.BubbleSorter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите номер алгоритма, который хотите протестировать:");
        System.out.println("1. Сортировка пузырьком.");
        System.out.println("2. Бинарный поиск.");
        int algoritm = scan.nextInt();
        switch (algoritm) {
            case (1):
                MethodBubbleSorter();
                break;
            case (2):
                MethodBinarySearch();
                break;
            default:
                System.out.println("Такого алгоритма на данный момент не существует.");
        }
    }
         public static void MethodBubbleSorter(){
            System.out.println("Введите длину массива:");
            int length = scan.nextInt();
            ArrayList<Integer> array = new ArrayList<>(length);
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < length; i++) {
                array.add(i, scan.nextInt());

            }
            System.out.println("Исходный массив: " + array);
            BubbleSorter.Sort(array);
            System.out.println("Отсортированный массив: " + array);
        }

        public static void MethodBinarySearch () {

            System.out.println("Введите длину массива: ");
            int length = scan.nextInt();
            ArrayList<Integer> array = new ArrayList<>(length);
            System.out.println("Введите элементы массива: ");
            for(int i=0; i<length;i++) {
                array.add(i, scan.nextInt());
            }
            System.out.println("Введите число, которое хотите найти: ");
            int el = scan.nextInt();
            BubbleSorter.Sort(array);
            System.out.println("Отсортированный массив: " + array);
            System.out.println("Это число находится под индексом: "+ BinarySearch.binarySearchRecursively(array, el));
        }
    }