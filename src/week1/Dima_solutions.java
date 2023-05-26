package week1;

public class Dima_solutions {
    public static void main(String[] args) {
        System.out.println(identify(0));
        System.out.println(identify(2));
        System.out.println(identify(5));

        System.out.println(FinOrRa(15));
        System.out.println(FinOrRa(9));
        System.out.println(FinOrRa(10));
        System.out.println(FinOrRa(8));

    }


    // "Numbers -- odd & even" task solution
    public static String identify (int n){ // get the number to check as the method parameter and return the result as a String
        if (n == 0){                       // check the given number, if it's equals zero, return "zero"
            return "zero";
        } else if (n % 2 == 0) {           // check the given number if it is dividable by 2, means remainder equals zero
            return "Even";                 // return "Even"
        }
        return "Odd";                      // for the last case when the remainder of the given number divided by 2 not equal zero return "Odd"
    }

    // "FINRA" task solution
    public static String FinOrRa (int n){        // get the number to check as the method parameter and return the result as a String
        StringBuilder res = new StringBuilder(); // create StringBuilder object to store the resulting string
        if (n % 3 == 0){                        // check the given number if it is divisible by 3 or not
            res.append("FIN");                  // if true, append "FIN" to the result
        }
        if (n % 5 == 0){                        // check the given number if it is divisible by 5 or not
            res.append("RA");                   // if true, append "FIN" to the result
        }
        if (res.length() != 0){                 // check if some Strings were appended to the res object at the previous steps
            return res.toString();              // if true convert StringBuilder object to String and return this String
        }
        return "none";                          // in other cases return "none"
    }

    // "Numbers -- Divide without operator" task solution
    // A solution without any division, or multiplication, or modulus operations
    // Also this solution allows to select how mane decimals signs will you get

    public static double divideWoOperator(double number, double divisor, int numberOfDecimalPlaces) { // get the dividend, divisor, number of decimal signs and return the result as a double
        if (divisor == 0) { // dividing by zero equals infinity,so throw an exception
            throw new ArithmeticException("Divisor can not be 0");
        }

        if (number == 0) { // dividing of zero equals 0,so no need to run any code
            return 0;
        }

        StringBuilder res = new StringBuilder(); // create StringBuilder object to store the resulting string. String is the easiest way to store the result and append new decimals to the end
        String sign = ""; // assign blank by default

        if ((number < 0  && divisor > 0) || (number > 0  && divisor < 0)){
            sign = "-";                         //
            if (number < 0){
                number = Double.parseDouble(("" + number).substring(1));
            }
            if (divisor < 0){
                divisor = Double.parseDouble(("" +divisor).substring(1));
            }
        }

        return Double.parseDouble(sign + divideWoOperator(number, divisor, numberOfDecimalPlaces, res).toString());

    }

    public static StringBuilder divideWoOperator(double number, double divisor, int numberOfDecimalPlaces, StringBuilder res) {

        if (numberOfDecimalPlaces >= 0) {
            double remainder = number;
            int nextDigit = 0;
            double nextNumber = 0;

            while (remainder >= divisor) {
                remainder -= divisor;
                nextDigit = nextDigit + 1;
            }

            if (res.length() == 0) {
                res = res.append(nextDigit + ".");
            } else {
                res = res.append(nextDigit);
            }

            if (number >= 0) {
                for (int i = 1; i <= 10; i++) {
                    nextNumber += remainder;
                }
            }

            divideWoOperator(nextNumber, divisor, numberOfDecimalPlaces - 1, res);
        }

        return res;

    }

}
