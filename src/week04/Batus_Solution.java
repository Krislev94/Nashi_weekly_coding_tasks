package week04;


import week02.Batus_Solutions;

public class Batus_Solution {
    public static void main(String[] args) {
        FrequencyOfChar("acbsssdfqweqwgxx");
    }

    public static String FrequencyOfChar(String text){
        String result = "";
        for (int x = 0; x < text.length(); x++) {
            char ch = text.charAt(x);
            int counter = 0;


            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    counter++;
                }
            }


            if (!result.contains("" + ch)) {
                result += ch + "" + counter;
            }
        }

        System.out.println(result);
        return result;
    }
}
