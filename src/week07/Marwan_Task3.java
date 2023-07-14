package week07;

import java.util.Arrays;

public class Marwan_Task3 {
    public static void main(String[] args) {


        int[] array = {100, 10, 200, 2, -95, -26, -36, 70, 500};

        System.out.println(Arrays.toString(sortArrayInDescendingOrder(array)));
    }

    public static int[] sortArrayInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                int temp = 0;
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }

            }
        }
        return array;
    }
}

/*
3. Array - Sort Descending
  Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
  Ex: int[] arr = {10,20,7, 8, 90};
  arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */


