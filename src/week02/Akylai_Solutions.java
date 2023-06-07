package week02;

import java.util.ArrayList;

public class Akylai_Solutions {
    public static void main(String[] args) {

        swapNum(10, 3);
        divisibleNy3_5_15();
        consecutiveNum(17);


    }
    //TASK#1
    public static void swapNum(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a=" + a + " b=" + b);
    }
    //TASK#2
    public static void divisibleNy3_5_15() {

        System.out.print("Divisible by 3");
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Divisible by 5");
        for (int i = 1; i <= 100; i++) {

            if (i % 5 == 0) {

                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.print("Divisible By 15");
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //TASK3
    public static void consecutiveNum(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                System.out.print("Codility");
            }
            if (i % 3 == 0) {
                System.out.print("Test");
            }
            if (i % 5 == 0) {
                System.out.print("Coders");
            }

            if (!(i % 2 == 0) && !(i % 3 == 0) && !(i % 5 == 0)) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
