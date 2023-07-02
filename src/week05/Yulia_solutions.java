package week05;

public class Yulia_solutions {

    public static void main(String[] args) {
        /*
        String -- Find the unique
Write a return method that can find the unique characters from the String
Ex: unique("AAABBBCCCDEF") ==> "DEF";
String -- Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
         */

        System.out.println(uniqueChar("fhkgkhaaahhjjj"));

        System.out.println(reverse("Anais"));
    }
    public static String uniqueChar(String str){
        char[] chars = str.toCharArray();
        String result = "";
        for (char each : chars) {
            int count = 0;
            for (char eachChar : chars){
                if(each == eachChar){
                    count++;

                }

        }
            if(count ==1){
                result += each;
            }
        }
        return result;
    }
    public static String reverse(String str){
        String result = "";
       for (int i = str.length()-1; i>=0; i--){
           result += str.charAt(i);

       }
       return result;
    }

}
