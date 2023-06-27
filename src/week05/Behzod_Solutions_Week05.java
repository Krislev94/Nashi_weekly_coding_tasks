package week05;

public class Behzod_Solutions_Week05 {

    public static void main(String[] args) {

        //LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList("{A,A,B,B,B,C,C,C,D,E,F}"));
        //Task 1 Test
        System.out.println(uniqueCharacters("AAAADBBBCECCF"));
        System.out.println(uniqueCharacters("software development engineer in test"));

        //Task 2 Test
        System.out.println("reverseString(\"Joker\") = " + reverseString("Joker"));
        System.out.println("reverseString(\"Cucumber\") = " + reverseString("Cucumber"));
    }

    //TASK 1 -> String -- Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static String uniqueCharacters(String str) {

        //String variable to hold unique elements
        String unique = "";

        //Iterate through each character of the string
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                //if both characters are the same then increase count
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            //if the count is = to 1 after the iteration of the inner loop, add the element to unique variable
            if (count == 1) {
                unique += str.charAt(i);
            }
        }
        return unique;
    }

    //TASK 2 -> String -- Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static String reverseString(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
