package week07;

import com.sun.source.doctree.StartElementTree;

import java.util.Arrays;
import java.util.TreeSet;

public class Batus_Solutions {


    public static void main(String[] args) {
        int [] arrayL = {50,100,40,30,500};
        System.out.println("minNumber(arrayL) = " + minNumber(arrayL));
        System.out.println(ascendingOrder(arrayL));
    }






    public static int minNumber(int[] array){

        int number = 0;
        for (int each : array) {
             number = each;

        for (int eachx : array) {
            if (eachx < number){
                number = eachx;

        } }

        }
        return number;
    }

    public static TreeSet ascendingOrder (int[] array){
        TreeSet<Integer> Set = new TreeSet<>();
        for (int each : array) {
            Set.add(each);
        // Has bug
        }
        return Set;
    }


        }



