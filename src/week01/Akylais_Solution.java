package week01;

public class Akylais_Solution {
  public static String OddEven(int num){
        String result="";
       if(num % 2 == 0){
           result="even";
       }else if(num % 2 == 1){
           result="odd";
       }
       return result;
    }
    public static int divide(int dividend, int divisor){
        int q=0;
        boolean isDivPos=(dividend>=0)? true:false;
        boolean isDivisor=(divisor>=0)?true:false;
        if(divisor==0)
            try {
                throw new Exception("Zero as divisor!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);
        while (divisor<=dividend){
            dividend-=divisor;
            q++;
        }
        return (isDivPos^isDivisor)?-q:q;
    }
}
