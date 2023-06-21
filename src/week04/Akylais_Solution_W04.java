package week04;

import java.util.Arrays;

public class Akylais_Solution_W04 {
    public static void main(String[] args) {
        System.out.println("frequency(\"AAAAAAABBBBCCD\") = " + frequency("AAAAAAABBBBCCD"));

        System.out.println("same_letter(\"cab\",\"abc\") = " + same_letter("cab", "abc"));
        System.out.println("removeDups(\"AAABBBBCCCC\") = " + removeDups("AAABBBBCCCC"));
    }
    //Write a return method which finds out the frequency of character
    public static String frequency(String str){//str="AAAABBBCCDDD
        String result="";//3A3B2C3D
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
               if(str.charAt(i)==str.charAt(j)){
                   count++;
            }
            }
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
            result+=count;

        }
        return result;
    }

    //write a method which returns true of false on the two strings which build out of the same letters
    public static boolean same_letter(String str1, String str2){
        if(str1.length()!=str2.length()) {
            return false;
        }

            String[] str_1=str1.split("");// make and array
            String[] str_2=str2.split("");

            Arrays.sort(str_1);
            Arrays.sort(str_2);

            return Arrays.equals(str_1,str_2);

        }

        public static String removeDups(String str){
        String result="";
            for (int i = 0; i <str.length() ; i++) {
                if(!result.contains(""+str.charAt(i))){
                    result+=str.charAt(i);
                }

            }
            return result;
        }
    }

