package week07;

public class Akylais_Solution_W07 {
    public static void main(String[] args) {

        System.out.println(maxNum(new int[]{10, 15, 20, 63}));
    }
        public static int maxNum ( int[] arr){

            int Max = arr[0];
            for (int i = 0; i < arr.length; i++) {

                if (arr[i] > Max) {
                    Max=arr[i];
                }
            }
            return Max;

        }
    public static int findSum(String str){
        int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                int digit=Character.getNumericValue(c);
                sum+=digit;
            }
        }
        return sum;
    }
    public static int MinNum(int[] array){

        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    }
