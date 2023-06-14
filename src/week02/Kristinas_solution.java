package week02;

import java.util.ArrayList;
import java.util.List;

public class Kristinas_solution {
    public static void main(String[] args) {
        swapVariables(45,10);
        swapVariables(23,54);

        divisibleBy_15_5_3();
        codility(24);
    }

    public static void swapVariables(int x, int y){

        x = x + y; // Getting sum of the two numbers
        y = x - y; // Subtracting 'x' from the sum to assign it to 'y'
        x = x - y; // 'x' is still the sum, so it's important to have this step last. Subtracting 'y' from the sum and assigning it to 'x'


        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }

    public static void divisibleBy_15_5_3(){

        List<Integer> divisible15 = new ArrayList<>();
        List<Integer> divisible5 = new ArrayList<>();
        List<Integer> divisible3 = new ArrayList<>();

        for (int i = 1; i < 101 ; i++) {
            if (i % 15 == 0){
               divisible15.add(i);
            } else if (i % 5 == 0) {
                divisible5.add(i);
            }else if (i % 3 == 0){
               divisible3.add(i);
            }
        }

        String num15 = divisible15.toString();
        num15 = num15.substring(1,num15.length()-1);

        String num5 = divisible5.toString();
        num5 = num5.substring(1,num5.length()-1);

        String num3 =divisible3.toString();
        num3 = num3.substring(1, num3.length()-1);




        System.out.println("Divisible by 15 : " + num15);
        System.out.println("Divisible by 5 : " + num5);
        System.out.println("Divisible by 3 : " + num3);
    }

    public static void codility(int number){

        for (int i = 1; i <= number ; i++) {
            // 2 = Codility
            // 3 = Test
            // 5 = Coders
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println("CodilityTestCoders");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("CodilityTest");
            } else if ( i % 3 == 0 && i % 5 == 0) {
                System.out.println("TestCoders");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("CodilityCoders");
            } else if (i % 2 == 0) {
                System.out.println("Codility");
            } else if (i % 3 == 0) {
                System.out.println("Test");
            }else if (i % 5 == 0) {
                System.out.println("Coders");
            } else{
                System.out.println(i);
            }

        }

    }
}
