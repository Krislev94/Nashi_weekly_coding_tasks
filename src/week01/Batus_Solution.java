package week01;

public class Batus_Solution {

    public static void main(String[] args) {
        identify(1881);
        Finra();

    }
    public static void identify(int number){
        if (number <= 0 ){
            throw new ArithmeticException("Number can not be negative or 0");
        }
        if (number % 2 == 0){
            System.out.println(number + " is even number");
        }else {
            System.out.println(number + " is odd number");
        }

    }  public static void Finra(){


        int number = 0;

        for (number = 0; number <= 30; number++) {
            boolean FIN = number % 3 == 0;
            boolean RA = number % 5 == 0;

            if (FIN && RA) {
                System.out.println("FINRA ");
            } else if (FIN) {
                System.out.println("FIN ");
            } else if (RA) {
                System.out.println("RA ");
            } else {
                System.out.println(number + " ");
            }
        }}}
