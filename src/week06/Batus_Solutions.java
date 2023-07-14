package week06;

public class Batus_Solutions {

    public static void main(String[] args) {

        System.out.println(passwordValidation("a1234567889"));
        System.out.println(passwordValidation("NasHiBooom77+"));

        int[] crazyArray = {1,2,3,4,55,22,1453,1881,1081,1071,7714};
        System.out.println(FindSum(crazyArray));
        System.out.println("sumOfString(\"1den1es7\") = " + sumOfString("1den1es7"));

    }


    public static boolean passwordValidation(String password) {
        if (password.contains(" ") || password.length() < 6) {
            return false;
        }
        int isDigit = 0;
        int isSpecial = 0;
        int isupperCase = 0;
        int isLowerCase = 0;


            for (char each : password.toCharArray()) {
                if (Character.isDigit(each)) {
                    isDigit++;
                }
                if (!Character.isLetterOrDigit(each)) {
                    isSpecial++;
                }
                if (Character.isUpperCase(each)) {
                    isupperCase++;
                }
                if (Character.isLowerCase(each)) {
                    isLowerCase++;
                }

            }return isSpecial > 0 && isDigit > 0 && isupperCase > 0 && isLowerCase > 0;

    }

    public static int FindSum (int [] array){
        int maxNum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum){
                maxNum = array[i];
            }

        }
    return maxNum;
    }


    public static int sumOfString(String str){
        int result = 0;

        for (char each : str.toCharArray()) {
            if (Character.isDigit(each)){
                result += Integer.parseInt(each + "");
            }

        }
     return result;
    }

    }
