package week04;

public class Kristinas_solution {

    public static void main(String[] args) {
        removeDuplicates("AAABBBTTAAAMMBKJTFN");
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
