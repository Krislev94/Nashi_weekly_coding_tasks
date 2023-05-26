package week1;

public class Kristinas_solution {

    public static void main(    String[] args) {
        identify(5);
        identify(2);
        identify(9);
        // identify(0);

        finra();
    }

        public static void identify(int number)throws RuntimeException{

            if(number <= 0) {
                throw new RuntimeException();
            }

            if(number % 2 == 0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }


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


