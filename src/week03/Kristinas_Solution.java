package week03;

public class Kristinas_Solution {

    public static void main(String[] args) {
        System.out.println("isPrimeNumber(5) = " + isPrimeNumber(5));
        System.out.println("isPrimeNumber(10) = " + isPrimeNumber(10));
        System.out.println("isPrimeNumber(7) = " + isPrimeNumber(7));
        // System.out.println("isPrimeNumber(-14) = " + isPrimeNumber(-14));
       // System.out.println("isPrimeNumber(0) = " + isPrimeNumber(0));

        System.out.println("reverseNegativeNumber(-123) = " + reverseNegativeNumber(-123));
        System.out.println("reverseNegativeNumber(-527) = " + reverseNegativeNumber(-527));
        System.out.println("reverseNegativeNumber(-100) = " + reverseNegativeNumber(-100));

    }

    public static boolean isPrimeNumber(int number){

        // NEGATIVE NUMBERS CANNOT BE PRIME
        if (number < 0){
            throw new ArithmeticException("Negative numbers cannot be prime");
        }

        // ZERO CANNOT BE PRIME
        if (number == 0){
            throw new ArithmeticException("Zero is not a prime number");
        }

        // DIVIDING THE GIVEN NUMBER BY EACH NUMBER STARTING FROM TO UNTIL THE GIVEN NUMBER
        for (int i = 2; i < number ; i++) {

            // If it's divisible by any number then it's not a prime
            if (number % i == 0){
                return false;
            }


        }

        return true;

    }

    public static int reverseNegativeNumber(int negativeNumber){

        // Converting our given integer number into the String
        String number = String.valueOf(negativeNumber);

        // Creating an empty String to store our reversed number in
        String reversedNumber = "";

        // Reversing the string
        for(int i = number.length()-1; i >=0; i--){
            reversedNumber += number.charAt(i);
        }

        // Converting our String back to int and deleting that last negative sign at the end

        int result = Integer.parseInt(reversedNumber.substring(0,reversedNumber.length()-1));

        // Putting negative sign first
        return  -result;


    }

}
