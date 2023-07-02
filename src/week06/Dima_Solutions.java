package week06;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dima_Solutions {
    public static void main(String[] args) {
        System.out.println(checkPassword("aaaA"));
        System.out.println(checkPassword("Aa!1aa!a"));

        int[] test1 = {25, 5, 1, 45};
        System.out.println(findMax(test1));

        System.out.println(sumOfDigitsInString("00"));
        System.out.println(sumOfDigitsInString("01"));
        System.out.println(sumOfDigitsInString("910"));
        System.out.println(sumOfDigitsInString("0a.D!1"));
        System.out.println(sumOfDigitsInString("a.D!"));
    }


    public static long sumOfDigitsInString(String input) {
        // String -- sum of digits in a string
        //  Write a method that can return the sum of the digits in a string
        char[] symbols = input.toCharArray();
        boolean hasDigit = false;
        int result = 0;
        for (char symbol : symbols) {
            if (symbol >= 48 && symbol <= 57) {
                result += symbol - 48;
                hasDigit = true;
            }
        }
        if (!hasDigit){
            return -1;
        }
        return result;
    }


    public static int findMax(int[] input) {
        //  Array -- Find Maximum
        //  Write a method that can find the maximum number from an int Array

        if (input.length > 0) {
            int maximum = input[0];
            for (int i = 1; i < input.length; i++) {
                if (input[i] > maximum) {
                    maximum = input[i];
                }
            }
            return maximum;
        }
        return Integer.MIN_VALUE;
    }

    public static boolean checkPassword(String password) {

        // Password Validation Task
        // Write a return method that can verify if a password is valid or not.
        //requirements:
        //  1. Password MUST be at least have 6 characters and should not contain space
        //  2. PassWord should at least contain one upper case letter
        //  3. PassWord should at least contain one lowercase letter
        //  4. Password should at least contain one special characters
        //  5. Password should at least contain a digit
        //
        //  if all requirements above are met, the method returns true, otherwise returns false

        String regexExpression = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[!@#$%^&*()-_=+{};:,<.>])(\\S){6,}$";
        Pattern regex = Pattern.compile(regexExpression);
        Matcher matcher = regex.matcher(password);
        return matcher.find();

    }
}




