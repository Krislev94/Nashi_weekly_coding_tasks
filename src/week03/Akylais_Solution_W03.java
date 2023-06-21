package week03;

public class Akylais_Solution_W03 {


    public static void main(String[] args) {
        System.out.println("isPrimeNumber(10) = " + isPrimeNumber(10));

        System.out.println("reverseNegative(-13) = " + reverseNegative(-13));
    }


    //Write a method that can check if number is prime
    public static boolean isPrimeNumber(int number){

        if(number<0){
            throw new ArithmeticException("Negative number can not be PRIME");

    }

        if(number==0){
            throw new ArithmeticException("Zero is not a prime number");}


        for(int i=2; i<number;i++){
            if(number%i==0){
                return false;
            }
        }return true;


    }

    //Write a method that can reverse negative number

    public static int reverseNegative(int number){
       String numberNegative=String.valueOf(number);

       String reverseNumber="";
       //-13
        for (int i =numberNegative.length()-1; i>=0 ; i--) {//2  31

            reverseNumber+=numberNegative.charAt(i);
        }

        int result=Integer.parseInt(reverseNumber.substring(0,reverseNumber.length()-1));

        return -result;

        }
    }

