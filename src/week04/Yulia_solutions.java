package week04;

public class Yulia_solutions {
    public static void main(String[] args) {
        //String -- Frequency of Characters
        frequencyOfChars("AAABBCDD");
        //String -- Remove Duplicates
        removeDup("AAABBBCCC");
        //String -- Same letters
        System.out.println(sameLet("abc", "cab"));
    }

    public static void frequencyOfChars(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (result.contains("" + str.charAt(i))) {
                continue;
            }
            result += "" + str.charAt(i);
            result += count;
        }
        System.out.println(result);
    }

    public static void removeDup(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }
        System.out.println(result);
    }

    public static boolean sameLet(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            for (int i = 0; i < str1.length(); i++) {
                if (!str2.contains(str1.charAt(i) + "")) {
                    return false;
                }
            }
        }

        return true;
    }

}

