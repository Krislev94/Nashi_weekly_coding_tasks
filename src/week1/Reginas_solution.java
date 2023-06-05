package week1;

public class Reginas_solution {

    public static void main(String[] args) {

       OddOrEven(5);
       OddOrEven(6);
       FINRA();


    }

    public static void OddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
    public static void FINRA(){
        for (int i = 1; i <=30 ; i++) {
            if(i % 3 ==0){
                System.out.println("FIN");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            }else if (i % 3 ==0 && i% 5 ==0){
                System.out.println("FINRA");
            }else {
                System.out.println(i);
            }

        }
    }
}