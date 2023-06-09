package week01;

public class Kristinas_solution {

    public static void main(    String[] args) {
        identify(5);
        identify(2);
        identify(-9);
        // identify(0);

        finra();

        System.out.println();

        System.out.println("divide(30,10) = " + divide(30, 10));
        System.out.println("divide(50,5) = " + divide(50, 5));
        System.out.println("divide(-4,-2) = " + divide(-4, -2));
        System.out.println("divide(-6,3) = " + divide(-6, 3));
        System.out.println("divide(10,-2) = " + divide(10, -2));
    }

    // Identify odd or even number
        public static void identify(int number){

            if(number == 0) {
                throw new RuntimeException();
            }

            if(number % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }

        // Divide numbers without / operator
        // Write a method that can divide two numbers without using division operator

    public static int divide(int num1, int num2){


        if (num2 == 0){ // we can't divide on zero
            throw new ArithmeticException();
        } else if (num1 == 0) { // if we divide zero on any number we will get 0
            return 0;
        }

        boolean negativeNum1 = false;
        boolean negativeNum2 = false;



        if (num1 < 0){
            num1 = -num1;
            negativeNum1 = true;
        }
        if (num2 < 0){
            num2 = -num2;
            negativeNum2 = true;
        }

        int count = 0;

        while (num1 >= num2){
            num1 -= num2;
            count++;
        }

        if ((negativeNum1 && !negativeNum2) || (!negativeNum1 && negativeNum2)){
            count = -count;
        }



        return count;

    }


















        // Print FINRA if the number is divisible by 3 and 5
        // Print FIN if the number is divisible by 3
        // // Print RA if the number is divisible by 5
    public static void finra(){

        for( int i =1; i <= 30; i++){

            if (i % 15 == 0){
                System.out.print("FINRA ");
            } else if (i % 3 == 0) {
                System.out.print("FIN ");
            } else if (i % 5 == 0) {
                System.out.print("RA ");
            }else{
                System.out.print(i + " ");
            }
        }
    }



    }


