package week05;

public class Dima_Solutions {

    public static void main(String[] args) {

        System.out.println("Task 1 Solution test passed: " + getUniqueChars("AAABBBCCCDEF").equals("DEF"));
        System.out.println("Task 2 Solution test passed: " + reverseString("ABCD").equals("DCBA"));


    }

    public static String getUniqueChars(String input) {
        StringBuilder tmp = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.indexOf(input.charAt(i)) == input.lastIndexOf(input.charAt(i))) {
                tmp.append(input.charAt(i));
            }
        }
        return tmp.toString();
    }

    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

}
