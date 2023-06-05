package week02;

public class Reginas_solution {

    public static void main(String[] args) {


        // First task

        double x = 2.5;
        double y = 4.5;

        System.out.println("Before swapping numbers: " + x + " " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping: " + x + " " + y);

        System.out.println("----------------------------------------");

            //Second task


        StringBuilder divisibleBy15 = new StringBuilder("Divisible by 15: ");
        StringBuilder divisibleBy3 = new StringBuilder("Divisible by 3: ");
        StringBuilder divisibleBy5 = new StringBuilder("Divisible by 5: ");

        for (int i = 1; i <=100 ; i++) {
            if ( i % 15==0){
                divisibleBy15.append(" ").append(i);
            } else if (i % 3==0 && i % 15 !=0) {
                divisibleBy3.append(" ").append(i);
            } else if (i % 5==0 && i % 15 !=0) {
                divisibleBy5.append(" ").append(i);
            }
        }
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy15);
        System.out.println(divisibleBy5);

        //Third task

        Replace(24);

    }



public static void Replace(int N) {

    for (int i = 1; i <=N ; i++) {

        StringBuilder num = new StringBuilder();

        if(i % 2==0){
            num.append("Codility");
        }
        if(i % 3 ==0){
            num.append("Test");
        }
        if(i % 5 ==0){
            num.append("Coders");
        }
        if(num.length()==0){
            System.out.println(i);
        }else{
            System.out.println(num);
        }


    }


}

        }



