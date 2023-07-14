package week07;

import java.util.Arrays;

public class Marwan_Task2 {
    public static void main(String[] args) {


        int[] array = {100, 10, 200, 2, -95, -26, -36, 70, 500};

        System.out.println(Arrays.toString(sortArrayInAscendingOrder(array)));
    }

    public static int[] sortArrayInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = 0;
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        return array;
    }
}

/*
2. Array - Sort Ascending
  Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
  Ex: int[] arr = {10, 9, 8, 7};
  arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */