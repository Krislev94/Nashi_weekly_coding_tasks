package week01;

public class Yulias_solution {
    public static void main(String[] args) {
        identify(391);
        System.out.println(divide(100, 5));
        finra();
    }

    // Odd/Even number
    public static void identify(int number) {

        if (number == 0) {
            throw new ArithmeticException();
        }
        if (number % 2 == 0) {
            System.out.println(number + " is Even number");
        } else {
            System.out.println(number + " is Odd number");
        }
    }

    //Divide w/o "/" operator
    public static int divide(int num1, int num2) {
        int result = 0;
        if (num2 == 0) {
            throw new ArithmeticException("Divider can not be zero");
        } else if (num1 == 0) {
            return 0;
        }

        if (num1 > num2) {
            while (num1 > num2) {
                num1 -= num2;
                result++;
            }
        } else if (num2 > num1) {
            while (num2 > num1) {
                num2 -= num1;
                result++;
            }
        }
        return result;
    }

    public static void finra() {
        /*Write a method which prints out the numbers from 1 to 30 but for numbers which
      are a multiple of 3print "FIN" instead of the number and for numbers which are a
      multiple of 5, print "RA" instead of the number. for numbers which are a multiple of
      both 3 and 5, print "FINRA" instead of the number.*/

        for(int i = 0; i <= 30; i++){

            if(i % 15 == 0){
                System.out.println("FINRA");
            } else if (i % 3 ==0 ) {
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else{
                System.out.println(i);
            }
        }
    }
}





