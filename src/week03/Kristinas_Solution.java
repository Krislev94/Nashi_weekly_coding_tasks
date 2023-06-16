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

        if (number < 0){
            throw new ArithmeticException("Negative numbers cannot be prime");
        }

        if (number == 0){
            throw new ArithmeticException("Zero is not a prime number");
        }

        for (int i = 2; i < number ; i++) {
            if (number % i == 0){
                return false;
            }


        }

        return true;

    }

}
