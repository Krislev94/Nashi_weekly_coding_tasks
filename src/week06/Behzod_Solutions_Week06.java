package week06;


import java.util.Arrays;
import java.util.Collections;

public class Behzod_Solutions_Week06 {


    public static void main(String[] args) {

        //TASK 1
        //Positive Testing
        System.out.println("--------------Positive Testing-----------------");
        System.out.println("passwordValidation(\"Gg3kow4@\") = " + isPasswordValid("Gg3kow4@"));
        System.out.println("isPasswordValid(\":cT44v\") = " + isPasswordValid(":cT44v"));

        //Negative Testing
        System.out.println("--------------Negative Testing-----------------");
        System.out.println("isPasswordValid(\"sfgE%v\") = " + isPasswordValid("sfgE%v"));
        System.out.println("isPasswordValid(\"aFs#4\") = " + isPasswordValid("aFs#4"));

        //TASK 2
        System.out.println("--------------------------------------------------");
        int[] numbers = {5,6,3,22,1};
        System.out.println("findMax(numbers) = " + findMax(numbers));

        //TASK 3
        System.out.println("------------------------------------------------------");
        System.out.println("findSum(\"fgu5j7\") = " + findSum("fgu5j7"));
        System.out.println("findSum(\"find5sum9\") = " + findSum("find5sum9"));
    }

    /*
    String -- Password Validation Task
    Write a return method that can verify if a password is valid or not. requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
     */
    public static boolean isPasswordValid(String password) {
        boolean length = password.length() >= 6 && !password.contains(" ");
        boolean uppercase = false;
        boolean lowercase = false;
        boolean specialChar = false;
        boolean digit = false;

        if (length) {
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    uppercase=true;
                } else if(Character.isLowerCase(c)){
                    lowercase=true;
                } else if(Character.isDigit(c)){
                    digit=true;
                } else {
                    specialChar=true;
                }
            }
        }else{System.err.println("Password MUST be at least have 6 characters and should not contain space");}

        return uppercase && lowercase && specialChar && digit;
    }

    /*
    Array -- Find Maximum Write a method that can find the maximum number from an int Array
     */
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /*
    String -- sum of digits in a string
    Write a method that can return the sum of the digits in a string
     */
    public static int findSum(String str){
        int sum = 0;

        for(char c:str.toCharArray()){
            if(Character.isDigit(c)){
                sum+= Integer.parseInt(""+c);
            }
        }
        return sum;
    }

}