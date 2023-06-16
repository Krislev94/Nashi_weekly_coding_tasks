package week03;

public class Kristinas_Solution {

    public static void main(String[] args) {
        System.out.println("isPrimeNumber(5) = " + isPrimeNumber(5));
        System.out.println("isPrimeNumber(10) = " + isPrimeNumber(10));
        System.out.println("isPrimeNumber(7) = " + isPrimeNumber(7));
        // System.out.println("isPrimeNumber(-14) = " + isPrimeNumber(-14));
       // System.out.println("isPrimeNumber(0) = " + isPrimeNumber(0));
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

}
