package week1;

public class Behzod_Solutions {

    public static void main(String[] args) {

        identify(8);
        System.out.println(divide(30,4));
        finra();

    }

    //Write a method which can identify given number is even or odd
    public static void identify(int number) {

            if (number < 0) {
                throw new RuntimeException("Number can not be less than or equal to zero!");
            }
            if(number % 2 == 0){
                System.out.println("Even");
            }
            else if(number % 2 == 1) {
                System.out.println("Odd");
            }

    }

    //Write a method that can divide two numbers without using division operatior
    public static int divide(int num1, int num2) {
        int result = 0;

        if(num1 <= 0 || num2 <= 0){
            throw new RuntimeException("Numbers can not be less than or equal to zero!");
        }
        if(num1 >= num2) {
            while (num1 >= num2) {
                result++;
                num1 -= num2;
            }
        }
        else if(num1 <= num2){
            while (num1 <= num2) {
                result++;
                num2 -= num1;
            }
        }

        return result;
    }

    /*Write a method which prints out the numbers from 1 to 30 but for numbers which
      are a multiple of 3print "FIN" instead of the number and for numbers which are a
      multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
      both 3 and 5, print "FINRA" instead of the number.*/
    public static void finra(){
        for(int i = 1; i <= 30; i++){
            boolean fin = i%3 == 0;
            boolean ra = i%5 == 0;
            boolean finra = fin && ra;
            if(finra){
                System.out.println("FINRA");
            }
            else if(fin){
                System.out.println("FIN");
            }
            else if(ra){
                System.out.println("RA");
            }
            else{
                System.out.println(i);
            }
        }
    }
}
