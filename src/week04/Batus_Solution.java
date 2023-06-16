package week04;


import week02.Batus_Solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashSet;

public class Batus_Solution {
    public static void main(String[] args) {
        FrequencyOfChar("acbsssdfqweqwgxx");
        System.out.println(sameLetters("acb","efg"));
        removeDuplicates("baaaaaaaaaaaatuuuuuuuuuuuuu");
    }

    public static String FrequencyOfChar(String text){
        String result = "";
        for (int x = 0; x < text.length(); x++) { // loop for assigning charAt(x) to the ch
            char ch = text.charAt(x); // ch got index 0 of Text
            int counter = 0;


            for (int i = 0; i < text.length(); i++) { // loop for checking if Text has same value with ch;
                if (text.charAt(i) == ch) {
                    counter++; // if ch and text charAt(i) are same,increase counter by one.
                }
            }


            if (!result.contains("" + ch)) {
                result += ch + "" + counter; // if result does not contain ch(Char) value already,add that ch value to the result and add counter(number)
                // "" for concatenation
            }
        }

        System.out.println(result);
        return result;
    }

    public static boolean sameLetters(String str1,String str2){
        for (int i = 0; i < str1.length(); i++) {
            char chr = str1.charAt(i);
            boolean hasSame = false;

            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) == chr) {
                    hasSame = true; // if str2 char at number J
                    break; // If find at least one same character break the loop and return true (Line 52)
                }
            }

            if (!hasSame) {
                return false; // if hasSame is not true,return false.
            }
        }

        return true;
    }
    public static void removeDuplicates(String str){
        LinkedHashSet<Character> linked = new LinkedHashSet<>();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            linked.add(str.charAt(i)); //
        }
        for (Character each : linked) {
            result += each;

        }
        System.out.println(result);

        }

    }



