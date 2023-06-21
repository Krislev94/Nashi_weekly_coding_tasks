package week04;

import java.util.Arrays;
import java.util.Collections;

public class Behzod_Solutions_Week04 {

    public static void main(String[] args) {

        //Task 1 Test
        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("jjhfdslsff"));

        //Task 2 Positive Testing
        System.out.println("Task 2 Positive Testing");
        System.out.println(sameLetters("abcdzxv", "zxvdcab"));
        System.out.println(sameLetters("vorisi", "risivo"));

        //Task 2 Negative Testing
        System.out.println("Task 2 Negative Testing");
        System.out.println(sameLetters("cake", "cace"));
        System.out.println(sameLetters("javacoding", "javacodlng"));

        //Task 3 Test
        System.out.println("Task 3 Test");
        System.out.println(removeDuplicates("nashinashinashi"));

    }

    //Write a return method that can find the frequency of
    //characters
    //Ex:
    //FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
    public static String frequencyOfChars(String word){

        String result = "";

        for (String each : word.split("")) {

            int frequency = Collections.frequency(  Arrays.asList( word.split("") )   , each );

            if(!result.contains(each)){
                result += each + frequency;
            }
        }

        return result;
    }

    //Write a return method that check if a string is build out of the
    //same letters as another string.
    public static boolean sameLetters(String str1, String str2){

        boolean firstString = true, secondString = true;
        for(String s: str1.split("")){
            if(!str2.contains(s)){
                secondString = false;
                break;

            }
        }

        for(String s: str2.split("")){
            if(!str1.contains(s)){
                firstString = false;
                break;
            }
        }

        return firstString&&secondString;
    }

    //Write a return method that can remove the duplicated values from
    //String
    //Ex:
    //removeDup (" AAABBBCCC")==> ABC
    //String
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)) {
                result += each;
            }
        }
        return result;
    }

}
