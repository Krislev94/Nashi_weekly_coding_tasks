package week04;

public class Akylais_Solution_W04 {
    public static void main(String[] args) {
        System.out.println("frequency(\"AAAAAAABBBBCCD\") = " + frequency("AAAAAAABBBBCCD"));
    }
    //Write a return method which finds out the frequency of character
    public static String frequency(String str){//str="AAAABBBCCDDD
        String result="";//3A3B2C3D
        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            for (int j = 0; j <str.length() ; j++) {
               if(str.charAt(i)==str.charAt(j)){
                   count++;
            }
            }
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result+=str.charAt(i);
            result+=count;

        }
        return result;
    }
}
