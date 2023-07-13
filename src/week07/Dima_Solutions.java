package week07;

import java.util.Arrays;

public class Dima_Solutions {
    public static void main(String[] args) {

        int[] arr1 = {10, 9, 8, 7};
        int[] arr2 = {89, 20, 10, 8, 7, 90};
        int[] arr3 = {15, 6, 8, 3, 10, 12, 14, 10};
        int[] arr4 = new int[0];

        System.out.println(getMinimumNum(arr1));
        System.out.println(getMinimumNum(arr2));
        System.out.println(getMinimumNum(arr3));
        System.out.println(getMinimumNum(arr4));


        System.out.println(Arrays.toString(ascSortArray(arr1)));
        System.out.println(Arrays.toString(ascSortArray(arr2)));
        System.out.println(Arrays.toString(ascSortArray(arr3)));
        System.out.println(Arrays.toString(ascSortArray(arr4)));

        System.out.println(Arrays.toString(desSortArray(arr1)));
        System.out.println(Arrays.toString(desSortArray(arr2)));
        System.out.println(Arrays.toString(desSortArray(arr4)));

    }

    public static int getMinimumNum(int[] arr) {

        try {
            int minimumNum;
            if (arr.length == 0) {
                throw new IllegalArgumentException("Given arr: " + Arrays.toString(arr) + ". There is nothing to verify for array of zero length!");
            } else {
                minimumNum = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] > minimumNum) {
                        minimumNum = arr[i];
                    }
                }
            }
            return minimumNum;

        } catch (IllegalArgumentException e){
            e.printStackTrace();
        }


        return Integer.MIN_VALUE;
    }

    public static int[] ascSortArray(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    public static int[] desSortArray(int[] arr) {
        arr = ascSortArray(arr);
        int[] result = arr.clone();
        for (int i = 0, j = result.length - 1; i < result.length; i++, j--) {
            result[i] = arr[j];
        }
        return result;
    }


}
