package week05;

public class Kristinas_Solutions {


    public static void main(String[] args) {
        System.out.println("reverseString(\"rectangle\") = " + reverseString("rectangle"));
        System.out.println("uniqueElement(\"aaanskkdjee\") = " + uniqueElement("aaanskkdjee"));
    }







    // String -- Find the unique
    //Write a return method that can find the unique characters from the String
    //Ex: unique("AAABBBCCCDEF") ==> "DEF";
    public static String uniqueElement(String string){

        char[] letters = string.toCharArray();
        String result = "";

        for (char each : letters) {
            int count = 0;
            for (char eachLetter : letters) {
                if (each == eachLetter){
                    count++;
                }
            }
            if (count == 1){
                result += each;
            }
        }

       return result;
    }



    //String -- Reverse
    //Write a return method that can reverse String
    //Ex: Reverse("ABCD"); ==> DCBA
    public static String reverseString(String string){

        String result = "";
        for(int i = string.length()-1; i >= 0; i--  ){
            result += string.charAt(i);
        }
        return result;
    }
}
