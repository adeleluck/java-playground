package com.github.adeleluck.algorithms.search;

import com.github.adeleluck.algorithms.sorting.BubbleSorter;
import java.util.ArrayList;

/**
 * Класс с реализацией бинарного поиска.
 **/
public class BinarySearch {
    /**
     * Метод находит заданное число с помощью бинарного поиска.
     * @param arr массив, в котором будет происходить поиск.
     */
     public static int binarySearchRecursively(ArrayList<Integer> arr, int el){
         BubbleSorter.Sort(arr);

        int first = 0;

        int last = arr.size()-1;


            while(first<=last){
                int middle = (first+last)/2;

                   if(el== arr.get(middle))
                    return middle;

                  if(el< arr.get(middle))
                     last=middle-1;

                  if(el> arr.get(middle))
                     first = middle+1;
            }
        return 0;

    }
}

