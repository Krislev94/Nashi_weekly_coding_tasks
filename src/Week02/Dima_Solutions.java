package Week02;

public class Dima_Solutions {
    public static void main(String[] args) {

        /*
        Task 01
            Swap two variable values without using a third variable
        */
        System.out.println("\n==== Task 1 Solution ====");
        swap();

        System.out.println("\n==== Task 2 Solution ====");
        splitAllNumbersTo3Groups(100);

        System.out.println("\n==== Task 3 Solution ====");
        printConsecutiveNumbers(17);
    }

    static double a = 0.69;
    static double b = 1;
    public static void swap(){
        System.out.println("Initial pair: " + a + " : " + b);
        a = a + b;  // now value of variable a stores initial value of variable 'a' and initial value of variable 'b'
        b = a + b;  // now value of variable b stores initial value of variable 'a' and initial value of variable 'b' multiplied by 2
        a = b - a;  // to find a swapped value of variable 'a' subtract 'a' from 'b', so now value of variable 'a' equals initial value of variable  'b'
        b = b - 2 * a; // to find a swapped value of variable 'b' subtract initial value of variable b multiplied by 2, which is a now from b, now b equals initial ba
        System.out.println("Swapped pair: " + a + " : " + b);
    }

    public static void splitAllNumbersTo3Groups (int limitNumber){
        StringBuilder divBy15 = new StringBuilder();
        StringBuilder divBy3 = new StringBuilder();
        StringBuilder divBy5 = new StringBuilder();


        for (int i = 1; i <= limitNumber; i++){
            if (i % 15 == 0){
                divBy15.append(i + " ");
            } else if (i % 3 == 0) {
                divBy3.append(i + " ");
            } else if (i % 5 == 0) {
                divBy5.append(i + " ");
            }
        }

        System.out.println("Divisible by 15: " + divBy15.toString().trim() + "\n" +
                            "Divisible by 3: " + divBy3.toString().trim() + "\n" +
                            "Divisible by 5: " + divBy5.toString().trim());

    }

    public static void printConsecutiveNumbers (int limitNumber){
        StringBuilder cn = new StringBuilder();


        for (int i = 1; i <= limitNumber; i++){
            cn.delete(0,cn.length());
            if (i % 2 == 0){
                cn.append("Codility");
            }
            if (i % 3 == 0) {
                cn.append("Test ");
            }
            if (i % 5 == 0) {
                cn.append("Coders");
            }
            if (cn.length() == 0){
                System.out.println(i);
            } else {
                System.out.println(cn);
            }

        }

    }




}
