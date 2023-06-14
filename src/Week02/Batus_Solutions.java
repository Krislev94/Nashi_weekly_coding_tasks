package week02;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.String.*;

public class Batus_Solutions {
    public static void main(String[] args) {

        swap(5,2);
        GrouptheNumbers(100);

        System.out.println("==========================================================================================");
        //Solution For Print Consecutive numbers.

        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter number to proceed : ");
        int number = scanner.nextInt();
        String result = "";


        for (int i = 1; i < number; i++) {

            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0) {
                result = "";
            }
            if (i % 2 == 0){
               result += "Codility";
            }
            if (i % 3 == 0 ){
                result += "Test";
            }
            if (i % 5 ==  0 ){
                result += "Coders ";

            }if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                System.out.println(i);
            }else {
                System.out.println(result);
            }


    }








    }
        public static void swap(int x,int y){
            System.out.println("Before swap : " + x + " " + y);

            x = x + y ;
            y = x - y;
            x = x - y;
            System.out.println("After swap : " + x + " " +  y );
    }

    public static void GrouptheNumbers(int number) {
        ArrayList<Integer> DivBy3 = new ArrayList<>();
        ArrayList<Integer> DivBy5 = new ArrayList<>();
        ArrayList<Integer> DivBy15 = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
           if (i % 15 == 0){
               DivBy15.add(i);

           } else if (i % 3 == 0 && i % 15 != 0) {
            DivBy3.add(i);

           } else if (i % 5 == 0 && i % 15 != 0) {
               DivBy5.add(i);

           }}

        System.out.println("Divisible by 15 : " + DivBy15);
        System.out.println("Divisible by 5 : " +DivBy5);
        System.out.println("Divisible by 3 : " +DivBy3);

    }





}
