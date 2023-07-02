package week06;

public class Kristinas_Solutions {


    public static void main(String[] args) {
        System.out.println("isValidPassword(\"frog123\") = " + isValidPassword("frog123"));
        System.out.println("isValidPassword(\"Password#1\") = " + isValidPassword("Password#1"));
        System.out.println("isValidPassword(\"pas7sword*\") = " + isValidPassword("pas7sword*"));

        int[] test = {12, 43, 6, 432, 35,-3245};
        System.out.println("findMax(test) = " + findMax(test));

        System.out.println("sumOfDigitsInString(\"2A1\") = " + sumOfDigitsInString("2A1"));
        System.out.println("sumOfDigitsInString(\"bHd32Hh902\") = " + sumOfDigitsInString("bHd32Hh902"));
    }

    // String -- Password Validation Task
    //1. Write a return method that can verify if a password is valid or not.
    //requirements:
    //if all requirements above are met, the method returns true, otherwise returns false
    public static boolean isValidPassword(String password) {
        //1. Password MUST be at least have 6 characters and should not contain space
        //2. PassWord should at least contain one upper case letter
        //3. PassWord should at least contain one lowercase letter
        //4. Password should at least contain one special characters
        //5. Password should at least contain a digit
        char[] passwordArray = password.toCharArray();

        int lowerCase = 0;
        int upperCase = 0;
        int specialChar = 0;
        int digit = 0;


        if (password.length() >= 6 && !password.contains(" ")) {
            for (char each : passwordArray) {
                if (Character.isLowerCase(each)) {
                    lowerCase++;
                } else if (Character.isUpperCase(each)) {
                    upperCase++;
                } else if (Character.isDigit(each)) {
                    digit++;
                } else {
                    specialChar++;
                }
            }
        }

    return lowerCase >= 1 && upperCase >= 1 && specialChar >= 1 && digit >= 1;
    }




    //Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array
    public static int findMax(int[] intArray){
        int max = intArray[0];

        for (int each : intArray) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }


//    String -- sum of digits in a string
//    Write a method that can return the sum of the digits in a string
    public static int sumOfDigitsInString(String string){

        int result = 0;

        char [] stringToChar = string.toCharArray();

        for (char each : stringToChar) {
            if (Character.isDigit(each)){
                result += Integer.parseInt(""+each);
            }
        }

        return result;
    }

}
