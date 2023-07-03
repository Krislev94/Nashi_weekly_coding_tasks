package week06;

public class Akylais_Solution {
    public static void main(String[] args) {
        System.out.println("validatePassword(\"Abcd123&\") = " + validatePassword("Abcd123&"));
    }

    public static boolean validatePassword(String password){
        if(password.length()<=6||password.contains(" ")){
            return false;
        }
        if(!password.matches(".*[A-Z].*")){
            return false;
        }
        if(!password.matches(".*[a-z].*")){
            return false;
        }
        if(!password.matches(".*\\d.*")){
            return false;
        }
        if(!password.matches(".*[@#$%^&+=].*")){
            return false;
        }
        return true;
    }

    public static int findMax(int[] array){
        int max=Integer.MAX_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(array[i]>max){;
            }
        }
        return max;
    }

    public static int findSum(String str){
       int sum=0;
        for (int i = 0; i <str.length() ; i++) {
            char c=str.charAt(i);
            if(Character.isDigit(c)){
                int digit=Character.getNumericValue(c);
                sum+=digit;
            }
        }
        return sum;
    }


}
