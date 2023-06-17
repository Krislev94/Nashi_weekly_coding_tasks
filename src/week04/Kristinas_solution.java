package week04;


public class Kristinas_solution {

    public static void main(String[] args) {
        removeDuplicates("AAABBBTTAAAMMBKJTFN");

        frequencyOfCharacters("aaakkffrv");
    }


    public static void frequencyOfCharacters(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;

            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(j) == str.charAt(i)){
                    count++;
                }
            }

            if (result.contains(""+str.charAt(i))){
                continue;
            }

            result+= ""+str.charAt(i);
            result += count;

        }

        System.out.println(result);

    }

    public static boolean sameLetters(String string1, String string2){

        return false;


    }

    public static void removeDuplicates(String string){


        String result = "";

        for (int i = 0; i < string.length(); i++) {
                if (!result.contains(""+string.charAt(i))){
                    result += string.charAt(i);
                }
        }
        System.out.println(result);


    }
}
