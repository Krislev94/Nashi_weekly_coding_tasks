package Week02;

import java.util.ArrayList;

public class Behzod_Solutions_Week02 {

    public static void main(String[] args) {

        swap(-19, 10);
        divisibleBy3_5_15();
        printConsecutiveNumbers(30);

    }

    //Swap two variables without using a third variable
    public static void swap(int a, int b){

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a is " + a + "\nb is " + b);
    }

    //Write a program that can print the number between 1-100 that can be divisible by 3,5,15
    public static void divisibleBy3_5_15(){

        ArrayList<Integer> DivisibleBy3 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy5 = new ArrayList<>();
        ArrayList<Integer> DivisibleBy15 = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0){
                DivisibleBy15.add(i);

            } else if (i % 3 == 0 ) {
                DivisibleBy3.add(i);

            } else if (i % 5 == 0 ) {
                DivisibleBy5.add(i);

            }}

        System.out.println("Divisible By 15 : " + DivisibleBy15);
        System.out.println("Divisible By 5 : " +DivisibleBy5);
        System.out.println("Divisible By 3 : " +DivisibleBy3);
    }

    //Write a function that prints consecutive numbers from 1 to a given positive integer
    public static void printConsecutiveNumbers(int n){

        for(int i = 1; i <= n; i++){

            String output = "";

            if(i % 2 == 0){
                output += "Codility";
            }
            if (i % 3 == 0) {
                output += "Test";
            }
            if (i % 5 == 0) {
                output += "Coders";
            }
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0 ){
                output += i;
            }
            System.out.println(output);
        }

    }

}
