package week05;

public class Akylais_Solution_W05 {
    public static void main(String[] args) {
        System.out.println("unique(\"AAAABBBCCCDEF\") = " + unique("AAAABBBCCCDEF"));

        System.out.println("reverse(\"Akylai\") = " + reverse("Akylai"));
    }
    //Write a return method that can find the unique characters from the String
    //"AAAAAABBBBBBBBBCCCDEF==>"DEF

    public static String unique(String str){
       char[] chArray=str.toCharArray(); //[A,A,A,A,B,B,B,B,B,D,E,F]
        String result="";

        for (char eachCh:chArray) {
            int count=0;
     for (char eachChar:chArray)  {
         if(eachCh==eachChar){
             count++;
         }
        }
     if(count==1){
         result+=eachCh;
     }

        }
        return result;
    }

    public static String reverse(String str){

        String result="";
        for (int i =str.length()-1; i>=0 ; i--) {
            result+=str.charAt(i);
        }
        return  result;
    }
}
