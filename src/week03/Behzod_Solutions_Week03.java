package week03;

public class Behzod_Solutions_Week03 {

    public static void main(String[] args) {

        System.out.println(isPrime(43));
        System.out.println(isPrime(12));
        System.out.println(reverseNegativeNumber(-263));
        System.out.println(reverseNegativeNumber(-40));
        System.out.println(reverseNegativeNumber(55));

    }

    //Write a method that can check if a number is prime or not
    public static boolean isPrime(int number){

        if(number<=1)
        {
            return false;
        }
        for(int i=2;i<=number/2;i++)
        {
            if((number%i)==0)
                return  false;
        }
        return true;

    }

    //Write a return method that can reverse
    //negative number and return it as int
    public static int reverseNegativeNumber(int negativeNumber){

        if(negativeNumber > 0){
            throw new RuntimeException("The number should be negative!");
        }
        //Integer variable to keep track of reversed number
        int reverse = 0;

        //We iterate through the loop until our negativeNumber is 0
        while(negativeNumber != 0)
        {
            //When we divide the number by 10, the last digit would be a remainder
            int remainder = negativeNumber % 10;

            //We take that last digit as a remainder and add it to the reverse variable multipled by 10
            reverse = reverse * 10 + remainder;

            //To get rid of last digit, we divide the negative number by 10
            negativeNumber = negativeNumber/10;
        }

        return reverse;

    }
}
