package week03;

public class DimaSolsW03 {
    public static void main(String[] args) {

        System.out.println(checkIfPrime(40));
        System.out.println(checkIfPrime(41));
        System.out.println(checkIfPrime(42));
        System.out.println(checkIfPrime(96));
        System.out.println(checkIfPrime(97));
        System.out.println(checkIfPrime(98));

        System.out.println(reverseNegative(-256));
        System.out.println(reverseNegative(256));


    }

    public static boolean checkIfPrime(int numberToCheck){
        for (int i = 2; i <= numberToCheck/2; i++){
            if (numberToCheck%i == 0){
                return false;
            }
        }
        return true;
    }

    public static int reverseNegative(int numberToReverse){
        if (numberToReverse < 0){
            StringBuilder res = new StringBuilder();
            res.append(numberToReverse * -1);
            res.reverse();
            int result = Integer.parseInt("-" + res);
            return result;
        }
        return numberToReverse;
    }


}
