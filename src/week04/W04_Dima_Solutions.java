package week04;

import java.util.*;

public class W04_Dima_Solutions {
    public static void main(String[] args) {

        System.out.println("\n=== Task 1 = Approach 1 (TreeSet + LinkedList + forEach Function) ========");
        System.out.println("1st task solution v1 test: " + (getFrequencyOfAllCharacters1("AAABBCDDAAABBCDD").equals("A6B4C2D4") ? "PASSED" : "FAILED"));
        System.out.println("\n=== Task 1 = Approach 2 (1 step String iteration) ========");
        System.out.println("1st task solution v2 test: " + (getFrequencyOfAllCharacters2("AAABBCDDAAABBCDD").equals("A6B4C2D4") ? "PASSED" : "FAILED"));


        System.out.println("\n=== Task 2 = Approach 1 (use String contains() method) ========");
        String referenceLine = "abca";
        String positiveTestString = "baca";
        String negativeTestString = "faca";
        boolean result1 = ifContainsAllSameLetters1(referenceLine,positiveTestString);
        boolean result3 = ifContainsAllSameLetters1(referenceLine,negativeTestString);
        System.out.println("2nd task solution v1 test, expected: true, actual " + result1 + ", test: " + (result1 ? "PASSED" : "FAILED"));
        System.out.println("2nd task solution v1 test, expected: false, actual " + result3 + ", test: " + (result3 ? "FAILED" : "PASSED"));
        System.out.println("\n=== Task 2 = Approach 2 (through char[] & use Arrays class methods) ========");
        boolean result2 = ifContainsAllSameLetters2(referenceLine,positiveTestString);
        boolean result4 = ifContainsAllSameLetters2(referenceLine,negativeTestString);
        System.out.println("2nd task solution v2 test, expected: true, actual " + result2 + ", test: " + (result2 ? "PASSED" : "FAILED"));
        System.out.println("2nd task solution v2 test, expected: false, actual " + result4 + ", test: " + (result4 ? "FAILED" : "PASSED"));



        System.out.println("\n=== Task 3 = Approach 1 (with LinkedHashSet usage) ========");
        String inputLine = "AAABBBCCCAAA";
        String withoutDuplicatesLine = "ABC";
        boolean result31 = removeDuplicates1(inputLine).equals(withoutDuplicatesLine);
        boolean result32 = removeDuplicates2(inputLine).equals(withoutDuplicatesLine);
        System.out.println("3rd task solution v1 test, expected: true, actual " + result31 + ", test: " + (result31 ? "PASSED" : "FAILED"));

        System.out.println("\n=== Task 3 = Approach 2 (1 step input String iteration + StringBuilder) ========");
        System.out.println("3rd task solution v2 test, expected: true, actual " + result32 + ", test: " + (result32 ? "PASSED" : "FAILED"));
    }


    public static String getFrequencyOfAllCharacters1(String input) {
        //String -- Frequency of Characters
        //Write a return method that can find the frequency of
        //characters
        //Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        Set<Character> uniqueChars = new TreeSet<>();
        List<Character> allChars = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            uniqueChars.add(input.charAt(i));
            allChars.add(input.charAt(i));
        }
        StringBuilder result = new StringBuilder(uniqueChars.size() * 2 + 1);
        uniqueChars.forEach(p -> result.append(p).append(Collections.frequency(allChars, p)));
        return result.toString();
    }

    public static String getFrequencyOfAllCharacters2(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(input.charAt(i) + "") == -1) {
                result.append(input.charAt(i)).append(1);
            } else {
                int counterIndex = result.indexOf(input.charAt(i) + "") + 1;
                int counter = Integer.parseInt(result.substring(counterIndex, counterIndex + 1)) + 1;
                result.replace(counterIndex, counterIndex + 1, counter + "");
            }
        }
        return result.toString();
    }


    public static boolean ifContainsAllSameLetters1(String firstCheckedString, String secondCheckedString) {
        //String -- Same letters
        //Write a return method that check if a string is build out of the
        //same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:
        if (firstCheckedString.length() != secondCheckedString.length()) {
            return false;
        } else {
            for (int i = 0; i < firstCheckedString.length(); i++) {
                if (!secondCheckedString.contains(firstCheckedString.charAt(i) + "")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ifContainsAllSameLetters2(String firstCheckedString, String secondCheckedString) {
        //String -- Same letters
        //Write a return method that check if a string is build out of the
        //same letters as another string.
        //Ex: same("abc", "cab"); -> true
        //same("abc", "abb"); -> false:

        char[] firstSet = firstCheckedString.toCharArray();
        Arrays.sort(firstSet);
        char[] secondSet = secondCheckedString.toCharArray();
        Arrays.sort(secondSet);

        return Arrays.equals(firstSet, secondSet);

    }

    public static String removeDuplicates1(String input) {
        //String -- Remove Duplicates
        //Write a return method that can remove the duplicated values from
        //String
        //Ex: removeDup("AAABBBCCC") ==> ABC
        Set<Character> chars = new LinkedHashSet<>();
        for (int i = 0; i < input.length(); i++) {
            chars.add(input.charAt(i));
        }
        StringBuilder result = new StringBuilder();
        chars.forEach(result::append);
        return result.toString();
    }

    public static String removeDuplicates2(String input) {
        //String -- Remove Duplicates
        //Write a return method that can remove the duplicated values from
        //String
        //Ex: removeDup("AAABBBCCC") ==> ABC
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (result.indexOf(input.charAt(i) + "") == -1) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }


}
