package week04;


import java.util.Arrays;

public class Kristinas_solution {

    public static void main(String[] args) {
        removeDuplicates("AAABBBTTAAAMMBKJTFN");

        frequencyOfCharacters("aaakkffrv");

        System.out.println("sameLetters(\"dog\",\"cat\") = " + sameLetters("dog", "cat"));
        System.out.println("sameLetters(\"lake\",\"kale\") = " + sameLetters("lake", "kale"));
        System.out.println("sameLetters(\"door\",\"doog\") = " + sameLetters("door", "doog"));

    }


    public static void frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }

            if (result.contains(""+str.charAt(i))){
                continue;
            }

            result+= ""+str.charAt(i);
            result += count;

        }

        System.out.println(result);

    }

    public static boolean sameLetters(String string1, String string2){

        if (string1.length() != string2.length()){
            return false;
        }
        String[] str1 = string1.split("");
        String[] str2 = string2.split("");

        Arrays.sort(str1);
        Arrays.sort(str2);

        return Arrays.equals(str1,str2);

    }

    public static void removeDuplicates(String string){


        String result = "";

        for (int i = 0; i < string.length(); i++) {
                if (!result.contains(""+string.charAt(i))){
                    result += string.charAt(i);
                }
        }
        System.out.println(result);


    }
}
