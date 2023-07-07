package week06;



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
}