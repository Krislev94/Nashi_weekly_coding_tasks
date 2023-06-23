package week05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Batus_Solutions {
    public static void main(String[] args) {
        //Reverse string
        System.out.println(reverseString("niaga taerg ihsan ekaM"));
        System.out.println(reversThem("niaga taerg ihsan ekaM"));
        //Reverse String
        System.out.println(unique("baaaaaaattttttttttuuuuuuuuuuu"));
    }

    public static String reverseString(String str){
        String newString = "";
        for (int i = str.length() -1 ; i >= 0; i--) {
            newString += "" + str.charAt(i);

        }
        return newString;

    }
    public static String reversThem(String str) {
        String newString = "";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            newString += list.get(i);

        }
        return newString;
    }

    public static String unique(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
          if (!result.contains("" + str.charAt(i))){
              result += str.charAt(i);
           }

        }
        return result;
    }


}
