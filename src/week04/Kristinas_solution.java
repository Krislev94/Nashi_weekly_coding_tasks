package week04;

public class Kristinas_solution {

    public static void main(String[] args) {
        removeDuplicates("AAABBBTTAAAMMBKJTFN");
    }

    public static void removeDuplicates(String string){


        String result = "";

        for (int i = 0; i < string.length(); i++) {

            for (int j = string.length()-1; j >= 0 ; j--) {

                if (!result.contains(""+string.charAt(i))){
                    result += string.charAt(i);
                }
            }

        }
        System.out.println(result);


    }
}
