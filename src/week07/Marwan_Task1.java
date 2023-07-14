package week07;

public class Marwan_Task1 {

/*
1. Array - Find Minimum
  Write a method that can find the minimum number from an int Array
 */
public static void main(String[] args) {
    int[] arr = {1,3,4,5,7,8,10,10,10,11};
    System.out.println(MinimumInArr(arr));
}
    public static int MinimumInArr(int[] arr){
       int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];

            }
        }


        return min;
    }
}